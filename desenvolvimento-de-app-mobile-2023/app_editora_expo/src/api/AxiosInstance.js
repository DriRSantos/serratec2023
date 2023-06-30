import axios from 'axios';
// import { AsyncStorage } from 'react-native';

export const AxiosInstance = axios.create({
  baseURL: "http://192.168.1.3:8080/api"  // localHost, não esquecer ipconfig
});

// // testar
// AxiosInstance.interceptors.request.use((config) => {
//   const token = AsyncStorage.getItem("user_token");
//   if (token) {
//     config.headers.Authorization = `Bearer ${token}`;
//   }
//   return config;
// });

// TEM QUE ALTERAR O NOME CONFORME O NOME DA CONST AI EM CIMA, se fosse API, ficaria api.interceptors... ou gitAPI, gitAPI.interceptors...
// api.interceptors.request.use((config) => {
//   const accessToken = AsyncStorage.getItem("accessToken");
//   if (accessToken) {
//     config.headers.Authorization = `Bearer ${accessToken}`;
//   }
//   return config;
// });