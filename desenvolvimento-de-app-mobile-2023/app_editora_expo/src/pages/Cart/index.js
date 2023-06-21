import { Text } from "react-native-elements";
import { useNavigation } from '@react-navigation/native';
import { useEffect } from "react";

export function Cart({ navigation }) {

  // useEffect(() => {
  //   navigation.setOptions({
  //     headerLargeTitle: true,
  //   })
  // }, [navigation]);

  return (
    <>
      <Text>CART</Text>
    </>
  );
}