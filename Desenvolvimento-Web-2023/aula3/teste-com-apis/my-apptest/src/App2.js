import './App.css';
import { useState, useEffect } from "react";
import { CardCountries } from "./components/CardCountries";

export function App2() {
  const [countries, setCountries] = useState([]);

  useEffect(() => {
    const getCountries = async () => {
      const newCountries = await fetch("https://restcountries.com/v3.1/lang/portuguese");
      const countriesJson = await newCountries.json();
      setCountries(countriesJson);

      // for await (let country of countries){
      //   const countryName = await fetch(`https://restcountries.com/v3.1/lang/${countrie.name}`);
      // }
    }
    getCountries();
  }, []) // tem que ter dependência do array para rodar uma vez

  // exemplo utilizando then
  function fetchData() {
    const data = fetch("https://restcountries.com/v3.1/lang/portuguese").then((response) => {
      return response.json().then(json => {
        return console.log(json)
      })
    });
    console.log(data)
  }

  return (
    <div className="container">
      {/* {!countries ? ( <h1>Loading...</h1> ) : ( */}
      <div className="dog-card-container">
        <h1 className="componentDiMountAPIDogs">List of countries that speak portuguese (Function Component) </h1>
        {countries.map((country) => (
          <CardCountries key={country.name.common} {...country} />
        ))}
        <button onClick={fetchData}>Buscar Dados</button>
      </div>
      {/* ) */}
      {/* } */}
    </div>
  );
}