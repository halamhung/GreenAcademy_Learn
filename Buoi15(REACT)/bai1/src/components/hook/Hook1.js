import React, { useRef, useState } from "react";
import "./hook1.css";
import { Button } from "reactstrap";
export default function hook1() {
  const [flag, setFlag] = useState(true);
  const [count, setCount] = useState(10)
  const sidebarRef = useRef();
  const handle_count_down = () => {
    setCount(count -1)
    setCount(preState => preState -1) // trừ thêm 1
    setCount(preState => preState -1)
  };
  const handle_count_up = ()=> {
    setCount(count +1);
    setCount(preState => preState +1)
    setCount(preState => preState +1)
  }
  
  console.log(flag);
  return (
    <>
      <h1>Đếm: {count}</h1>
      <button onClick={handle_count_down}>Đếm ngược</button>
      <button onClick={handle_count_up}>Đếm tăng</button>
      <div className={flag ? "hook1 active" : "hook1"}>
        <h1>hook1</h1>
        <p>Flag: {flag ? "True" : "false"}</p>
      </div>
      <div className="doimau" ref={sidebarRef}></div>
      <button
        onClick={() => {
          setFlag(!flag);
          sidebarRef.current.classList.toggle("active");
        }}>
        click me
      </button>
      <h1>ví dụ về reactstrap</h1>
    <Button color="primary">Primary</Button>
    </>
    
  );
}
