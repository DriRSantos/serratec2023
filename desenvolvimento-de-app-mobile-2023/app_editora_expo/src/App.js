import 'react-native-gesture-handler';
import { DataProvider } from './context/DataContext';
import { Routes } from './routes/routes';

export default function App() {
  return (
    <DataProvider>
      <Routes />
    </DataProvider>
  );
}