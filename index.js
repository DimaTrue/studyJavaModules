import { AppRegistry } from 'react-native';
import App from './App';
import { name as appName } from './app.json';
import ToastExample from './ToastExample';

ToastExample.show('HI from Android Platform', 1000);

AppRegistry.registerComponent(appName, () => App);
