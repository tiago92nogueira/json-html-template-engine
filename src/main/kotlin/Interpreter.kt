class Interpreter(jsonData: JObject) {
    private val scope = mutableMapOf<String, Any>()

    init {
        for (par in jsonData.pares) {
            scope[par.key] = paraTipoNativo(par.content)
        }
    }

    // auxiliar para converter nos da ASTJSON para tipos kotlin nativos
    private fun paraTipoNativo(value: JSONValue): Any {
        return when (value) {
            is JString -> value.string
            // converte double para int se n tiver casas decimais
            is JNumber -> if (value.num % 1 == 0.0) value.num.toInt() else value.num
            is JBoolean -> value.boolean
            // se for array converte recursivamente cada elemento
            is JArray -> value.values.map { paraTipoNativo(it) }
            // se for um json dentro de json converte para Map
            is JObject -> value.pares.associate { it.key to paraTipoNativo(it.content) }
        }
    }

    fun execute(instructions: List<Instruction>): String {
        val output = StringBuilder()
        for (inst in instructions) {
            when (inst) {
                is Assign -> scope[inst.id] = evaluate(inst.expression)
                is Print -> output.append(evaluate(inst.expression).toString() + "\n")
                is IfElse -> {
                    if (isTrue(evaluate(inst.guard))) {
                        output.append(execute(inst.thenSequence))
                    } else {
                        inst.elseSequence?.let { output.append(execute(it)) }
                    }
                }
                is ForEach -> {
                    val valorContexto = scope[inst.collection]
                        ?: throw Exception("'${inst.collection}' não está definido")

                    val list: List<*> = when (valorContexto) {
                        is List<*> -> valorContexto                 // sub objects json vem em formato map
                        is Map<*, *> -> valorContexto.values.toList()
                        else -> throw Exception("'${inst.collection}' não é um array nem um sub-objeto válido")
                    }

                    for (item in list) {
                        scope[inst.item] = item!!
                        output.append(execute(inst.body))
                    }
                }
            }
        }
        return output.toString()
    }

    private fun evaluate(expr: Expression): Any {
        return when (expr) {
            is IntLiteral -> expr.value
            is StringLiteral -> expr.value
            is BooleanLiteral -> expr.value
            is Variable -> scope[expr.id] ?: throw Exception("Variável '${expr.id}' não definida.")
            is ParenthesizedExpression -> evaluate(expr.inner)
            is BinaryExpression -> {
                val left = evaluate(expr.left)
                val right = evaluate(expr.right)
                computeBinary(left, expr.operator, right)
            }
        }
    }

    private fun isTrue(value: Any): Boolean = when (value) {
        is Boolean -> value
        is Int -> value != 0
        is Double -> value != 0.0
        is String -> value.isNotEmpty()
        else -> false
    }

    private fun computeBinary(left: Any, op: String, right: Any): Any {
        val l = (left as? Number)?.toInt() ?: 0
        val r = (right as? Number)?.toInt() ?: 0

        return when (op) {
            "+" -> l + r
            "-" -> l - r
            "*" -> l * r
            "/" -> if (r != 0) l / r else 0
            "==" -> left == right
            "!=" -> left != right
            ">" -> l > r
            "<" -> l < r
            ">=" -> l >= r
            "<=" -> l <= r
            else -> throw Exception("Operador '$op' não suportado.")
        }
    }
}