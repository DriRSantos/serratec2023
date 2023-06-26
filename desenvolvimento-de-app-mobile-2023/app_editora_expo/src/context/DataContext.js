import React, { createContext, useState, useEffect } from "react";
import jwtDecode from "jwt-decode";
import { AxiosInstance } from '../api/AxiosInstance';  // make sure the path to AxiosInstance is correct


// context
export const DataContext = createContext({});

// context provider (dá o nome que quiser)
export const DataProvider = ({ children }) => {
  const [userData, setUserData] = useState('');
  const [publisherData, setPublisherData] = useState([]);
  const [bookData, setBookData] = useState([]);
  const [authorData, setAuthorData] = useState([]);

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

  useEffect(() => {
    const fetchData = async () => {
      try {
        const publisherResponse = await AxiosInstance.get('/editoras', {
          headers: { Authorization: `Bearer ${userData?.token}` },
        });
        setPublisherData(publisherResponse.data);

        const booksResponse = await AxiosInstance.get('/livros', {
          headers: { Authorization: `Bearer ${userData?.token}` },
        });
        setBookData(booksResponse.data);

        const authorResponse = await AxiosInstance.get('/autores', {
          headers: { Authorization: `Bearer ${userData?.token}` },
        });
        setAuthorData(authorResponse.data);
      }
      catch (error) {
        console.log('Error fetching data: ' + error);
      }
    };

    if (userData?.token) {
      fetchData();
    }
  }, [userData?.token]);


  return (
    <DataContext.Provider value={{
      userData,
      storeUserData,
      publisherData,
      setPublisherData,
      bookData,
      setBookData,
      authorData,
      setAuthorData,
    }}>
      {children}
    </DataContext.Provider>
  );
}

// método para adicionar coisas ao carrinho