import { useState, useEffect } from 'react';
import './Card.css';

export function Card(){
const [users, setUsers] = useState([])

const nomes = ["drirsantos", "alexandre-vpacheco", "BrenoRaeder", "JoiceLisboa", "filipe-oliv95", "S4nt1ag"]
useEffect(()=>{
  async function fetchData(){
    var userArray = []
    for await (var nome of nomes){
      let data = await fetch(`https://api.github.com/users/${nome}`)
      let user = await data.json()
      userArray.push({nome: user.name, url: user.avatar_url})
    }
    setUsers(userArray)
  }
  fetchData()
})

  return (
    <div>
      {users.map(user => {
        return (
          <div>
            <h1>{user.nome}</h1>
            <img src = {user.url} alt = "Imagens dos usuários"/>
          </div>
        )
      })}
      </div>
  )
}