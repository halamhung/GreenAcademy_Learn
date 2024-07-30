import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import axios from "axios";
const initialState = {
  cats: [],
  curentpage: 1,
  status: "start",
  error: "",
};

const url = "https://66a07cf47053166bcabb954e.mockapi.io/Cat";
export const Fetchmeo = createAsyncThunk("cats/Fetchmeo", async () => {
  const res = await axios.get(url);
  return res.data;
});
export const delmeo = createAsyncThunk("cats/delmeo", async (id) => {
  await axios.delete(url + "/" + id);
  return id;
});

export const addMeo = createAsyncThunk("cats/addMeo", async (cat) => {
  const res = await axios.post(url, cat);
  return res.data;
});
export const reCheckCat = createAsyncThunk("cats/reCheckCat", async (cat) => {
  const res = await axios.put(url + "/" + cat.id, {
    ...cat,
    checked: !cat.checked,
  });
  return res.data;
});

const CatSlice = createSlice({
  name: "cats",
  initialState,
  reducers: {},
  extraReducers: (builder) => {
    builder
      .addCase(Fetchmeo.pending, (state) => {
        state.status = "loading";
      })
      .addCase(Fetchmeo.fulfilled, (state, action) => {
        state.status = "success";
      })
      .addCase(Fetchmeo.rejected, (state, action) => {
        state.status = "failed";
        state.error = action.error.message;
      })
      .addCase(delmeo.fulfilled, (state, action) => {
        state.cats = state.cats.filter((item) => item.id !== action.payload);
      });
  },
});
export default CatSlice.reducer;
