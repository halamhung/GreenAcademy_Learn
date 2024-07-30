import { createSlice } from "@reduxjs/toolkit";

const CartSlice = createSlice({
    name:"cart",
    initialState:{
        items:[],
        status:'idle',
        error:'null'
    },
    reducers:{
            addItem:(state , action) =>{
                state.items.push(action.payload);
            },
            removeItem:(state, action)=>{
                state.items = state.items.filter(item=> item.id!== action.payload.id)
            },
            clearCart:(state)=>{
                state.items = [];
            }
    }
})
export const {addItem, removeItem, clearCart} = CartSlice.actions;
export default CartSlice.reducer;