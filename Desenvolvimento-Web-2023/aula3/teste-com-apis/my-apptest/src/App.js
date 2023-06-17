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

  // async function makeRequest() { // tratamento de erro com http
  //   try {
  //     const response = await fetch('https://randomuser.me/api/');
  
  //     console.log('status code: ', response.status); // 👉️ 200
  
  //     if (!response.ok) {
  //       console.log(response);
  //       throw new Error(`Error! status: ${response.status}`);
  //     }
  
  //     const result = await response.json();
  //     return result;
  //   } catch (err) {
  //     console.log(err);
  //   }
  // }
  
  // makeRequest();

}

  render(){
    console.log(this.state.dogs) // verifica no console

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
