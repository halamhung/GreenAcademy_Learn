import {useState} from "react"

function Hook1(){
    console.log("Render hook1");
    const [number, setNumber] = useState(10);
    
    function handle_Number_up(){
        setNumber(number + 10);
    }
    return (
        <div>
            <p>Number : {number}</p>
            <button onClick={handle_Number_up}>Tăng 10</button>
        </div>
    )
}
export default Hook1;