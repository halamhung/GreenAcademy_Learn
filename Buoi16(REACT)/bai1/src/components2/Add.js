import React ,{useState} from 'react'
import {Input} from 'reactstrap'

export default function Add(props) {
  const {add} = props;
  const [name,setName] = useState("")
  return (
    <div>
        <Input className='my-2 px-4' value={name} onChange={(e)=> setName(e.target.value)} onKeyDown={
          (e)=> {
            if(e.key=="Enter")
            {
              add(name);
              setName("");
            }
          }
        }/>
    </div>
  )
}
