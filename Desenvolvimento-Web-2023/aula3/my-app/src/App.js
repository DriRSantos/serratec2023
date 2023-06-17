import React from 'react';  // exemplo Componente de Classe

class App extends React.Component { // transformou a classe em componente
  name = 'Dri'  // não pode deixar a variavel solta, senão o React não entende

  // state = {  // para alterar o nome tem que deixar dentro do State!!!!
  //   name: 'Dri'  // errado acima
  // }

  state = {
    counter: 0
  }

  componentDidUpdate() { // este mostra sempre que um componente/estado for atualizado
    alert(`Fui Atualizado!! Counter = ${this.state.counter}`) // vai dar valor diferente do contador, 
  }         // pois ele executa antes da renderização, ele não acontece assim que é carregado
  // ele acontece quando sabe que o componente será atualizado, por isso dá valor diferente


  handleIncrement = () => {
    this.setState({ counter: this.state.counter + 1 });
    console.log(this.state.counter)
  }

  handleNameChange = () => {
    this.name = "Rodrigo Oliveira"
    this.setState({ name: this.name })
    console.log(this.name)  // tem que chamar de dentro do State

    // var time = new Date();
    // console.log(time)
  }

  render() {  // método render é especial no React, criado para exibir algo em tela
    return (
      <>
        <h2>Hello, {this.props.name}</h2> {/* recebe aqui o valor passado no index, o pai passa para o filho a propriedade*/}
        <h1>Class component</h1>
        {/* para funcionar este do name, tem que descomentar lá em cima */}
        <h2>Welcome, {this.name}</h2>
        <button onClick={this.handleNameChange}>Change Name class component</button>

        <h2>{this.state.counter}</h2>
        <button onClick={this.handleIncrement}>Counter class component</button>
      </>
    )
  }
}

export default App;