import "bootstrap/dist/css/bootstrap.min.css";
import Product from "./components/product/Product";
import { Provider } from "react-redux";
import Cart from "./components/cart/Cart";
function App() {
  return (
    <div className="App">
      <Cart />
      <Product />

    </div>
  );
}

export default App;
