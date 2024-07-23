import React from 'react'
import { useState } from 'react'

export default function Hook1() {
  const [student, setStudent] = useState({name:"", age:0});
    return (
    <div>
        <h1>
            em tên là : {student.name}
            <br/>
            em năm nay : {student.age} tuổi
        </h1>
        <from>
            <input type='text' placeholder='nhập tên' value={student.name} onChange={(e)=> setStudent({...student, name:e.target.value})}></input>
            <br/>
            <input type='number' placeholder='nhập tuổi' value={student.age} onChange={(e)=> setStudent({...student, age:Number(e.target.value)})}></input>
        </from>
    </div>
  )
}
