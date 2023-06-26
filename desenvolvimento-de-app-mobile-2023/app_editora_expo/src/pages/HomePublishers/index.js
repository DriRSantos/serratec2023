import React from 'react';
import {
  StyleSheet,
  FlatList,
  Image,
  SafeAreaView,
  Text,
  View,
  TouchableOpacity,
  StatusBar
} from 'react-native';

export function HomePublishers({ navigation, route }) {
  const { publisher, bookData } = route.params;
  const filteredBooks = bookData.filter((book) => book.editoraDTO.codigoEditora === publisher.codigoEditora);

  console.log(publisher)
  console.log(bookData)

  return (
    <SafeAreaView style={styles.container}>
      <Text style={styles.text}>Livros</Text>
      <FlatList
        data={filteredBooks}
        renderItem={({ item }) => (
          <TouchableOpacity
            onPress={() => navigation.navigate('Livros', { data: item })}
          >
            <View>
              <Image style={styles.img} source={{ uri: `data:image/png;base64, ${item.img}` }} />
              <Text style={styles.text1}>{item.nomeLivro}</Text>
              <Text style={styles.text2}>{item.nomeAutor}</Text>
            </View>
          </TouchableOpacity>
        )}
        keyExtractor={(item) => item.codigoLivro.toString()}
        showsHorizontalScrollIndicator={false}
      />
    </SafeAreaView>
  );
}


const styles = StyleSheet.create({
  container: {
    flex: 1,
    marginTop: StatusBar.currentHeight || 0,
    padding: 5,
    backgroundColor: '#102E4A',
  },
  publisherContainer: {
    marginTop: 10,
    marginBottom: 10,
    padding: 5,
  },
  booksContainer: {
    marginTop: 10,
    marginBottom: 10,
    padding: 3,
  },
  dataContainer: {
    marginTop: 10,
    marginBottom: 10,
  },
  titleSection: {
    fontSize: 20,
    fontWeight: 'bold',
    color: '#55C1FF',
    marginTop: 5,
  },
  img: {
    width: 200,
    height: 200,
    borderRadius: 20,
  },
  imgLivros: {
    width: 160,
    height: 200,
    borderRadius: 6,
  },
  largeImg: {
    width: 300,
    height: 200,
    borderRadius: 20,
  },
  text1: {
    fontSize: 16,
    fontWeight: 'bold',
    color: 'white',
  },
  text2: {
    fontSize: 14,
    marginBottom: 5,
    padding: 2,
    color: 'white',
  },
});