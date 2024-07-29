import { configureStore } from "@reduxjs/toolkit";
import Countslice from "./Countslice";
import Userslice from "./Userslice";
import Studentslice from "./Studentslice";
import Todolistslice from "./Todolistslice";
const store = configureStore({
    reducer:{
        count: Countslice,
        user: Userslice,
        student : Studentslice,
        students: Todolistslice,
    }
})
export default store