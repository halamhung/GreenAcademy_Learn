import React, { useEffect } from 'react'
import Add from './Add'
import Footer from './Footer'
import Student from './Student'
import {useState} from 'react'
import {Container,List,ListGroup} from 'reactstrap'

export default function Students() {
  const [flag,setFlag] = useState("");
  const [checkall,setCheckAll]= useState(false);
  const rename = (id,name)=> {
    let newlist_re= list.map(stud=> stud.id==id?{...stud,name:name}:stud)
    setList(newlist_re)
  }
  const [list,setList]= useState([
   {
    id:1,
    name:"Hùng",
    checked:true
   },
  
   {
    id:2,
    name:"Thắng",
    checked:false
   },
   {
    id:3,
    name:"Minh",
    checked:false
   },
   {
    id:4,
    name:"Tuấn",
    checked:false
   }
  ])
  //lưu trữ và load duy nhất 1 lần
  useEffect(()=>{
    if(localStorage.getItem("list")){
      setList(JSON.parse(localStorage.getItem("list")))
    }
  },[])
  console.log("render students")
  useEffect(()=>{
    console.log("load duy nhất 1 lần")
  },[])
  const deleteByid=(id)=>{
    const newList = list.filter(stud=>stud.id!==id)
    setList(newList)
    localStorage.setItem("list",JSON.stringify(newList))
  }
  const reCheck=(id)=>{
    let newList = list.map((stud=>stud.id==id?{...stud,checked:!stud.checked}:stud))
    setList(newList)
    localStorage.setItem("list",JSON.stringify(newList))
  }
  const add = (name)=>{
   const idmax = list.reduce((a,b)=> Math.max(a,b.id), -Infinity)
    setList([...list,{id:list.length ==0?1:idmax+1,name:name}])
  }
  const filterStudents =(list,flag)=>{
    if(flag=="CHECK"){
      return list.filter(stud=>stud.checked)
    }
    else if (flag=="NOCHECK"){
      return list.filter(stud=>!stud.checked)
  }
  else if(flag==""){
    
  }
  else if(flag=="DELETEALL"){
    setList(list.filter(stud=>stud.checked==false))
    localStorage.setItem("list",JSON.stringify(list.filter(stud=>stud.checked==false)))
    setFlag("")
  }
  else if(flag =="CHECK ALL"){
    setList(list.map(stud=>({...stud,checked:!checkall})),
    localStorage.setItem("list",JSON.stringify(list.map(stud=>({...stud,checked:!checkall})))),
    setCheckAll(!checkall),
    setFlag("")
  )
  }
  return list;
}

    return (
    <div>
       <Container className='w-50 text-center p-5 my-5'>
            <h1 className='title'>
                Students list
            </h1>
            <Add add={add} />
            <ListGroup>
                {
                   filterStudents(list,flag).map((stud,index)=>(<Student key={index} deleteByid={deleteByid} reCheck={reCheck} student={stud} rename={rename} />))
                }
            </ListGroup>
       </Container>
       <Footer setFlag={setFlag} checkall = {checkall} setCheckAll={setCheckAll} />
    </div>
  )
}
