import Weather from './components/API/Weather';
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from './components/header/Header';
import {
  BrowserRouter as Router,
  createBrowserRouter,
  Route,
  RouterProvider,
  Routes,
} from "react-router-dom";

import Home from './pages/home/Home';
import Product from './pages/product/Product';
import { AppProvider } from './AppContext';


function App() {
  return (
    <div className="App">
    
      
      <AppProvider>
        <Router>
          <Routes>
            <Route index element={<Home/>}/>
            <Route path='/weather' element={<Weather/>}/>
            <Route path='/product' element={<Product/>}/>

            {/* <Route path='*' element = {</>} /> */}
          </Routes>
        </Router>
        
      </AppProvider>
      
     
      
    </div>
  );
}

export default App;
