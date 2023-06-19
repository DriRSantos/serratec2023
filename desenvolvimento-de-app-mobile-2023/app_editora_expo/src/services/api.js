import { axios } from 'axios';

export const picsumApi = axios.create({
  baseURL: "https://picsum.photos/v2/list"
});