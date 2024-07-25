import Reactm, {useState, useEffect} from 'react'
import axios from 'axios';
import 'bootstrap/dist/css/bootstrap.min.css';
import {Button,Input,Table} from 'reactstrap';

export default function API() {
    const [data,setData] = useState([]);
    const [message,setMessage] = useState(null)
    const [text , setText] = useState("")
   const url ="https://66a07cf47053166bcabb954e.mockapi.io/Student"
    const getStudents = () => {
     
        //lấy api
        axios.get(url)
        .then(function(res){
            console.log(res.data);
            setData(res.data)
        })
        .catch(function(err){
            console.log(err)
        })
    }

    //thêm sinh viên
     const addstudent = (txt) => {
        axios.post(url,{
            name:txt
        }).then(function(res){
            console.log(res)
            setMessage("Add succes")
            setData([...data,{id:res.data.id,name:txt}])
        })
        .catch(function(err){
            console.log(err)
        })
     }

    //xóa sinh viên
    const deleteStudent = (id)=>{
        axios.delete(url +"/"+ id)
        .then(function(res){
            setMessage("Delete successfull")
            getStudents();
        })
        .catch(function(err){
            console.log(err)
        })
    }

    //sửa sinh viên
    const editsinhvien = (id,txt) =>{
        axios.put(url + "/" + id, {
           name : txt   
        }).then(function(res){
            setMessage("Add success")
            setData(data.map(item=>item.id ===id?{...item,name:txt}:item))
        }).catch(function (err){
            console.log(err)
        })
            
    }

    useEffect(() =>{
        getStudents();
    },[])
  return (
    <div>
     
            <h1>Tìm hiểu API</h1>
           
            {
                message && <p>{message}</p>
            }
            <h1>List student</h1>
            <Input type='text' value={text} onChange={(e)=> setText} />
            <Table>
                <thead>
                    <tr>

                        <th>id</th>
                        <th>name</th>
                        <th>action</th>
                    </tr>
                </thead>
                <tbody>
                        {
                            data && data.map((item,index)=>(
                                <tr>
                                    <td>
                                        {item.id}
                                    </td>
                                    <td>
                                        {item.name}
                                    </td>
                                    <td>
                                        <Button onClick={()=> deleteStudent(item.id)} className="'btn btn-danger">Delete</Button>
                                        <Button onClick={()=> editsinhvien(item.id)}  className="'btn btn-success">Edit</Button>
                                    </td>
                                </tr>
                            ))
                        }
                </tbody>
            </Table>
    </div>
  )
}
