import React from 'react'
import { Button, Input, ListGroupItem } from 'reactstrap'

export default function Student(props) {
    const {student,reCheck,delByid} = props
  return (
    <div>
        <ListGroupItem className='student-item'>
            <Input type='checkbox' checked = {student.checked} onChange={()=> reCheck(student.id)}></Input>
            <p >
                {student.name}
            </p>
            <Button onClick={()=> delByid(student.id)}><i className='fa-solid fa-close'>Delete</i></Button>
        </ListGroupItem>
    </div>
  )
}
