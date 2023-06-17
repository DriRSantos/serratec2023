import { Login } from "./pages/Login";
import { Home } from "./pages/Home";

export default function App() {  // igual ao React exporta função
  // const App = () => { // também pode usar arrow function

  return (  // é importante ter um componente ou mais, sendo container de outros componentes
    // <>
    // <Login />
    <Home />
    // </>
  );
}