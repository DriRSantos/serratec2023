import React from 'react';
import {
  StyleSheet,
  FlatList,
  Image,
  SafeAreaView,
  Text,
  View,
  TouchableOpacity,
  StatusBar,
} from 'react-native';
import { AxiosInstance } from '../../api/AxiosInstance';
import { DataContext } from '../../context/DataContext';
import { useContext, useState, useEffect } from 'react';

const PublisherItem = ({ img, onPress, publisher }) => (
  <TouchableOpacity onPress={() => onPress(publisher)}>
    <Image style={styles.img} source={{ uri: `data:image/png;base64, ${img}` }} />
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

export function Home({ navigation }) {
  const { userData } = useContext(DataContext);
  const [publisherData, setPublisherData] = useState([]);
  const [bookData, setBookData] = useState([]);
  const [authorData, setAuthorData] = useState([]);
  const [combinedData, setCombinedData] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const publisherResponse = await AxiosInstance.get('/editoras', {
          headers: { Authorization: `Bearer ${userData?.token}` },
        });
        // console.log('getAllPublishers:' + JSON.stringify(publisherResponse.data));
        setPublisherData(publisherResponse.data);

        const booksResponse = await AxiosInstance.get('/livros', {
          headers: { Authorization: `Bearer ${userData?.token}` },
        });
        // console.log('getAllBooks:' + JSON.stringify(booksResponse.data));
        setBookData(booksResponse.data);

        const authorResponse = await AxiosInstance.get('/autores', {
          headers: { Authorization: `Bearer ${userData?.token}` },
        });
        // console.log('getAllAuthors:' + JSON.stringify(authorResponse.data));
        setAuthorData(authorResponse.data);
      }
      catch (error) {
        console.log('Ocorreu um erro ao recuperar os dados: ' + error);
      }
    };

    fetchData();
  }, [userData?.token]);

  useEffect(() => {
    if (bookData.length > 0 && authorData.length > 0) {
      const combined = bookData.map((livro, index) => ({
        ...livro,
        nomeAutor: authorData[index].nomeAutor,
      }));
      setCombinedData(combined);
    }
  }, [bookData, authorData]);


  // console.log(publisherData)
  // console.log(bookData)
  // console.log(authorData)

  return (
    <SafeAreaView style={styles.container}>
      <StatusBar style="light" />
      <View style={styles.publisherContainer}>
        <Text style={styles.titleSection}>Editoras</Text>
        <FlatList
          data={publisherData}
          renderItem={({ item }) => (
            <PublisherItem
              img={item.img}
              onPress={(publisher) => navigation.navigate('HomePublishers', { publisher, bookData, combinedData })}
              publisher={item}
            />
          )}
          keyExtractor={(item) => item.codigoEditora.toString()}
          horizontal={true}
          showsHorizontalScrollIndicator={false}
        />
      </View>
      <View style={styles.booksContainer}>
        <Text style={styles.titleSection}>Recentes</Text>
        <FlatList
          data={combinedData}
          renderItem={({ item }) => (
            <BookItem
              img={item.img}
              text={item.nomeLivro}
              text2={item.nomeAutor}
              onPress={(data) => navigation.navigate('Livros')}
            />
          )}
          keyExtractor={(item) => item.codigoLivro.toString()}
          horizontal={true}
          showsHorizontalScrollIndicator={false}
        />
      </View>
      <View style={styles.dataContainer}>
        <Text style={styles.titleSection}>Destaque</Text>
        {publisherData.length > 0 &&
          <PublisherItem
            nomeEditora={publisherData[0].nomeEditora}
            img={publisherData[0].img}
            id={publisherData[0].codigoEditora}
            destaque={true}
          />
        }
      </View>
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
  // publisherContainer: {

  // },
  // booksContainer: {

  // },
  dataContainer: {
    marginTop: 10,
    marginBottom: 10,
  },
  titleSection: {
    fontSize: 20,
    fontWeight: 'bold',
    color: '#55C1FF',
    marginTop: 5,
    marginBottom: 5,
  },
  img: {
    width: 200,
    height: 200,
    borderRadius: 20,
    marginRight: 15,
  },
  imgBooks: {
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
    width: 180,
  },
  text2: {
    fontSize: 14,
    marginBottom: 5,
    padding: 2,
    color: 'white',
  },
});