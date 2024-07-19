
import Header from "./components/header/Header";
import Footer from "./components/footer/Footer";
import {Main,Main2} from "./components/main/Main";
import Hook from "./components/hood/Hook";
import Hook1 from "./components/hood/Hook1";


function App() {
  const name = "Hùng";
  return (
    <div>
      <Header/>
      <Main/>
      <Hook/>
      <Hook1/>
      <Main2/>
      <Footer name1={name}/>
    </div>
  );
}

export default App;
