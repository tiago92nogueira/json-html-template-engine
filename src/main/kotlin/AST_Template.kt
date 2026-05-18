data class SourceRange(val start: Int, val stop: Int, val line: Int)

interface ASTNode {
    val range: SourceRange?
}

data class Script(
    val sequence: List<Instruction>,
    override val range: SourceRange? = null
) : ASTNode


sealed interface Instruction : ASTNode

// assign ID EQUAL expression
data class Assign(
    val id: String,
    val expression: Expression,
    override val range: SourceRange? = null
) : Instruction

// print expression;
data class Print(
    val expression: Expression,
    override val range: SourceRange? = null
) : Instruction


data class IfElse(
    val guard: Expression,
    val thenSequence: List<Instruction>,
    val elseSequence: List<Instruction>? = null, // null se não houver else
    override val range: SourceRange? = null
) : Instruction

data class ForEach(
    val item: String,
    val collection: String,
    val body: List<Instruction>,
    override val range: SourceRange? = null
) : Instruction



sealed interface Expression : ASTNode

data class IntLiteral(val value: Int, override val range: SourceRange? = null) : Expression

data class BooleanLiteral(val value: Boolean, override val range: SourceRange? = null) : Expression
data class StringLiteral(val value: String, override val range: SourceRange? = null) : Expression
data class Variable(val id: String, override val range: SourceRange? = null) : Expression

// Representa left op right
data class BinaryExpression(
    val left: Expression,
    val operator: String, // ex: "+", "-", "==", "<"
    val right: Expression,
    override val range: SourceRange? = null
) : Expression

data class ParenthesizedExpression(
    val inner: Expression,
    override val range: SourceRange? = null
) : Expression



