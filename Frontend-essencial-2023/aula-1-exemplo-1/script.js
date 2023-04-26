function validateUser(e){
    e.preventDefault();
    
    var nameInput = document.getElementById("nameInput").value;
    var passwordInput = document.getElementById("passwordInput").value;
    if(name == "drineves" && passowrd == "dri4ever"){
        document.getElementById("status").innerHTML = "Olá, Dri! Você está logada!";
    } else {
      document.getElementById("status").innerHTML = "Senha incorreta, tente novamente...";
    } 

    function changeTitle(){
      var titulo = document.getElementById("h1")[0];
      titulo.innerHTML = "Mudei!"
    }
}