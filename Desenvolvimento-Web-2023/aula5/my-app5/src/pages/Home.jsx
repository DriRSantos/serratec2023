import { useState } from "react";
import { Button, Container, Text } from "./style";
import { DefaultButton } from "../common/components/DefaultButton";
import { DefaultInput } from "../common/components/DefaultInput";

export function Home() {
  const [count, setCount] = useState(0);
  const [count2, setCount2] = useState(0);

  return (
    <>
      <Container>
        Hello World
        <img src="https://avatars.githubusercontent.com/u/105232781?v=4" alt="Imagem perfil do GitHub" />

        <Text>
          Testando texto com component Text
        </Text>
        <DefaultInput type={'error'} placeholder="Hello"></DefaultInput>
        <h2>{count2}</h2>
        <DefaultButton text="😉" type={'warning'} onClick={() => setCount2(count2 + 1)}></DefaultButton>

        <h2>{count}</h2>
        <Button onClick={() => { setCount(count + 1) }}>Teste</Button>
      </Container>


    </>
  );
}