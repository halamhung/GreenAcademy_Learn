import Weather from './components/API/Weather';
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from './components/header/Header';
import {
  BrowserRouter,
  createBrowserRouter,
  Route,
  RouterProvider,
  Routes,
} from "react-router-dom";
import Product from './components/products/Product';
import Contact from './components/contact/Contact';
import Exeption from './components/Exeption';

function App() {
  return (
    <div className="App">
      <Header/>
      
      <BrowserRouter>
      <Routes>
        <Route path='/' element={<Product/>}/>
        <Route path='/weather' element={<Weather/>}/>
        <Route path='/' element={<Contact/>}/>
        <Route path='*' element = {<Exeption/>} />
      </Routes>
      </BrowserRouter>
      
    </div>
  );
}

export default App;
