import React, { createContext, useState } from "react";
import jwtDecode from "jwt-decode";

// context
export const DataContext = createContext({});

// context provider (dá o nome que quiser)
export const DataProvider = ({ children }) => {
  const [userData, setUserData] = useState('');

  console.log(jwtDecode)
  const storeUserData = (jwt) => {
    var jwtDecoded = jwtDecode(jwt);
    console.log(jwtDecoded)

    // .user = chave do json retornado pelo backend
    // user.id  pega os dados do usuário do json . user.username emptyCells: 
    // {\"id\":1,\"username\":\"user\",\"email\":\"user@mail.com\",\"roles\":[\"ROLE_USER\"]}
    var user = jwtDecoded.user;
    // String JSON transformada em objeto Javascript
    user = JSON.parse(user);

    setUserData({  // interrogação para aceitar valor nulo
      id: user?.id,
      name: user?.username,
      email: user?.email,
      token: jwt
    })
  }

  return (
    <DataContext.Provider value={{
      userData,
      storeUserData
    }}>
      {children}
    </DataContext.Provider>
  );
}

// método para adicionar coisas ao carrinho