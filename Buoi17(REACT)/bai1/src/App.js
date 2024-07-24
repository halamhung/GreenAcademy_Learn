
import { Container } from "reactstrap";
import API from "./components/API/API";
import Hook1 from "./components/Hook1";
import Hook2 from "./components/Hook2";
import Hook3 from "./components/Hook3";
function App() {
  return (
    <div className="App">
      <Container>
        <Hook1 />
        <Hook2/>
        <API/>
      
        {
          <Hook3/>
        }
      </Container>
    </div>
  );
}

export default App;
