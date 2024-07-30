import "bootstrap/dist/css/bootstrap.min.css";
import Product from "./components/product/Product";
import { Provider } from "react-redux";
import Cart from "./components/cart/Cart";
import Cat from "./components/cat/Cat";
function App() {
  return (
    <div className="App">
      {/* <Cart/>
        <Product/> */}
      <Cat />
    </div>
  );
}

export default App;
