const colors = ['#FF5733', '#DAF7A6', '#FFC300', '#C70039', '#900C3F', '#581845'];

function changeBgColor() {
  const body = document.getElementsByTagName('body')[0];
  const chosenColor = colors[Math.floor(Math.random() * colors.length)];
  document.getElementById('chosenColor').innerHTML = chosenColor;
  body.style.backgroundColor = chosenColor;
}

export function Button(){
  return (
  <div>
   <button onClick={changeBgColor}>Change color!</button>
      <p id="chosenColor"></p>
  </div>
  )
}