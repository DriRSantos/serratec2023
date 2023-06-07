import { useState } from "react";

function App2() {  // componente funcional
  const [counter, setCounter] = useState(0);
  const [name, setName] = useState('Dri');

  function handleNameChange(){
    var name = "Rodrigo Oliveira";
    setName(name)
  }

  function handleIncrement(){
    var newCounter = counter + 1;
    setCounter(newCounter)
    console.log(newCounter)  // cuidado se chamar este valor, pois não será o esperado
  }
  
  return (
    <div>
      <h1>Functional component</h1>
    <h2>{name}</h2>  
    <button onClick={handleNameChange}>Name change functional component</button>

     <h2>{counter}</h2>  
     <button onClick={handleIncrement}>Counter functional component</button>
      </div>
  );
}

export default App2;