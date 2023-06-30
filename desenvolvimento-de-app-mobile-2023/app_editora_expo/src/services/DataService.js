import * as SecureStore from 'expo-secure-store';
// import * as React from 'react';
// import { Text, View, StyleSheet, TextInput, Button } from 'react-native';

const save = async (key, value) => {
  try {
    await SecureStore.setItemAsync(key, JSON.stringify(value));

  } catch (error) {
    console.log('Error on saving data' + error);
  }

  let storedData = await getValueFor(key);
  console.log('Stored data: ' + JSON.stringify(storedData));
}

const saveArray = async (key, value) => {
  let arrayData = null;
  let arrayIncrement = [];
  try {
    arrayData = await getValueFor(key);
    arrayData = JSON.parse(arrayData);

    // se existe dados atualmente, incrementa
    if (arrayData !== null && arrayData !== undefined) {
      arrayIncrement = arrayData;
      // console.log("Dados atuais" + JSON.stringify(arrayIncrement));
      if (!arrayIncrement.some(item => item === value)) {
        arrayIncrement.push(value);
      } else {
        console.log('This value already exists, so not adding it to the array');
      }
      await save(key, arrayIncrement);
    }
    else { // se não existe, insere
      arrayIncrement.push(value);
      await save(key, arrayIncrement);
    }
  } catch (error) {
    console.log('Error on saving data' + error);
  }

  let storedData = await getValueFor(key);
  console.log('Stored data: ' + JSON.stringify(storedData));
}


const getValueFor = async (key) => {
  let result = null;

  try {
    result = await SecureStore.getItemAsync(key);
  } catch (error) {
    console.log('No values stored under that key' + error);
  }
  return result;
}

const deletePublisher = async (key) => {
  await SecureStore.deleteItemAsync(key);
}

export { save, getValueFor, deletePublisher, saveArray };

// export default function App() {
//   const [key, onChangeKey] = React.useState('Your key here');
//   const [value, onChangeValue] = React.useState('Your value here');

//   return (
//     <View style={styles.container}>
//       <Text style={styles.paragraph}>Save an item, and grab it later!</Text>
//       {}

//       <TextInput
//         style={styles.textInput}
//         clearTextOnFocus
//         onChangeText={text => onChangeKey(text)}
//         value={key}
//       />
//       <TextInput
//         style={styles.textInput}
//         clearTextOnFocus
//         onChangeText={text => onChangeValue(text)}
//         value={value}
//       />
//       {}
//       <Button
//         title="Save this key/value pair"
//         onPress={() => {
//           save(key, value);
//           onChangeKey('Your key here');
//           onChangeValue('Your value here');
//         }}
//       />
//       <Text style={styles.paragraph}>🔐 Enter your key 🔐</Text>
//       <TextInput
//         style={styles.textInput}
//         onSubmitEditing={event => {
//           getValueFor(event.nativeEvent.text);
//         }}
//         placeholder="Enter the key for the value you want to get"
//       />
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   container: {
//     flex: 1,
//     justifyContent: 'center',
//     paddingTop: 10,
//     backgroundColor: '#ecf0f1',
//     padding: 8,
//   },
//   paragraph: {
//     marginTop: 34,
//     margin: 24,
//     fontSize: 18,
//     fontWeight: 'bold',
//     textAlign: 'center',
//   },
//   textInput: {
//     height: 35,
//     borderColor: 'gray',
//     borderWidth: 0.5,
//     padding: 4,
//   },
// });
