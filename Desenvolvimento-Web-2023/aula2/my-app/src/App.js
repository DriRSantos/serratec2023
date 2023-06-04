import { Component } from './Component';
import { Component2 } from './Component';
import { Card } from './Card';
import { Button } from './Button';
import './App.css';

function App() {
  return (
    <>
   <h1>Hello World</h1>
   <Button />
   <Component />    
   <Component2 />
   <Card />
   {/* todo componente React com mais de uma div tem que ficar entre div ou <> */}
   </>
  );
}

export default App;