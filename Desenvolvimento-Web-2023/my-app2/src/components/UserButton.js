import { useState } from 'react'

export function UserButton(){
  const [nameComplete, updateName] = useState('Adriana dos Santos Neves')
  
  function changeName(){
    updateName('Dri')
    console.log(updateName)
  }

  return (
    <div>
      <h1> {nameComplete} </h1>
      <button onClick={changeName}>Teste!</button>
    </div>
  );
}