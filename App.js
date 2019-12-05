import React from 'react';
import {
  SafeAreaView,
  StyleSheet,
  View,
  Text,
  TouchableOpacity,
} from 'react-native';

import LocatorModule from './LocatorModule';

const App = () => {
  return (
    <View style={styles.container} onPress={() => LocatorModule.onTheStart()}>
      {console.warn('LocatorStart: ', LocatorModule.onTheStart)}
      {console.warn('LocatorEnd: ', LocatorModule.onTheEnd)}
      <TouchableOpacity style={styles.btn}>
        <Text>Start Service</Text>
      </TouchableOpacity>
      <TouchableOpacity
        style={styles.btn}
        onPress={() => LocatorModule.onTheEnd()}>
        <Text>Stop Service</Text>
      </TouchableOpacity>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  btn: {
    margin: 20,
    padding: 20,
    borderWidth: 1,
  },
});

export default App;
