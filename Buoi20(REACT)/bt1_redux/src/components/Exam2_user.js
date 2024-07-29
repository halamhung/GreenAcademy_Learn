import React from 'react'
import {useDispatch, useSelector} from 'react-redux'
import { changAge, changName } from '../redux/Userslice';

export default function Exam2_user() {
  const dispatch = useDispatch();
  const user = useSelector(state=>state.user.user)
  return (
    <div>
      <h1>Tên user :{user.name}</h1>
      <h1>Tuổi user :{user.age}</h1>
      <button onClick={()=> dispatch(changName("Minh"))}>Đổi Tên</button>
      <button onClick={()=> dispatch(changAge(40))}>Đổi Tuổi</button>
    </div>
  )
}
