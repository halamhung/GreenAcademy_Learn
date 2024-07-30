import { createAsyncThunk, createSlice } from "@reduxjs/toolkit"
import axios from 'axios'

const initialState = {
    items:[],
    status: 'start',
    error: null,
}
//lấy api
export const fetchProduct = createAsyncThunk('products/fetchProduct', async ()=>{
    const response = await axios.get("https://66a07cf47053166bcabb954e.mockapi.io/Product");
    return response.data;
});

const productSlice = createSlice({
    name: 'products',
    initialState,
    reducers:{},
    extraReducers(builder){
        builder
        .addCase(fetchProduct.pending,(state)=>{
            state.status = 'loading';
        })
        .addCase(fetchProduct.fulfilled,(state,action)=>{
            state.status= 'suscces';
            state.items = action.payload
        })
        .addCase(fetchProduct.rejected,(state,action)=>{
            state.status = 'failed';
            state.error = action.error.message;
        });
    },
})
export default productSlice.reducer;