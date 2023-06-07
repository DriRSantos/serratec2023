import { useState, useEffect } from "react";
import './style.css'

// export const Home = () => {
//   return (
//     <h1>Hello Word</h1>
//   )
// }  pode fazer assim ao invés do debaixo

export function Home(){
  const [count, setCount] = useState(0)
  // const [name, setName] = useState()  convenção
  // const [adress, setAdress] = useState()

  // tem o efeito do didMount
  useEffect(() => {
    if(count != 0) { // para não mostrar o alert quando count for 0
       alert("Carreguei")
    }
  }, [count])  // passando o parametro se comporta também como didUpdate

  return (
    <>
    <h1>Contador</h1>
    <h2>{count}</h2>
    <button onClick = {() => setCount(count + 1)}>Aumentar</button>
    </>  // coloca a arrow function para ele não rodar sem nada
  )
}