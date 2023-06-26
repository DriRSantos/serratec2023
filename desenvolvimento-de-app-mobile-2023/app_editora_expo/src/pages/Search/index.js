import React, { useContext, useEffect, useState } from 'react';
import { Searchbar } from 'react-native-paper';
import { DataContext } from '../../context/DataContext';
import {
  SafeAreaView,
  Text,
  StyleSheet,
  View,
  FlatList,
  TouchableOpacity,
  StatusBar,
  Image,
} from 'react-native';

const PublisherItem = ({ img, onPress, publisher, featured }) => (
  <TouchableOpacity onPress={() => onPress(publisher)}>
    <Image style={featured ? styles.largeImg : styles.img} source={{ uri: `data:image/png;base64, ${img}` }} />
  </TouchableOpacity>
);

const BookItem = ({ img, text, text2, onPress }) => (
  <TouchableOpacity onPress={() => onPress({ img, text, text2 })}>
    <View>
      <Image style={styles.imgBooks} source={{ uri: `data:image/png;base64, ${img}` }} />
      <Text style={styles.text1}>{text}</Text>
      <Text style={styles.text2}>{text2}</Text>
    </View>
  </TouchableOpacity>
);

export function Search({ navigation }) {
  const { publisherData, bookData, authorData } = useContext(DataContext);
  const [searchQuery, setSearchQuery] = React.useState('');
  const [filteredResults, setFilteredResults] = useState([]);
  const [combinedData, setCombinedData] = useState([]);

  const onChangeSearch = query => setSearchQuery(query);

  useEffect(() => {
    if (publisherData && bookData && authorData) {
      const filteredBooks = bookData.filter(item =>
        item.nomeLivro.toLowerCase().includes(searchQuery.toLowerCase())
      );
      const filteredPublishers = publisherData.filter(item =>
        item.nomeEditora.toLowerCase().includes(searchQuery.toLowerCase())
      );
      const filteredAuthors = authorData.filter(item =>
        item.nomeAutor.toLowerCase().includes(searchQuery.toLowerCase())
      );
      const filteredResults = [
        { title: 'Livros', data: filteredBooks },
        { title: 'Editoras', data: filteredPublishers },
        { title: 'Autores', data: filteredAuthors }
      ];
      setFilteredResults(filteredResults);
    }
  }, [searchQuery, publisherData, bookData, authorData]);

  useEffect(() => {
    if (bookData.length > 0 && authorData.length > 0) {
      const combined = bookData.map((livro, index) => ({
        ...livro,
        nomeAutor: authorData[index].nomeAutor,
      }));
      setCombinedData(combined);
    }
  }, [bookData, authorData]);

  return (
    <SafeAreaView style={{ flex: 1 }}>
      <StatusBar style='light' />
      <View style={styles.container}>
        <Searchbar
          placeholder="Search"
          onChangeText={onChangeSearch}
          value={searchQuery}
        />
        <Text style={styles.sectionHeader}>Resultado:</Text>
        <FlatList
          data={filteredResults}
          renderItem={({ item }) => {
            switch (item.title) {
              case 'Livros':
                return item.data.map((book, index) => (
                  <BookItem
                    key={index}
                    img={book.img}
                    text={book.nomeLivro}
                    text2={book.nomeAutor}
                    onPress={(data) => navigation.navigate('Livros')}
                  />
                ));
              case 'Editoras':
                return item.data.map((publisher, index) => (
                  <PublisherItem
                    key={index}
                    img={publisher.img}
                    onPress={() => navigation.navigate('HomePublishers', { publisher, bookData, combinedData })}
                    publisher={publisher}
                  />
                ));
              default:
                return null;
            }
          }}
          keyExtractor={(item, index) => index.toString()}
        />
      </View>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  container: {
    backgroundColor: 'white',
  },
  itemStyle: {
    padding: 10,
  },
  textInputStyle: {
    height: 40,
    borderWidth: 1,
    paddingLeft: 20,
    margin: 5,
    borderColor: '#009688',
    backgroundColor: '#FFFFFF',
  },
});
