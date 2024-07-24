import React ,{useEffect, useState}  from 'react'

export default function Hook1() {
    const [count, setCount] = useState(1)
    const[number , setNumber] = useState(1)
    useEffect(()=>{
        
        console.log ("in trong ruột phần tử");
    },[])
    console.log("render");
  
    return (
    <div>
      <h1>tìm hiểu Effect(phần 1)</h1>
      <p>count: {count}</p>
      <button onClick={()=> setCount(count+1)}>tăng</button>
      <p>number: {number}</p>
      <button onClick={()=> setNumber(number+1)}>tăng</button>
    </div>
  )

}
