import { useState } from "react";


export default function TinhToan() {
    const [a, seTa] = useState("");
    const [b, seTb] = useState("");
    const [result, setRes] = useState(""); 
  return (
    <div>
        <h1>Tính toán</h1>
        <input type='text' placeholder='Nhập vào a' value={a} onChange={(e)=> seTa(e.target.value*1)}/>
        <input type='text' placeholder='Nhập vào b' value={b} onChange={(e)=>seTb(e.target.value*1)}></input>
        <button onClick={()=> setRes(a+b)} >+</button>
        <button onClick={()=> setRes(a-b)} >-</button>
        <button onClick={()=> setRes(a*b)} >*</button>
        <button onClick={()=> setRes((a/b).toFixed(2))} >/</button> <br></br>
        <button>Result: {result}</button>
    </div>
  )
}
