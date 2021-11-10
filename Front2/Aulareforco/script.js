//Previna a página de ser recarregada quando houver o submit utilizando preventDefault().
const prevenir = document.getElementById('prevenir');
prevenir.addEventListener('submit', function(event){
    event.preventDefault();
});

//Mostre um alerta na página quando a tela terminar de ser carregada.
window.onload = function(){
    alert('Página carregada');
}

//Adicione uma cor a um texto quando o mouse ficar acima do mesmo e outra cor quando ele sair do mesmo
const texto = document.getElementById('h1zin');
texto.addEventListener('mouseover', function(){
    texto.style.color = 'red';
});
texto.addEventListener('mouseleave', function(){
    texto.style.color = 'blue';
});

// Faça um trecho de código que utilize algum evento de teclado, esse evento irá escrever o conteúdo do 
//input em uma tag p e logo abaixo o número de vezes que esse evento foi chamado. 
//Exemplo: <p>futebol</p> <p>7</p> .
let input = document.getElementById('vezes');
let p2 = document.createElement('p');
let p = document.createElement('p');
let formzin = document.getElementById('prevenir');
let contador = 0;
formzin.addEventListener('keyup', function(){
    if (p.innerHTML = input.value){
        contador++;
        p2.innerHTML = contador;
    }
    formzin.appendChild(p);    
    p2.innerHTML = contador;
    formzin.appendChild(p2);
});




    
