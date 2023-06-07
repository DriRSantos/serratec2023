import { useState, useEffect} from 'react';
import './style.css';
import pokemonData from '../../mock/data.json';

export function Home(){
  const [pokemons, setPokemons] = useState([]); // poderia passar o pokemonData aqui dentro do Array, mas quis simular API
  const [isHidden, setIsHidden] = useState(false);

  console.log(pokemonData); // verifica o json no console

  useEffect(() => {
    function fetchData(){
      setTimeout(() => {  // para simular requisição na API passando os 2 segundos
        var pkmnFormatted  = pokemonData.map(pokemon => {
          var str = "" + pokemon.id
          var pad = "000"
          var newId = pad.substring(0, pad.length - str.length) + str

          return {...pokemon, newId: newId}
        }); // pegou os dados 


        setPokemons(pkmnFormatted)
      }, 2000)
    }

    fetchData();
  }, []) 

  // console.log(pokemons)

  return (
      <div id="container">
          <header id="titleContainer">
                <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Pok%C3%A9_Ball_icon.svg/1200px-Pok%C3%A9_Ball_icon.svg.png" alt="Pokeball" onClick="" />
                <h1>Pokedex</h1>
                <button onClick={() => setIsHidden(!isHidden)}>{isHidden ? 'Unhide Pokedex' : 'Hide Pokedex' }</button>
            </header>
          <div id="contentContainer">
                {
                    isHidden === true ? (
                        null
                    ) : (
                        pokemons.map(pokemon => {
                            return (
                                <div className="pokeCard" key={pokemon.id}>
                                    <img src={`https://assets.pokemon.com/assets/cms2/img/pokedex/full/${pokemon.newId}.png`} alt={pokemon.name.english} />
                            <h3>{pokemon.name.english}</h3>
                            <span>{pokemon.type[0]}</span>
                        </div>
                    )
                })
              )
            }
          </div>
      </div>
  )
} 
