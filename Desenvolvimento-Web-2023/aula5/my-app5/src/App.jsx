import React, { useRef } from 'react';
import './App.css'
import { DefaultButton } from './common/components/DefaultButton'
import { DefaultInput } from './common/components/DefaultInput';

function App() {
  const buttonRef = useRef(null);

  const handleFunction = () => {
    alert('teste')
  };

  {/* pode encontrar o button lá embaixo usando o className, mas não é comum fazer isso. Não recomendado! */ }
  document.getElementsByClassName('a')[0];

  const handleClick = () => {
    // Acessando o elemento usando a referência
    if (buttonRef.current) {
      buttonRef.current.style.backgroundColor = 'green';
      buttonRef.current.style.width = '300px';
    }
  };

  const buttonStyle = {
    height: "40px",
    width: "110px",
    background: "#FF9000",
    border: "none",
    borderRadius: "7px"
  }; {/* objeto style para ser usado no return  */ }

  return (
    <>
      <h1>Hello Word</h1>
      <div>
        <button className="button1" onClick={() => { handleFunction() }}>Usando className css</button>
      </div>

      <div>
        {/* quando coloca chaves no style, ele espera um Objeto {} javascript dentro */}
        <button style={{ height: "40px", width: "140px", background: "#FF9000", border: "none", borderRadius: "7px" }}>Style inline</button>
      </div>

      <div>
        {/* pode usar className para chamar no .css ou para criar uma classe e usar lá em cima  */}
        <button className='a' style={{ height: "60px", width: "180px", background: "#FF6543", border: "none", borderRadius: "7px" }}> Style inline com className a</button>
      </div>

      <div>
        <p>Utilizando hook useRef</p>
        <button ref={buttonRef} className="b" style={{
          height: '80px', width: '180px',
          background: '#FF6543',
          border: 'none',
          borderRadius: '7px'
        }}
          onClick={() => handleClick()}
        >Style inline className b com ref
        </button>
      </div>

      {/* também pode transformar o style em um objeto e chamar aqui dentro  */}
      <button style={buttonStyle}></button>

      <DefaultInput type={'error'} />
      <DefaultButton type={'success'} text={"Logar"} />
      <DefaultInput type={'success'} />
      <DefaultButton type={'warning'} text={"DESLOGAR"} />
    </>
  )
}

export default App;