// Nome completo
// Deve conter ao menos duas palavras
// O campo não pode ter mais de 150 caracteres
// O campo não pode ser vazio
// Não pode ter números
const teste = document.querySelector("#inputnome");
const formzin = document.querySelector("#formzin");
const pzin = document.createElement("p");
const pzin2 = document.createElement("p");
const pzin3 = document.createElement("p");
const pzin4 = document.createElement("p");
const pzin5 = document.createElement("p");
const butonzin = document.querySelector("#butonzin");
const inputzin2 = document.querySelector("#inputzin2");


butonzin.addEventListener("click", function (event) {
  event.preventDefault();
  
  let dividir = teste.value.split(" ");
  console.log(dividir);

  if (dividir.length < 2) {
    pzin.textContent = "Nome inválido";
    formzin.appendChild(pzin);
  } else {
    pzin.textContent = "Nome válido";
    formzin.appendChild(pzin);
  }

  if (teste.value.length > 150) {
    pzin2.textContent = "Maior que 150 caracteres";
    formzin.appendChild(pzin2);
  } else {
    pzin2.textContent = "Menor que 150 caracteres";
    formzin.appendChild(pzin2);
  }

  if (teste.value == "") {
    pzin3.textContent = "Insira caracteres";
    formzin.appendChild(pzin3);
  } else {
    pzin3.textContent = "Caracteres inseridos";
    formzin.appendChild(pzin3);
  }

  if ((/\d/.test(teste.value))) {
    pzin4.textContent = "Não pode ter números";
    formzin.appendChild(pzin4);
  } else {
    pzin4.textContent = "Nome válido";
    formzin.appendChild(pzin4);
  }

  // Deve ter o formato 99 99999-9999
//   if (inputzin2.value == (/\d{2}" "\d{5}-\d{4}/)) {
    if ((/\d{2}\s\d{5}-\d{4}/).test(inputzin2.value)) {
    pzin5.textContent = "Número válido";
    formzin.appendChild(pzin5);
  } else {
    pzin5.textContent = "Número inválido";
    formzin.appendChild(pzin5);
  }
});




//selecionar apenas 4 checkbo
let selection = document.getElementsByClassName('testzin');
for (let i = 0; i < selection.length; i++) {
     
    selection[i].addEventListener('change', function() {
        if (this.checked) {
            let count = 0;
            for (let j = 0; j < selection.length; j++) {
                if (selection[j].checked) {
                    count++;
                }
            }
            if (count > 4) {
                this.checked = false;
            }
        }
    });
}
 



