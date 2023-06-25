import axios from 'axios';

export const countriesAPI = axios.create({
  baseURL: "https://restcountries.com/v3.1",
  // headers: {
  //   Authorization: 'passa o token aqui',
  // }
})

export const magicAPI = axios.create({
  baseURL: "https://api.magicthegathering.io/v1/"
})