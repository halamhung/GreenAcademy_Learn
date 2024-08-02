import { createSlice } from "@reduxjs/toolkit";
const initialState = {
  products: [
    {
      id: 1,
      name: "Iphone",
      quantity: 100,
      checked: true,
    },
    {
      id: 2,
      name: "Samsung",
      quantity: 90,
      checked: false,
    },
    {
      id: 3,
      name: "Watch",
      quantity: 80,
      checked: false,
    },
    {
      id: 4,
      name: "Vivo",
      quantity: 70,
      checked: false,
    },
  ],
};

const ProductSlice = createSlice({
  name: "products",
  initialState,
  reducers: {
    addproduct(state, action) {
      const Idmax = state.products.reduce(
        (max, product) => Math.max(max, product.id),
        0
      );
      state.products = [
        ...state.products,
        {
          id: Idmax + 1,
          name: action.payload,
          quantity: 100,
          checked: true,
        },
      ];
    },
    deleteproduct(state, action) {
      state.products = state.products.filter(
        (item) => item.id !== action.payload
      );
    },
    updateproduct(state, action) {
      state.products = state.products.map((item) =>
        item.id === action.payload
          ? { ...item, name: action.payload.name, checked: true }
          : item
      );
    },
  },
});

export default ProductSlice.reducer;
export const { addproduct, deleteproduct, updateproduct } =
  ProductSlice.actions;
