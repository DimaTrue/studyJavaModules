import { AppRegistry } from 'react-native';
import App from './App';
import { name as appName } from './app.json';
import ToastExample from './ToastExample';
import LocatorModule from './LocatorModule';

ToastExample.show('HI from Android Platform', 1000);

// console.warn('Locator---', LocatorModule);

AppRegistry.registerComponent(appName, () => App);
