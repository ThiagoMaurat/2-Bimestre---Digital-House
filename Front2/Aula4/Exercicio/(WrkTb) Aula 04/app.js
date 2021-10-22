let body = document.querySelector("body");
console.log(body);

let titulo = document.querySelector("h1");
console.log(titulo);

// com o .conteudo ele retorna o objeto, sem o ponto ele retorna o conteúdo
let containner = document.querySelector(".conteudo");
console.log(containner);

let containner2 = document.getElementsByClassName("conteudo");
console.log(containner2);

// ---------------------------------------
let card = document.querySelectorAll("article");

for (let elemento of card) {
  console.log(elemento);
}
