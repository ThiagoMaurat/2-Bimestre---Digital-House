let titulo = document.querySelector("h1");
titulo.style.color = "black";
titulo.addEventListener("mouseover", colorchance);

function colorchance() {
    titulo.style.color = "black";
}

titulo.addEventListener("mouseout", (event) => {
    titulo.style.color = "white";
    console.log(`Aconteceu um ${event.type}`);
});

let fild1 = document.querySelector("#fild1");
let fild2 = document.querySelector("#fild2");
let btn = document.querySelector("#btn");

btn.addEventListener("click", (event) => {
    console.log(event);
    event.preventDefault();
    console.log(`Aconteceu um ${event.type}`);
});

let li = document.createElement("li");
li.innerText = fild1.value;
list.appendChild(li);
