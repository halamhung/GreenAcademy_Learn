import React, { useEffect, useState } from 'react'

export default function Hook3() {
  const[width,setWidth] = useState(window.innerWidth)
  const[isActive,setIsActive] = useState(true)
  useEffect(()=>{
    if(width<700){
      setIsActive(true)
    }
    else{
      setIsActive(false)
    }
  },[])
useEffect(()=>{
  const handleSize=()=>{
     setWidth(window.innerWidth)
     console.log(window.innerWidht)
     if(window.innerWidth<700){
      setIsActive(true)
     }
     else{
      setIsActive(false)
     }
  }
  window.addEventListener("resize",handleSize);
  return () =>{
    window.removeEventListener("resize",handleSize);
  }
},[])

  return (
    <div>
      <h1>Tìm hiểu sâu về cleanup</h1>
      <p>width:{width}</p>
      <div className={isActive ? "active sidebar":"sidebar"}></div>
    </div>
  )
}
