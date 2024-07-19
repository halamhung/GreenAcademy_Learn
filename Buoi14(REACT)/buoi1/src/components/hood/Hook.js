import { useState } from "react";
function Hook(){
    const [count, setCount] = useState(1);
    function handle_count_up(){
        setCount(count + 1);
    }
    function handle_count_down(){
        setCount(count - 1)
    }
    return(
        <div>
            <h1>
                Tìm hiểu useState _Green academy
            </h1>
            <p>count:{count}</p>
            <button onClick={handle_count_up}>Tăng 1</button>
            <button onClick={handle_count_down}>Giảm</button>
        </div>
    )
}
export default Hook;