fun JSONParser.FileContext.toAST(): JObject {
    return when (val v = this.value()) {
        is JSONParser.ObjValContext -> v.obj().toAST()
        else -> throw Exception("O JSON precisa de começar com um Objeto '{}'.")
    }
}

fun JSONParser.ValueContext.toAST(): JSONValue {
    return when (this) {
        is JSONParser.StringValContext -> JString(this.STRING().text.removeSurrounding("\""))
        is JSONParser.NumberValContext -> JNumber(this.NUMBER().text.toDouble())
        is JSONParser.BoolValContext   -> JBoolean(this.BOOLEAN().text.toBoolean())
        is JSONParser.ArrayValContext  -> this.array().toAST()
        is JSONParser.ObjValContext    -> this.obj().toAST()
        else -> throw Exception("Tipo de JSON desconhecido na linha ${this.start.line}")
    }
}

fun JSONParser.ArrayContext.toAST(): JArray {
    return JArray(this.value().map { it.toAST() })
}

fun JSONParser.ObjContext.toAST(): JObject {
    return JObject(this.par().map { it.toAST() })
}

fun JSONParser.ParContext.toAST(): JPar {
    return JPar(
        key = this.STRING().text.removeSurrounding("\""),
        content = this.value().toAST()
    )
}