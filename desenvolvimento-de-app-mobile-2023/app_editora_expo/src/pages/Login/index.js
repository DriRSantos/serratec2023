import { useState, useContext } from 'react';
import {
  StyleSheet,
  Text,
  TextInput,
  TouchableOpacity,
  View
} from 'react-native';
import { AxiosInstance } from '../../api/AxiosInstance';
import { DataContext } from '../../context/DataContext';
import { Ionicons } from '@expo/vector-icons';
// import AsyncStorage from '@react-native-async-storage/async-storage';

export function Login({ navigation }) {  // igual ao React exporta função
  // const Login = () => { // também pode usar arrow function mas LEMBRE de export default Login lá embaixo
  const [email, setEmail] = useState('');
  const [senha, setSenha] = useState('');
  const { storeUserData } = useContext(DataContext);
  const [hidePass, setHidePass] = useState(true);

  const handleLogin = async () => {
    alert('Seja bem vindo à livraDri !!');
    console.log(`Email: ${email} | Senha: ${senha}`);

    try {
      const response = await AxiosInstance.post('/auth/signin', {
        username: email,
        password: senha
      });

      if (response.status === 200) {
        // accessToken , atenção à maneira de guardar o token, pois a chave pode estar escrita como access-token
        var jwtToken = response.data;
        storeUserData(jwtToken["accessToken"]);
        navigation.navigate('Home'); // pega do name, que é como o id

        // const accessToken = jwtToken["accessToken"]; // TESTE
        // AsyncStorage.setItem("accessToken", accessToken);  // TESTE VERIFICAR
        // console.log(accessToken)

      }
      else {
        console.log('Erro ao realizar login!');
        alert('Erro no login!');
      }
    } catch (error) {
      console.log('Erro ao realizar login: ' + error);
    }
  }

  return (  // é importante ter um componente ou mais, sendo container de outros componentes
    <View style={styles.container}>
      <Text style={styles.h1}>Bem vindo!</Text>
      <Text style={styles.txt}>Preencha os dados para login</Text>
      <TextInput
        style={styles.input}
        value={email}
        placeholder="E-mail"
        placeholderTextColor="white"
        onChangeText={setEmail}
      />
      <View style={styles.inputArea}>
        <TextInput
          style={styles.inputPassword}
          value={senha}
          placeholder="Senha"
          placeholderTextColor="white"
          onChangeText={setSenha}
          secureTextEntry={hidePass}
        />
        <TouchableOpacity style={styles.icon} onPress={() => setHidePass(!hidePass)}>
          {hidePass ?
            <Ionicons name="eye" color="white" />
            :
            <Ionicons name="eye-off" color="white" />
          }
        </TouchableOpacity>
      </View>
      <TouchableOpacity style={styles.button} onPress={() => handleLogin()}>
        <Text style={styles.txtButton}>Login</Text>
      </TouchableOpacity>
    </View>
  ); {/* poderia passar onPress={handleLogin} */ }
}

// tem uma mistura de responsabilidades (se quiser pode criar arquivo externo css externo, mas nem todos fazem)
const styles = StyleSheet.create({ // estilização css no ReactiveNative usa o StyleSheet
  container: {                     // existem outras formas de estilizar  
    flex: 1,
    backgroundColor: '#102E4A',
    alignItems: 'center', // nome das propriedades é camelCase
    justifyContent: 'center',
  },

  h1: {
    fontSize: 20,
    fontWeight: 'bold',
    color: '#55C1FF',
  },

  txt: {
    fontSize: 16,
    fontWeight: 'bold',
    marginBottom: 10,
    color: '#55C1FF',
  },

  input: {
    width: 320,
    height: 40,
    margin: 5,
    borderWidth: 1,
    borderColor: '#55C1FF',
    padding: 10,
    borderRadius: 10,
    color: '#55C1FF',
  },
  inputArea: {
    flexDirection: 'row',
  },

  inputPassword: {
    width: 280,
    height: 40,
    margin: 5,
    borderWidth: 1,
    borderColor: '#55C1FF',
    padding: 10,
    borderRadius: 10,
    color: '#55C1FF',
  },

  icon: {
    width: 40,
    height: 40,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#102E4A',
    marginTop: 5,
    borderWidth: 1,
    borderColor: '#55C1FF',
    borderRadius: 10,
  },

  button: {
    alignItems: 'center',
    backgroundColor: '#55C1FF',
    padding: 10,
    marginTop: 10,
    width: 320,
    borderRadius: 9,
  },

  txtButton: {
    color: 'white',
  },
});
