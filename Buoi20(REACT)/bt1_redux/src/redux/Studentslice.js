import { createSlice } from "@reduxjs/toolkit"

const initialState = {
    student:{
        name: "Hùng",
        math: "9",
        pro : "3.5",
        dtb: 0,
    },
    checked: false,
}

const Studentslice = createSlice({
    name: "student",
    initialState,
    reducers:{
        changAvg(state){
            state.student.dtb=(state.student.math + state.student.pro)/2;
        },
        reCheck(state){
            state.checked = !state.checked;
        }
    }
})
export const{changAvg,reCheck} = Studentslice.actions
export default Studentslice.reducer
