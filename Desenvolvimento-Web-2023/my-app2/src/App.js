import './App.css';
import { Header } from './components/Header';
import { Footer } from './components/Footer';
import { PersonalData } from './components/PersonalData';
import { AcademicEducation } from './components/AcademicEducation';
import { Experience } from './components/Experience';

function App() {
  return (
    <>
    <Header />
    <PersonalData />
    <Experience />
    <AcademicEducation />
    <Footer />
    </>
  );
}

export default App;
