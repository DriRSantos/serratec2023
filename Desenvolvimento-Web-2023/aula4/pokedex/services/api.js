import { axios } from 'axios';

export const pokeAi = axios.create({
  baseURL: "https://pokeapi.co/api/v2"
});