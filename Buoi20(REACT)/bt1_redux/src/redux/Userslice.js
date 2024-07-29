import {createSlice} from '@reduxjs/toolkit'
const initialState={
    user:{
        name: "hùng",
        age : 23
    }
}
const userSlice=createSlice({
    name:"user",
    initialState,
    reducers:{
            changName(state,action){
                state.user.name = action.payload;
            },
            changAge(state,action){
                state.user.age = action.payload;
            }
    }
})
export const {changName,changAge} = userSlice.actions
export default userSlice.reducer