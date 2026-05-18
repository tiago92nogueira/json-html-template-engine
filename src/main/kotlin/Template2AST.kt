fun TemplateParser.ScriptContext.toAST(): Script {
    val instructions = this.sequence.map { it.toAST() }
    return Script(instructions)
}

fun TemplateParser.InstructionContext.toAST(): Instruction {
    return when (val firstChild = this.getChild(0)) {
        is TemplateParser.AssignContext -> firstChild.toAST()
        is TemplateParser.PrintContext -> firstChild.toAST()
        is TemplateParser.IfContext -> firstChild.toAST()
        is TemplateParser.ForeachContext -> firstChild.toAST()
        else -> throw Exception("Instrução desconhecida ou comentário na linha ${this.start.line}")
    }
}

fun TemplateParser.AssignContext.toAST(): Assign {
    return Assign(
        id = this.ID().text,
        expression = this.expression().toAST()
    )
}

fun TemplateParser.PrintContext.toAST(): Print {
    return Print(expression = this.expression().toAST())
}

fun TemplateParser.IfContext.toAST(): IfElse {
    val guard = this.guard.toAST()
    val thenSeq = this.sequence.map { it.toAST() }

    val elseSeq = if (this.alternative.isNotEmpty()) {
        this.alternative.map { it.toAST() }
    } else null

    return IfElse(guard, thenSeq, elseSeq)
}

fun TemplateParser.ForeachContext.toAST(): ForEach {
    return ForEach(
        item = this.ID(0).text,
        collection = this.ID(1).text,
        body = this.sequence.map { it.toAST() }
    )
}

fun TemplateParser.ExpressionContext.toAST(): Expression {
    return when {
        this.OPEN() != null && this.inner != null ->
            ParenthesizedExpression(this.inner.toAST())

        this.left != null && this.right != null -> {
            val op = this.operator?.text ?: this.getChild(1).text
            BinaryExpression(
                left = this.left.toAST(),
                operator = op,
                right = this.right.toAST()
            )
        }

        this.id != null -> Variable(this.id.text)

        this.value != null -> IntLiteral(this.value.text.toInt())

        this.s != null -> StringLiteral(this.s.text.removeSurrounding("\""))

        else -> throw Exception("Expressão não suportada na linha ${this.start.line}")
    }
}