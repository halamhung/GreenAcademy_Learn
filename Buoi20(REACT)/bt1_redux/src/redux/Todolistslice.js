import { createSlice } from "@reduxjs/toolkit"


const initialState= {
    students:[{
        id:1,
        name: "Hùng",
        checked : true
    },
    {
        id:2,
        name: "Minh",
        checked : false
    },
    {
        id:3,
        name: "Lê",
        checked : true
    },
    {
        id:4,
        name: "Lai",
        checked : true
    }]
}

const Todolistslice = createSlice({
    name : "students",
    initialState,
    reducers:{
        addStudent(state,action){
            state.students=[...state.students,{id:4 ,name:action.payload,checked:true}]
        },
        deleteStudent(state,action){
            state.students = state.students.filter(item => item.id !==action.payload)
        }
    }
})
export const {addStudent,deleteStudent} = Todolistslice.actions
export default Todolistslice.reducer