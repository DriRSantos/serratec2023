let names = ["drirsantos", "alexandre-vpacheco", "BrenoRaeder", "JoiceLisboa", "filipe-oliv95", "S4nt1ag"];

window.onload = async function(){
    for await(var name of names){
    const data = await fetch(`https://api.github.com/users/${name}`);
    const json = await data.json();
    console.log(json);

   const img = document.createElement('img');
    img.setAttribute('src', json.avatar_url);

    const nome = document.createElement('h2');
    nome.innerText = json.name;

    const date = document.createElement('p');
    const createdDate =  new Date(json.created_at);
    const formattedDate = createdDate.toLocaleDateString('pt-BR', {
      year: 'numeric',
      month: 'long',
      day: 'numeric'
    });
    date.innerHTML = "Criado em: " + formattedDate;

    const pessoasContainer = document.getElementById('pessoasContainer');
    pessoasContainer.appendChild(img);
    pessoasContainer.appendChild(nome);
    pessoasContainer.appendChild(date);
  
    // const btn = document.createElement("button");
    // btn.innerHTML = "Hello";
    // document.body.appendChild(btn);
  }
}

const colors = ["red", "blue", "green", "pink", "gray", "Crimson", "orange", "purple", "Aqua", "yellow"]
var chosenColor = ""

function changeBgColor(){
  const body = document.getElementsByTagName("body")[0];
  chosenColor = colors[Math.floor(Math.random() * 10) + 1]
  document.getElementById("chosenColor").innerHTML = chosenColor;
  body.style.backgroundColor = chosenColor;
}

// const previewElem = document.getElementById('preview')

// async function shareScreen(){
//   previewElem.srcObject = await navigator.mediaDevices.getDisplayMedia({
//     video: { cursor: 'always'} ,
//     audio: true
//   })
// }