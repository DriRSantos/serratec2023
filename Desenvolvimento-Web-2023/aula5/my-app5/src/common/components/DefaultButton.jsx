import { Button } from './style';

export function DefaultButton(props){
  // const buttonStyle={ // poderia colocar aqui as propriedades como uma constante e chamar lá dentro
  //   height: "40px", 
  //   width: "110px", 
  //   background: "#FF0000", 
  //   border: "none", 
  //   borderRadius:"7px"
  // }

  return ( // estilização inline
    // <button className="abutton" style={{ height: "40px", width: "110px", background: "#FF0000", border: "none", borderRadius:"7px" }}> CLICK ME</button>
    <Button type={props.type}> Click me! </Button>
  );
}