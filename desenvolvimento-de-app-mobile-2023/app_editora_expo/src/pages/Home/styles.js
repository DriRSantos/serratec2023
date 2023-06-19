import { StyleSheet } from "react-native";

export const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#102E4A',
    paddingTop: 30,
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
    padding: 10,
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
    height: 200,
    borderRadius: 20,
  },
  highlightItemText: {
    color: 'rgba(255, 255, 255, 0.5)',
    marginTop: 5,
  },
  itemPhotoBook: {
    width: 130,
    height: 200,
    borderRadius: 5,
  }
});
