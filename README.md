# 🚀 JSON & HTML Template Engine

Um motor de templates e interpretador de scripting desenvolvido em **Kotlin** utilizando **ANTLR4**. Este projeto foi desenhado para ler dados estruturados a partir de um ficheiro JSON e utilizá-los para renderizar dinamicamente lógica de programação (ciclos, condições e expressões matemáticas) embutida em ficheiros HTML.


## 🛠️ Tecnologias Utilizadas

* **Kotlin** (Linguagem principal)
* **ANTLR v4** (Gerador de Lexers e Parsers)
* **Gradle** (Gestor de dependências e automação de build)

---

## 📝 Demonstração de Uso

### 1. Ficheiro de Dados (`input.json`)
```json
{
  "user": "Engenheiro",
  "notaMinima": 50,
  "numbers": [5, 19, 12, 6, 0, 13],
  "perfil": {
    "idade": 23,
    "curso": "Engenharia"
  }
}
2. Ficheiro de Template (template.html)
HTML
<html>
<body>
    <h1>Olá, {{ print user }}!</h1>

    <h2>Filtragem de Números (Maiores que 10)</h2>
    <ul>
    {{
    foreach number in numbers
        if (number > 10) then
            print number
        endif
    endforeach
    }}
    </ul>

    <h2>Dados do Perfil</h2>
    {{
    foreach info in perfil
        print info
    endforeach
    }}
</body>
</html>
3. Ficheiro de Resultado (output.html)
HTML
<html>
<body>
    <h1>Olá, Engenheiro!</h1>

    <h2>Filtragem de Números (Maiores que 10)</h2>
    <ul>
    19
    12
    13
    </ul>

    <h2>Dados do Perfil</h2>
    23
    Engenharia
</body>
</html>
⚙️ Características da Linguagem de Scripting
A gramática desenvolvida suporta as seguintes operações dentro dos blocos {{ }}:

Declaração e Atribuição: total = 0

Expressões Matemáticas: Suporte a parentetização e precedência de operadores (+, -, *, /, %).

Estruturas Condicionais: Blocos if (condicao) then ... else ... endif.

Ciclos de Repetição: Iteração sobre Arrays e Sub-objetos JSON usando foreach item in colecao ... endforeach.

Saída de Dados: Instrução print para injetar valores diretamente no documento HTML.

🚀 Como Executar
Para rodar o projeto localmente através do terminal, utiliza o comando do Gradle passando os caminhos do template, do JSON de entrada e do HTML de saída como argumentos:

Bash
./gradlew run --args="template.html input.json output.html"
