import './App.css'
import { DefaultButton } from './common/components/DefaultButton'
import { DefaultInput } from './common/components/DefaultInput';

function App() {

  const handleFunction = () => {
    alert('teste')
  }

  return (
    <>
      <h1>Hello Word</h1>
      <button onClick={handleFunction}></button>
      <button style={{ height: "40px", width: "110px" background: "#FF9000", border: "none", borderRadius: "7px" }}></button>  {/* quando coloca chaves no style, ele espera um Objeto {} javascript dentro */}


      <DefaultInput type={'warning'} />
      <DefaultButton type={'success'} />
    </>
  )
}

export default App
