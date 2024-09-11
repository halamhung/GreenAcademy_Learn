import { createSlice, createAsyncThunk } from '@reduxjs/toolkit';

import axios from 'axios';
import StudentPage from '../pages/student/StudentPage';

const BASE_URL = 'http://localhost:8080/api/v1/admin';

export const getAll = createAsyncThunk("student/getAll", async ({ currentPage, limit }, thunkAPI) => {
    const url = BASE_URL + `/student/list?page=${currentPage}&size=${limit}`;
    try {
        const response = await axios.get(url);
        return response.data;
    }
    catch (error) {
        return thunkAPI.rejectWithValue(error.response.data); // Trả về lỗi nếu có
    }
});

// Action creator để thêm mới sinh viên
export const addNewStudent = createAsyncThunk('student/addNewStudent', async (student, thunkAPI) => {
    const url = BASE_URL + '/student';
    try {
        console.log(student)
        const response = await axios.post(url, student);
        return response.data;
    } catch (error) {
        return thunkAPI.rejectWithValue(error.response.data); // trả về lỗi nếu có
    }
});

export const deleteStudent = createAsyncThunk('student/deleteStudent', async (id, thunkAPI) => {
    const url = BASE_URL + `/student/${id}`;
    try {
        const response = await axios.delete(url);
        return response.data; // trả về dữ liệu phản hồi
    } catch (error) {
        return thunkAPI.rejectWithValue(error.response.data); // trả về lỗi nếu có
    }
});

const studentSlice = createSlice({
    name: "student",
    initialState: {
        status: 'idle',
        error: null,
        students: null,
        totalPages: 10,
        status: "",
        message: "",
    },
    reducers: {

    },
    extraReducers: (builder) => {
        builder
            .addCase(getAll.fulfilled, (state, action) => {
                state.students = action.payload.data.studentResonseList
                state.totalPages = action.payload.data.totalPages
            })
            .addCase(addNewStudent.fulfilled, (state, action) => {

            })
            .addCase(addNewStudent.rejected, (state, action) => {
                state.status = action.payload.status;
                state.message = action.payload.message;
                state.students = state.students.filter(student => student.id !== action.payload);
            })
    },
});
export default studentSlice.reducer