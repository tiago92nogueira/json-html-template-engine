📝 Tutorial de Utilização

1️⃣ Criar o ficheiro JSON

O ficheiro JSON contém os dados que serão utilizados no template.

input.json
{
  "user": "Engenheiro",
  "notaMinima": 50,
  "numbers": [5, 19, 12, 6, 0, 13],
  "perfil": {
    "idade": 23,
    "curso": "Engenharia"
  }
}

2️⃣ Criar o Template HTML

O template HTML pode conter blocos de scripting delimitados por {{ }}.

template.html
<html>
<body>

    <h1>Olá, {{ print user }}!</h1>

    <h2>Números Maiores que 10</h2>

    <ul>
    {{
    foreach number in numbers
        if (number > 10) then
            print number
        endif
    endforeach
    }}
    </ul>

    <h2>Perfil</h2>

    {{
    foreach info in perfil
        print info
    endforeach
    }}

</body>
</html>

3️⃣ Executar o Projeto

Executar o seguinte comando no terminal:

./gradlew run --args="template.html input.json output.html"


4️⃣ Resultado Gerado

O motor processa o template e gera automaticamente o HTML final.

output.html
<html>
<body>

    <h1>Olá, Engenheiro!</h1>

    <h2>Números Maiores que 10</h2>

    <ul>
    19
    12
    13
    </ul>

    <h2>Perfil</h2>

    23
    Engenharia

</body>
</html>
