import axios from "axios";
import { createContext ,useState} from "react";

export const AppContext = createContext({})
export const AppProvider = ({children})=>{
    const [count,setCount] = useState(1)
    const [product, setProduct] = useState([])
    
    const [cart,setCart] = useState([]);
    const url ="https://66a077917053166bcabb8106.mockapi.io/student"
    const fetchProducts = () =>{
        axios.get(url)
        .then(function(res){
            setProduct(res.data)
        })
        .catch(function(error){
            console.log(error)
        })
    }
    const addCart = (id) => {   
        const res = product.find(item=>item.id===id)
        setCart([...cart,res])
    }




    return <AppContext.Provider value={{count,setCount,cart,addCart}}>
        {children}
    </AppContext.Provider>
}