import React from 'react'
import { useState } from 'react'
import { addStudent } from '../redux/Todolistslice'

export default function Add(props) {
  const [text , setText] = useState("");
  const {handleadd} = props;
  return (
    <div>
      <input type="text" value={text} onChange={(e)=> setText(e.target.value)} onKeyDown={(e)=>{
        if(e.key === "Enter"){
          handleadd(text);
          setText("");
        }
      }}/>
    </div>
  )
}
