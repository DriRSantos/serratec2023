import { Login } from "./pages/Login";
import { Home } from "./pages/Home";
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';

const Stack = createNativeStackNavigator();
const Tab = createBottomTabNavigator();

function Tabs() {
  return (
    <Tab.Navigator>
      <Tab.Screen
        name="Login"
        component={Login}
        options={{
          headerTitle: 'Bem-vindo, faça login',
          headerStyle: {
            backgroundColor: '#55C1FF'
          },
          headerTintColor: '#FFF',
        }} />
      <Tab.Screen
        name="Home"
        component={Home}
        options={{
          headerTitle: 'Bem-vindo à livraria',
          headerStyle: {
            backgroundColor: '#55C1FF'
          },
          headerTintColor: '#FFF',
        }} />
    </Tab.Navigator>
  )
}

export default function App() {  // igual ao React exporta função
  // const App = () => { // também pode usar arrow function

  return (  // é importante ter um componente ou mais, sendo container de outros componentes
    <NavigationContainer>
      <Stack.Navigator initialRouteName="Login" screenOptions={{ headerShown: false }}>
        <Stack.Screen name="Tabs" component={Tabs} />
      </Stack.Navigator>
    </NavigationContainer >
  );
}
{/* <Stack.Screen name="Login" component={Login} /> */ }
{/* <Stack.Screen name="HomeEditoras" component={HomeEditoras} /> */ }