import React from 'react'
import { useState } from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { addStudent, deleteStudent } from '../redux/Todolistslice';
import Add from './Add';

export default function Todolist() {
  const students = useSelector(state=>state.students.students)
  const dispatch = useDispatch();
  console.log("render todolist");
  const [flag,setFlag] = useState("")
  const handleadd = (text) => {
    dispatch(addStudent(text))
  }

  const filterStudent=(list,flag)=>{
    if(flag == "CHECKED"){
        return list.filter(item=>item.checked)
    }
    else if(flag == "NOCHECKED"){
        return list.filter(item=>!item.checked)
    }
    else {
        return list;
    }
  }
    return (
    <div>
        <Add handleadd={handleadd}/>
        {
            filterStudent(students,flag).map((item,index)=> 
            <div key={index}>
                {item.name}
                <button onClick={()=>dispatch(deleteStudent(item.id))}>Delete</button>
          
            </div>
            )
        }
         <button onClick={()=>setFlag("CHECKED")}>CHECKED</button>
         <button onClick={()=>setFlag("NOCHECKED")}>NOCHECKED</button>
         <button onClick={()=>setFlag("")}>ALL</button>
     
    </div>
  )
}
