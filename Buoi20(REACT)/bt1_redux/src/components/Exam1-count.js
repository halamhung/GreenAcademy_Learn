import React from 'react'
import {useDispatch, useSelector} from 'react-redux';
import { countDown, countUp } from '../redux/Countslice';
export default function Exam1() {
  const dispatch = useDispatch()
  const count = useSelector((state)=> state.count.value)
  return (
    <div>
        <h1>Count : {count}</h1>
        <button onClick={()=> dispatch(countUp())}>Count up</button>
        <button onClick={()=> dispatch(countDown())}>Count down</button>
    </div>
  )
}
