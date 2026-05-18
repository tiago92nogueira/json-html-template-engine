import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

fun main(args: Array<String>) {
    try {
        if (args.size < 3) {
            println("Erro: Faltam argumentos!")
            println("Uso: ./gradlew run --args=\"template.html input.json output.html\"")
            return
        }

        val templateFile = File(args[0])
        val jsonFile = File(args[1])
        val outputFile = File(args[2])

        if (!templateFile.exists()) throw Exception("Ficheiro template não encontrado: ${args[0]}")
        if (!jsonFile.exists()) throw Exception("Ficheiro JSON não encontrado: ${args[1]}")

        val templateContent = templateFile.readText()

        // Parser do JSON
        val jsonContent = jsonFile.readText()
        val jsonLexer = JSONLexer(CharStreams.fromString(jsonContent))
        val jsonTokens = CommonTokenStream(jsonLexer)
        val jsonParser = JSONParser(jsonTokens)
        val jsonTree = jsonParser.file()

        if (!validate(jsonTree))  {
            println("Erro: JSON inválido — chaves duplicadas detetadas!")
            return
        }

        val jsonAST: JObject = jsonTree.toAST()

        val interpreter = Interpreter(jsonAST)

        val regex = Regex("\\{\\{(.*?)\\}\\}", RegexOption.DOT_MATCHES_ALL)

        val finalResult = regex.replace(templateContent) { matchResult ->
            val scriptCode = "{{" + matchResult.groupValues[1] + "}}"

            try {
                val lexer = TemplateLexer(CharStreams.fromString(scriptCode))
                val tokens = CommonTokenStream(lexer)
                val parser = TemplateParser(tokens)
                val tree = parser.script()

                val ast: Script = tree.toAST()

                interpreter.execute(ast.sequence)
            } catch (e: Exception) {
                " [[ Erro no Script: ${e.message} ]] "
            }
        }

        outputFile.writeText(finalResult)
        println("Sucesso! O ficheiro de output foi gerado em: ${args[2]}")

    } catch (e: Exception) {
        println("\n--- ERRO DE EXECUÇÃO ---")
        e.printStackTrace()
    }
}