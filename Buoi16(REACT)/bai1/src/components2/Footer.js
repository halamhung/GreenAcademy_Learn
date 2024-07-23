import React from 'react'
import { Button } from 'reactstrap'
export default function Footer(props) {
  const {setFlag} = props;
  return (
    <div className='my-3'>
      <Button className='btn-success mx1'onClick={()=>setFlag("CHECK")}>filter check</Button>
      <Button className='btn-success mx1'onClick={()=> setFlag("NOCHECK")}  >NOCHECK</Button>
      <Button className='btn-success mx1'onClick={()=> setFlag("")}  >CLEAR filter</Button>
      <Button className='btn-success mx1'onClick={()=> setFlag("DELETEALL")}  >DELETEALL</Button>
    </div>
  )
}
