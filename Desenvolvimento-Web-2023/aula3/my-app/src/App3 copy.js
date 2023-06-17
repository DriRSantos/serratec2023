import React, { useState, useEffect } from 'react';

export function App3Copy(props) { // recebe aqui a propriedade passada pelo pai
  const [users, setUsers] = useState([]);

  console.log(props) // esse props vira um Objeto, fazendo este console e verificando no console, aparece 
  // como Object{ name: "Dri" }. Ele vira um objeto pois poderia ter outras coisas, pode passar age, address
  // e o que mais desejar do Objeto

  useEffect(() => {
    // console.log(users)  // aqui renderiza em branco pois o users está vazio no State

    const fetchData = async () => {
      const fetchUsers = await fetch('https://api.github.com/users');
      const usersJson = await fetchUsers.json();
      console.log(usersJson)  // aqui ele mostra o usersJson renderizado no console
      setUsers({ users: usersJson })
    }
    fetchData();
  }, []);

  return (
    <div>
      <h1>Hello, {props.name}</h1> {/* passa simplemente o name aqui dentro, sem props */}
      <h1>Exemplo do componentDidMount</h1>
      {
        users.map(user => {
          return <h1 key={user.id}>{user.login}</h1>
        })
      }
    </div>
  );
}