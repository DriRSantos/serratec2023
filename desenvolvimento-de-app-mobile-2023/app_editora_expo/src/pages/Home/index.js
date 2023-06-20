import { StatusBar } from 'expo-status-bar';
import React from 'react';
import {
  StyleSheet,
  FlatList,
  Image,
  SafeAreaView,
  SectionList,
  Text,
  View
} from 'react-native';
import { Card } from 'react-native-elements';

const ListItem = ({ item, imageStyle }) => {
  return (
    <View style={styles.item}>
      <Image
        source={{
          uri: item.uri,
        }}
        style={[styles.itemPhoto, imageStyle]}
        resizeMode="cover"
      />
      <Text style={styles.itemText}>{item.text}</Text>
    </View>
  );
};

export function Home({ navigation }) {

  const renderHorizontalList = (data, sectionTitle) => (
    <FlatList
      horizontal
      data={data}
      renderItem={({ item }) => {
        if (sectionTitle === 'Recentes') {
          return (
            <Card containerStyle={styles.card}>
              <Card.Image source={{ uri: item.uri }} style={styles.cardImage} onPress={() => navigation.navigate('Livros')}>
              </Card.Image>
              <Card.FeaturedTitle style={styles.cardTitle}>{item.text}</Card.FeaturedTitle>
              <Card.FeaturedSubtitle style={styles.cardSubtitle}>{item.description}</Card.FeaturedSubtitle>
              {/* <Text style={styles.cardDescription}>{item.description}</Text> */}
            </Card>
          );
        } else {
          return <ListItem item={item} />;
        }
      }}
      keyExtractor={(item) => item.key}
      showsHorizontalScrollIndicator={false}
    />
  );

  // <Button title="Editoras" onPress={() => navigation.navigate('HomeEditoras')}></Button>
  // <Button title="Login" onPress={() => navigation.navigate('Login')}></Button> 

  return (
    <SafeAreaView style={styles.container}>
      <StatusBar style="light" />
      <View style={{ flex: 1 }}>
        <SectionList
          contentContainerStyle={{ paddingHorizontal: 10 }}
          stickySectionHeadersEnabled={false}
          sections={SECTIONS}
          renderSectionHeader={({ section }) => {
            if (section.title === 'Editoras' || section.title === 'Recentes') {
              return (
                <>
                  <Text style={styles.sectionHeader}>{section.title}</Text>
                  {renderHorizontalList(section.data, section.title)}
                </>
              );
            } else if (section.title === 'Destaque') {
              return (
                <>
                  <Text style={styles.sectionHeader}>{section.title}</Text>
                  <View style={styles.highlightContainer}>
                    <View style={styles.highlightItem}>
                      <Image
                        source={{ uri: section.data[0].uri }}
                        style={styles.highlightItemPhoto}
                        resizeMode="cover"
                      />
                      <Text style={styles.highlightItemText}>
                        {section.data[0].text}
                      </Text>
                    </View>
                  </View>
                </>
              );
            }
          }}
          renderItem={({ section }) => {
            if (section.horizontal) {
              return null;
            }
          }}
        />
      </View>
    </SafeAreaView>
  );
};

const SECTIONS = [
  {
    title: 'Editoras',
    horizontal: true,
    data: [
      {
        key: '1',
        text: 'Editora 1',
        uri: 'https://picsum.photos/id/1/200',
      },
      {
        key: '2',
        text: 'Editora 2',
        uri: 'https://picsum.photos/id/10/200',
      },

      {
        key: '3',
        text: 'Editora 3',
        uri: 'https://picsum.photos/id/1002/200',
      },
      {
        key: '4',
        text: 'Editora 4',
        uri: 'https://picsum.photos/id/1006/200',
      },
      {
        key: '5',
        text: 'Editora 5',
        uri: 'https://picsum.photos/id/1008/200',
      },
    ],
  },
  {
    title: 'Recentes',
    horizontal: true,
    data: [
      {
        key: '1',
        text: 'Livro 1',
        description: 'Teste descriçao',
        uri: 'https://picsum.photos/id/1011/200',
      },
      {
        key: '2',
        text: 'Livro 2',
        description: 'Teste descriçao',
        uri: 'https://picsum.photos/id/1012/200',
      },

      {
        key: '3',
        text: 'Livro 3',
        description: 'Teste descriçao',
        uri: 'https://picsum.photos/id/1013/200',
      },
      {
        key: '4',
        text: 'Livro 4',
        description: 'Teste descriçao',
        uri: 'https://picsum.photos/id/1015/200',
      },
      {
        key: '5',
        text: 'Livro 5',
        description: 'Teste descriçao',
        uri: 'https://picsum.photos/id/1016/200',
      },
    ],
  },
  {
    title: 'Destaque',
    data: [
      {
        key: '1',
        text: 'Item text 1',
        uri: 'https://picsum.photos/id/1020/200',
      },
      // {
      //   key: '2',
      //   text: 'Item text 2',
      //   uri: 'https://picsum.photos/id/1024/200',
      // },

      // {
      //   key: '3',
      //   text: 'Item text 3',
      //   uri: 'https://picsum.photos/id/1027/200',
      // },    
    ],
  },
];

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#102E4A',
  },
  sectionHeader: {
    fontWeight: '800',
    fontSize: 18,
    color: '#55C1FF',
  },
  item: {
    margin: 10,
  },
  itemPhoto: {
    width: 200,
    height: 200,
    borderRadius: 20,
  },
  itemText: {
    color: 'rgba(255, 255, 255, 0.5)',
    marginTop: 5,
  },
  h1: {
    fontSize: 20,
    fontWeight: 'bold',
    color: '#55C1FF',
  },
  highlightContainer: {
    padding: 8,
  },
  highlightScrollView: {
    alignItems: 'center',
  },
  highlightItem: {
    alignItems: 'center',
    marginHorizontal: 10,
  },
  highlightItemPhoto: {
    width: 370,
    height: 190,
    borderRadius: 20,
  },
  highlightItemText: {
    color: 'rgba(255, 255, 255, 0.5)',
  },
  card: {
    borderColor: 'gray',
    borderRadius: 5,
    overflow: 'hidden',
    width: 170,
    height: 250,
    marginBottom: 5,
  },
  cardImage: {
    width: 170,
    height: 180,
    borderRadius: 5,
  },
  cardTitle: {
    color: 'black',
    fontSize: 16,
    fontWeight: 'bold',
  },
  cardSubtitle: {
    color: 'black',
    fontSize: 12,
  },
});
