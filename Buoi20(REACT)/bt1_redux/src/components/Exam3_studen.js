
import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { changAvg, reCheck } from '../redux/Studentslice';

export default function Exam3_studen() {
    const student = useSelector(state=>state.student.student)
    const checked = useSelector(state=>state.student.checked)
    const dispatch = useDispatch();
  return (

    <div>
        <h1>student name:{student.name}</h1>
        <h1>math:{student.math}</h1>
        <h1>pro:{student.pro}</h1>
        <h1>avg:{student.dtb}</h1>
        <h1>checked:{checked? "true":"false"}</h1>
        <button onChange={() => dispatch(changAvg())}>tính điểm tb</button>
        <button onClick={()=> dispatch(reCheck())}>Check</button>
    </div>
  )
}
