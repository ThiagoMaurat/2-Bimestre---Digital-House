//Usado para emitir avisos
        alert("href: https: //www.youtube.com/")

        //Devolve um valor booleano
        if (confirm("Gostaria de continuar para o site?")) {
            alert("É um prazer tê-lo conosco!")
        } else {
            alert("É uma pena... Fico muito triste.")
        }

        //Recebe um texto
        let nome = prompt("Digite o seu nome:")

        alert("Seja bem-vindo " + nome)

        let idade = prompt("Digita a sua idade:")

        if (parseInt(idade) >= 18) {
            alert("Você já pode dirigir")
        } else {
            alert("Espere mais um pouco para pilotar um carro.")
        }

        //array com 2 itens, o nome = 0 e a idade = 1
        let perfil = [nome, idade]

        //for in serve para iterar com as informações dentro de um array
        //Itera com o indíce da array
        //for (let i = 0; i <= perfil.length; i++)
        for (indice in perfil) {
            alert(perfil[indice])
        }

        //Itera com o conteúdo do objeto/variável
        for (dados of perfil) {
            alert(dados)
        }
