import { configureStore } from "@reduxjs/toolkit";
import ProductSlice from "./ProductSlice";

const Store = configureStore({
  reducer: {
    products: ProductSlice,
  },
});
export default Store;
