import { useState } from 'react';
import {
  StyleSheet,
  Text,
  TextInput,
  TouchableOpacity,
  View
} from 'react-native';

export function Login() {  // igual ao React exporta função
  // const Login = () => { // também pode usar arrow function mas LEMBRE de export default Login lá embaixo
  const [email, setEmail] = useState('');
  const [senha, setSenha] = useState('');

  const handleLogin = () => {
    alert('Foi pressionado!!');
    console.log(`Email: ${email} | Senha: ${senha}`);
  }

  return (  // é importante ter um componente ou mais, sendo container de outros componentes
    <View style={styles.container}>
      <Text style={styles.txt}>Hello Word!!!! Dri</Text>
      <TextInput
        style={styles.input}
        value={email}
        placeholder="E-mail"
        onChangeText={setEmail}
      />
      <TextInput
        style={styles.input}
        value={senha}
        placeholder="Senha"
        onChangeText={setSenha}
      />
      <TouchableOpacity style={styles.button} onPress={handleLogin}>
        <Text style={styles.txtButton}>Login</Text>
      </TouchableOpacity>
    </View>
  ); {/* poderia passar onPress={() => handleLogin()} */ }
}

// tem uma mistura de responsabilidades (se quiser pode criar arquivo externo css externo, mas nem todos fazem)
const styles = StyleSheet.create({ // estilização css no ReactiveNative usa o StyleSheet
  container: {                     // existem outras formas de estilizar  
    flex: 1,
    backgroundColor: '#FF9000',
    alignItems: 'center', // nome das propriedades é camelCase
    justifyContent: 'center',
  },

  txt: {
    fontSize: 16,
    fontWeight: 'bold',
    marginBottom: 30,
  },

  input: {
    height: 40,
    margin: 12,
    borderWidth: 1,
    padding: 10,
  },

  button: {
    alignItems: 'center',
    backgroundColor: '#DDDDDD',
    padding: 10,
  },

  txtButton: {
    color: '#FF4567',
  },
});
