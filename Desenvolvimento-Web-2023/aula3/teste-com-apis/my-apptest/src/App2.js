import './App.css';
import { useState, useEffect } from "react";
import { CardCountries } from "./components/CardCountries";

export function App2(){
  const [countries, setCountries] = useState([]);

useEffect(() => {
  const getCountries = async() => {
    const newCountries = await fetch("https://restcountries.com/v3.1/lang/portuguese");
    const countriesJson = await newCountries.json();
    setCountries(countriesJson);
 }

  getCountries();
}, []) // tem que ter dependência do array para rodar uma vez

 return (
  <div className="container">
        {/* {!countries ? ( <h1>Loading...</h1> ) : ( */}
        <div className="dog-card-container">
        <h1 className="componentDiMountAPIDogs">List of countries that speak portuguese (Function Component) </h1>
                  {countries.map((country) => (
                    <CardCountries key={country.name.common} {...country} />
                  ))}
          </div>
          {/* ) */}
        {/* } */}
      </div>
    );
}