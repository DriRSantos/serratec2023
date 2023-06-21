import { StatusBar } from 'expo-status-bar';
import React from 'react';
import {
  StyleSheet,
  FlatList,
  Image,
  SafeAreaView,
  Text,
  View
} from 'react-native';
import { Card } from 'react-native-elements';
import { AxiosInstance } from '../../api/AxiosInstance';
import { DataContext } from '../../context/DataContext';
import { useContext, useState, useEffect } from 'react';

const ItemEditoras = ({ img }) => (
  <Image style={styles.img} source={{ uri: `data:image/png;base64, ${img}` }} />
);

const ItemLivros = ({ img, text, text2 }) => (
  <View>
    <Image style={styles.imgLivros} source={{ uri: `data:image/png;base64, ${img}` }} />
    <Text style={styles.text1}>{text}</Text>
    <Text style={styles.text2}>{text2}</Text>
  </View>
);

export function Home({ navigation }) {
  const { userData } = useContext(DataContext);
  const [dadosEditora, setDadosEditora] = useState([]);
  const [dadosLivros, setDadosLivros] = useState([]);
  const [dadosAutores, setDadosAutores] = useState([]);
  const [combinedData, setCombinedData] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const responseEditoras = await AxiosInstance.get('/editoras', {
          headers: { Authorization: `Bearer ${userData?.token}` },
        });
        console.log('getTodasEditoras:' + JSON.stringify(responseEditoras.data));
        setDadosEditora(responseEditoras.data);

        const responseLivros = await AxiosInstance.get('/livros', {
          headers: { Authorization: `Bearer ${userData?.token}` },
        });
        console.log('getTodosLivros:' + JSON.stringify(responseLivros.data));
        setDadosLivros(responseLivros.data);

        const responseAutores = await AxiosInstance.get('/autores', {
          headers: { Authorization: `Bearer ${userData?.token}` },
        });
        console.log('getTodosAutores:' + JSON.stringify(responseAutores.data));
        setDadosAutores(responseAutores.data);
      }
      catch (error) {
        console.log('Ocorreu um erro ao recuperar os dados: ' + error);
      }
    };

    fetchData();
  }, [userData?.token]);

  useEffect(() => {
    if (dadosLivros.length > 0 && dadosAutores.length > 0) {
      const combined = dadosLivros.map((livro, index) => ({
        ...livro,
        nomeAutor: dadosAutores[index].nomeAutor,
      }));
      setCombinedData(combined);
    }
  }, [dadosLivros, dadosAutores]);

  // console.log(dadosEditora)
  // console.log(dadosLivros)
  // console.log(dadosAutores)

  return (
    <SafeAreaView style={styles.container}>
      <StatusBar style="light" />
      <View styles={styles.publisherContainer}>
        <Text style={styles.titleSection}>Editoras</Text>
        <FlatList
          data={dadosEditora}
          renderItem={({ item }) => <ItemEditoras img={item.img} text="Editoras" />}
          keyExtractor={(item) => item.codigoEditora.toString()}
          horizontal={true}
          showsHorizontalScrollIndicator={false}
        />
      </View>
      <View styles={styles.booksContainer}>
        <Text style={styles.titleSection}>Recentes</Text>
        <FlatList
          data={combinedData}
          renderItem={({ item }) => <ItemLivros img={item.img} text={item.nomeLivro} text2={item.nomeAutor} onPress={() => navigation.navigate('Livros')} />}
          keyExtractor={(item) => item.codigoLivro.toString()}
          horizontal={true}
          showsHorizontalScrollIndicator={false}

        />
      </View>
      <View style={styles.dataContainer}>
        <Text style={styles.titleSection}>Destaque</Text>
        <FlatList
          data={dadosEditora.slice(0, 1)}
          renderItem={({ item }) => <ItemEditoras img={item.img} text={item.text} />}
          keyExtractor={(index) => index.toString()}
          horizontal
        />
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