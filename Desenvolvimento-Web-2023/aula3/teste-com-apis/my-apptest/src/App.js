import './App.css';
import React from 'react';
import { Card } from './components/Card';

class App extends React.Component {

state = {
  dogs:[]
}

async componentDidMount(){
  const newDogs = await fetch("https://dog.ceo/api/breed/retriever/golden/images/random/20");
  const dogsJson = await newDogs.json(); // array de golden
  const dogsArray = dogsJson.message; // extrai o Array da resposta da requisição e salva na variável
  this.setState({ dogs: dogsArray }); // seta as props do golden no array
}

  render(){
    console.log(this.state.dogs) // verificar no console

    return (
      <div className="container">
      <h1 className="componentDiMountAPIDogs">List of Golden Retrievers (Class Component) </h1>
        <div className="dog-card-container">
          {this.state.dogs.map((dog) => (
            <Card picture={dog} />
          ))}
        </div>
    </div>
  );
  }
}

export default App;
