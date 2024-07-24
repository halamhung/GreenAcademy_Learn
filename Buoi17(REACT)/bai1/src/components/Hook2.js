import React, { useEffect, useState } from 'react'

export default function Hook2() {
    const[count, setCount]= useState(1);
    const[number, setNumber] = useState(1);
    useEffect(()=> {
        console.log("side Effect");
        const x = setInterval(()=>{
            console.log("load count");
            setCount(preState => preState+1);
        })
        return () =>{
            clearInterval(x);
            console.log("Đây là clean up");
        }
    },[]);
  return (
    <div>
        
        <h1>Tìm hiểu Effect (phần 2)</h1>
        <ul>
            <li>count: {count}</li>
            <li>number: {number}</li>
            <li>xem thêm trong console</li>
        </ul>
        
       
    </div>
  )
}
