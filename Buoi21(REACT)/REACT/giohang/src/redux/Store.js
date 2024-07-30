import {configureStore} from '@reduxjs/toolkit'
import ProductSlice from './ProductSlice'
import CartSlice from './CartSlice'
export const Store = configureStore({
  reducer:{
    products : ProductSlice,
    carts : CartSlice
  }  
})
export default Store