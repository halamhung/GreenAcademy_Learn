import React, { useState } from "react";

export default function Hook1() {
  const [name, setName] = useState("");
  return(
    <div>
      <h1>Đây là Hook, name: {name}</h1>
      <input type="text" value={name} placeholder="Nhập tên của bạn" onChange={(e)=>setName(e.target.value)}></input>
    </div>
  
  ) 
}
