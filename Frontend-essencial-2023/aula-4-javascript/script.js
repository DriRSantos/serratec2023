function validateForm() {
    var nome = document.getElementById("name").value
    var senha = document.getElementById("password").value

    if (nome == 'dri' && senha == 'dri123') {
        alert("Olá, Dri")
    }
    else {
        alert("SENHA INCORRETA")
    }
}

document.getElementById("name").value = "dri" // só vai conseguir acessar este arquivo, se ele já tiver sido montado
// na tela, por isso a importância do script.js no final ou no início com defer
window.onload = function () {
    document.getElementById("testBtn").onmouseover = function () { alert("Foi!") }
}

var flag = true;
function toggle() {
    flag = !flag; // macete para quando quiser trabalhar com esta troca de estados
    document.getElementById("value").innerHTML = flag.toString();
}

var pessoa = { // objeto criado com atributos
    nome: "Periclao",
    sobrenome: "Silva",
    idade: 48,
    endereco: {
        rua: "São Sebastião",
        numero: 5648,
        cidade: "Petrópolis",
        UF: "RJ",
        pais: "Brasil"
    },
    hobbies: [
        "Pagode",
        "Samba",
        "Partido Alto"
    ],
    tocar: function () { return "Paracundê" } 
}

var numbers = [0, 1, 2, 3, 4, 5, 6]
function printArray() {
    var result = [];
    for (var i = 0; i < numbers.length; i++) {
      result.push(numbers[i]);  // adiciona os valores do vetor no resultado
    }
    return result;
  }
  var numbersElement = document.getElementById("numbers"); // append dos valores no numbers do HTML
  var numbersArray = printArray();
  numbersElement.innerHTML = numbersArray.join(", ");



// console.log("Executei!");