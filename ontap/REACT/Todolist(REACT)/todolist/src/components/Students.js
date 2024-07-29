import React, { useEffect, useState } from 'react'
import {Container, ListGroup} from 'reactstrap'
import axios from "axios"
import Add from './Add'
import Footer from './Footer'
import Student from './Student'

export default function Students() {
    const [list, setList] = useState([])
   
    const url = "https://66a07cf47053166bcabb954e.mockapi.io/Student"
    const studentList = () =>{
        axios.get(url)
        .then(function(res){
            setList(res.data)
        })
        .catch(function(err){
            console.log(err)
        })
    }
    const delByid = (id) =>{
        // KHÔNG DÙNG API setList(list.filter((stud=>stud.id!== id)))
        axios.delete(`${url}/${id}`)
        .then(function(res){
            studentList();
        })
        .catch(function(err){
            console.log(err)
        })
        setList(list.filter((stud=>stud.id!== id)))
    }
const reCheck =(id,checked) => {
    // KHÔNG DÙNG API:  let newList= list.map((student=>student.id ===id?{...student, checked:!student.checked}:student))
    // setList(newList);
    axios.post(`${url}/${id}`)
    .then(function(res){
        let newList= res.data.map((student=>student.id ===id?{...student, checked:!student.checked}:student))
        
    })
    .catch(function(err){
        console.log(err)
    })
    }
    useEffect(()=>{
        studentList();
    },[])
  return (
    <div>
        <Container className='w-50 text-center p-5 my-5'>
            <h1>Student list</h1>
            <Add/>
            <ListGroup>
                {   
                    list.map((stu,index)=>(<Student key ={index} student = {stu} reCheck ={reCheck} delByid={delByid}/>))
                }
            </ListGroup>
            <Footer/>
        </Container>
    </div>
  )
}
