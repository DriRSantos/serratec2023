import 'react-native-gesture-handler';
import { AntDesign } from '@expo/vector-icons';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import { NavigationContainer } from '@react-navigation/native';
import { createDrawerNavigator } from '@react-navigation/drawer';
// import { createStackNavigator } from '@react-navigation/stack';
import { Cart } from './pages/Cart';
import { Favorites } from './pages/Favorites';
import { Home } from './pages/Home';
import { Search } from './pages/Search';
import { HomePublishers } from './pages/HomePublishers';
import { Books } from './pages/Books'
import { Login } from './pages/Login';

const Tab = createBottomTabNavigator();
const Drawer = createDrawerNavigator();
// const Stack = createStackNavigator();

function TabsNavigation() {
  return (
    <Tab.Navigator >
      <Tab.Screen
        name="Tela Inicial"
        component={Home}
        options={{
          headerTitle: 'Tela inicial',
          headerStyle: {
            backgroundColor: '#55C1FF'
          },
          headerTintColor: '#FFF',
          tabBarIcon: (tabInfo) => (
            <AntDesign name="home" size={24} color="#0958d9" />
          ),
        }} />
      <Tab.Screen
        name="Busca"
        component={Search}
        options={{
          headerTitle: 'O que procura?',
          headerStyle: {
            backgroundColor: '#55C1FF'
          },
          headerTintColor: '#FFF',
          tabBarIcon: (tabInfo) => (
            <AntDesign name="search1" size={24} color="#0958d9" />
          ),
        }} />
      <Tab.Screen
        name="Favoritos"
        component={Favorites}
        options={{
          headerTitle: 'Favoritos',
          tabBarIcon: (tabInfo) => (
            <AntDesign name="heart" size={24} color="#0958d9" />
          ),
        }} />
      <Tab.Screen
        name="Carrinho"
        component={Cart}
        options={{
          headerTitle: 'Carrinho',
          tabBarIcon: (tabInfo) => (
            <AntDesign name="shoppingcart" size={24} color="#0958d9" />),
        }} />
    </Tab.Navigator>
  )
}

export default function App() {  // igual ao React exporta função
  // const App = () => { // também pode usar arrow function

  return (  // é importante ter um componente ou mais, sendo container de outros componentes
    <NavigationContainer>
      <Drawer.Navigator >
        <Drawer.Screen name="Login" component={Login} options={{
          headerTitle: 'Login',
          headerStyle: {
            backgroundColor: '#55C1FF'
          },
          headerTintColor: '#FFF'
        }} />
        <Drawer.Screen name="Home" component={TabsNavigation} options={{
          headerStyle: {
            backgroundColor: '#55C1FF'
          },
        }} />
        <Drawer.Screen name="Livros" component={Books} options={{
          headerTitle: 'Livros',
          headerStyle: {
            backgroundColor: '#55C1FF'
          },
          headerTintColor: '#FFF'
        }} />
        <Drawer.Screen name="Editoras" component={HomePublishers} options={{
          headerTitle: 'Editoras',
          headerStyle: {
            backgroundColor: '#55C1FF'
          },
          headerTintColor: '#FFF'
        }} />
        <Drawer.Screen name="Favoritos" component={Favorites} options={{
          headerTitle: 'Favoritos',
          headerStyle: {
            backgroundColor: '#55C1FF'
          },
          headerTintColor: '#FFF'
        }} />
      </Drawer.Navigator>
    </NavigationContainer >
  );
}
// initialRouteName="Login" screenOptions={{ headerShown: false }}