import './App.css';
import { useState, useEffect } from "react";
import { CardCountries } from "./components/CardCountries";
import { countriesAPI } from './services/api';

export function App3() {
  const [countries, setCountries] = useState([]);
  const [countriesEng, setCountriesEng] = useState([]);

  useEffect(() => {
    const getCountries2 = async () => {
      const { data: portuguese } = await countriesAPI.get('/lang/portuguese');
      const { data: english } = await countriesAPI.get('/lang/english');
      console.log(portuguese)
      console.log(english)
      setCountries(portuguese)
      setCountriesEng(english)
    }
    getCountries2();
  }, []);

  return (
    <div className="container">
      {/* {!countries ? ( <h1>Loading...</h1> ) : ( */}
      <div className="dog-card-container">
        <h1 className="componentDiMountAPIDogs">List of countries that speak portuguese (Function Component with axios) </h1>
        {countries.map((country) => (
          <CardCountries key={country.name.common} {...country} />
        ))}
        <h1 className="componentDiMountAPIDogs">List of countries that speak english (Function Component with axios) </h1>
        {countriesEng.map((country) => (
          <CardCountries key={country.name.common} {...country} />
        ))}
        {/* <button onClick={() => getCountries2()}>Buscar Dados</button> */}
      </div>
      {/* ) */}
      {/* } */}
    </div>
  );
}