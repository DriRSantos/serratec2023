import 'react-native-gesture-handler';
import { AntDesign } from '@expo/vector-icons';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import { NavigationContainer } from '@react-navigation/native';
import { createDrawerNavigator } from '@react-navigation/drawer';
import { createStackNavigator } from '@react-navigation/stack';
import { useNavigation } from '@react-navigation/native';
import { useEffect } from 'react';
import AsyncStorage from '@react-native-async-storage/async-storage';
import { Cart } from './pages/Cart';
import { Favorites } from './pages/Favorites';
import { Home } from './pages/Home';
import { Search } from './pages/Search';
import { HomePublishers } from './pages/HomePublishers';
import { Books } from './pages/Books';
import { Login } from './pages/Login';
import { DataProvider } from './context/DataContext';

const Tab = createBottomTabNavigator();
const Drawer = createDrawerNavigator();
const Stack = createStackNavigator();

function TabsNavigation() {
  return (
    <Tab.Navigator screenOptions={{
      headerShown: false,
      tabBarLabelStyle: { fontWeight: 'bold' },
      tabBarActiveTintColor: '#0958d9',
      tabBarInactiveTintColor: '#999',
    }}>
      <Tab.Screen
        name="Tela Inicial"
        component={Home}
        options={{
          tabBarLabel: 'Tela Inicial',
          tabBarIcon: (tabInfo) => (
            <AntDesign name="home" size={24} color="#0958d9" />
          ),
        }} />
      <Tab.Screen
        name="BuscaEditoras"
        component={Search}
        options={{
          tabBarLabel: 'Busca',
          tabBarIcon: (tabInfo) => (
            <AntDesign name="search1" size={24} color="#0958d9" />
          ),
        }} />
      <Tab.Screen
        name="Favoritos"
        component={Favorites}
        options={{
          title: 'Favoritos',
          tabBarIcon: (tabInfo) => (
            <AntDesign name="heart" size={24} color="#0958d9" />
          ),
        }} />
      <Tab.Screen
        name="Carrinho"
        component={Cart}
        options={{
          tabBarLabel: 'Carrinho',
          tabBarIcon: (tabInfo) => (
            <AntDesign name="shoppingcart" size={24} color="#0958d9" />
          ),
        }} />
    </Tab.Navigator>
  )
}
export default function App() {  // igual ao React exporta função

  return (  // é importante ter um componente ou mais, sendo container de outros componentes
    <DataProvider>
      <NavigationContainer>
        <Stack.Navigator>
          <Stack.Screen name="Login" component={Login} options={{ headerShown: false }} />
          <Stack.Screen name="Home" component={DrawerNavigation} options={{
            headerShown: false,
            headerStyle: {
              backgroundColor: '#55C1FF',
            },
            headerTintColor: '#FFF',
          }} />

          <Stack.Screen name="Livros" component={Books} options={{
            headerStyle: {
              backgroundColor: '#55C1FF',
            },
            headerTintColor: '#FFF',
          }} />
          <Stack.Screen name="HomePublishers" component={HomePublishers} options={{
            headerStyle: {
              backgroundColor: '#55C1FF',
            },
            headerTintColor: '#FFF',
          }} />

          <Stack.Screen name="Favoritos" component={Favorites} options={{
            headerStyle: {
              backgroundColor: '#55C1FF',
            },
            headerTintColor: '#FFF',
          }} />
          <Stack.Screen name="Carrinho" component={Cart} options={{
            headerStyle: {
              backgroundColor: '#55C1FF',
            },
            headerTintColor: '#FFF',
          }} />
        </Stack.Navigator>
      </NavigationContainer >
    </DataProvider>
  );
}

const Logout = () => {
  const navigation = useNavigation();

  useEffect(() => {
    async function performLogout() {
      await AsyncStorage.clear();
      navigation.reset({
        index: 0,
        routes: [{ name: 'Login' }],
      });
    }
    performLogout();
  }, [navigation]);

  return null;
}

function DrawerNavigation() {
  return (
    <Drawer.Navigator screenOptions={{ title: '' }}>
      <Drawer.Screen name="Livraria" component={TabsNavigation} options={{
        headerStyle: {
          backgroundColor: '#55C1FF',
        },
        headerTintColor: '#FFF',
      }} />
      <Drawer.Screen name="Livros" component={Books} options={{
        headerStyle: {
          backgroundColor: '#55C1FF',
        },
        headerTintColor: '#FFF',
      }} />
      <Drawer.Screen name="Favoritos" component={Favorites} options={{
        headerStyle: {
          backgroundColor: '#55C1FF',
        },
        headerTintColor: '#FFF',
      }} />
      <Drawer.Screen name="Logout" component={Logout} options={{
        headerShown: false,
        headerStyle: {
          backgroundColor: '#55C1FF',
        },
        headerTintColor: '#FFF',
      }} />
    </Drawer.Navigator>
  );
}

// sem drawer
// export default function App() {  // igual ao React exporta função
//   // const App = () => { // também pode usar arrow function

//   return (  // é importante ter um componente ou mais, sendo container de outros componentes
//     <DataProvider>
//       <NavigationContainer>
//         <Stack.Navigator>
//           <Stack.Screen name="Login" component={Login} options={{ headerShown: false }} />
//           <Stack.Screen name="Home" component={TabsNavigation} options={{
//             headerStyle: {
//               backgroundColor: '#55C1FF',
//             },
//             headerTintColor: '#FFF',

//           }} />

//           <Stack.Screen name="Livros" component={Books} options={{
//             headerStyle: {
//               backgroundColor: '#55C1FF',
//             },
//             headerTintColor: '#FFF',
//           }} />
//           <Stack.Screen name="HomePublishers" component={HomePublishers} options={{
//             headerStyle: {
//               backgroundColor: '#55C1FF',
//             },
//             headerTintColor: '#FFF',
//           }} />

//           <Stack.Screen name="Favoritos" component={Favorites} options={{
//             headerStyle: {
//               backgroundColor: '#55C1FF',
//             },
//             headerTintColor: '#FFF',
//           }} />
//           <Stack.Screen name="Carrinho" component={Cart} options={{
//             headerStyle: {
//               backgroundColor: '#55C1FF',
//             },
//             headerTintColor: '#FFF',
//           }} />
//         </Stack.Navigator>
//       </NavigationContainer >
//     </DataProvider>
//   );
// }
// initialRouteName="Login" screenOptions={{ headerShown: false }}

// function DrawerNavigation() {
//   return (
//     <NavigationContainer>
//       <Drawer.Navigator>
//         <Drawer.Screen name="Login" component={Login} options={{ headerShown: false }} />
//         <Drawer.Screen name="Home" component={StackNavigation} />
//         <Drawer.Screen name="Livros" component={Books} />
//         <Drawer.Screen name="Editoras" component={HomePublishers} />
//         <Drawer.Screen name="Favoritos" component={Favorites} options={{ headerShown: false }} />
//       </Drawer.Navigator>
//     </NavigationContainer>
//   );
// }