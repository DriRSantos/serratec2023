import styled from "styled-components";

export const Button = styled.button`
   height: 40px;
   width: 110px; 
   color: ${props => {
    let color;

    switch (props.type) {
      case 'success':
        color = 'red';
        break;
      case 'error':
        color = 'purple';
        break;
      case 'warning':
        color = 'blue';
        break;
      default:
        color = '#FF9090';
        break;
    }
    return color;
  }};
   background: ${props => {
    let color;

    switch (props.type) {
      case 'success':
        color = 'green';
        break;
      case 'error':
        color = 'yellow';
        break;
      case 'warning':
        color = 'red';
        break;
      default:
        color = '#FF9090';
        break;
    }
    return color;
  }};
   border: none;
   border-radius: 7px;
`;

export const Input = styled.input`
  height: 30px;
   width: 250px;
   color: 'white';
   background: ${props => {
    let color;

    switch (props.type) {
      case 'success':
        color = 'green';
        break;
      case 'error':
        color = '#FF00FF';
        break;
      case 'warning':
        color = 'orange';
        break;
      default:
        color = '#FA5555';
        break;
    }
    return color;
  }};
  
 ::placeholder {
    color: white;
  }

`;