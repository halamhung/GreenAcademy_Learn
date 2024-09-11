import React, {useState} from 'react'
import Header from '../../components/header/Header'
import Student from '../../components/student/Student'
import {Button, FormGroup, Input, Label, Modal, ModalBody, ModalFooter, ModalHeader} from "reactstrap";
import {useDispatch} from "react-redux";
import {addNewStudent} from "../../redux/studentSlice";

export default function StudentPage() {
    const [modal , setModal] = useState(false)
    const [student, setStudent] = useState({
        ten : "Lê mèo",
        thanhPho: "Hồ chí minh",
        xepLoai : "Giỏi",
        ngaySinh : "01-08-2001" // dd-mm-yyyy
    });
    const dispatch = useDispatch();
    const toggle = () => setModal(!modal)
    const handle_add = () => {
        toggle();
        console.log(student);
        dispatch(addNewStudent(student));
    };

    const handleChange = (e) => {
        const {name , value} = e.target;
        if(name === 'ngaySinh'){
            setStudent(prevStudent => ({
                ...prevStudent,
                [name]: convertDateToDDMMYYYY(value)
            }));
        } else {
            setStudent(prevStudent => ({
                ...prevStudent,
                [name]: value
            }));
        }
    };
    const convertDateToYYYYMMDD = (date) => {
    const [day, month, year] = date.split('-');
    return `${year}-${month}-${day}`;
    };
    const convertDateToDDMMYYYY = (date) => {
        const [year,month,day] = date.split('-');
        return `${day}-${month}-${year}`;
    }

  return (
    <div>
        <Header />
        <Button onClick={toggle} className='btn btn-success' >Thêm sinh viên</Button>
        <h1>Student Page</h1>
        <Student/>
        <Modal isOpen={modal} toggle={toggle}>
            <ModalHeader toggle={toggle}>Thêm sinh viên</ModalHeader>
            <ModalBody>
            <FormGroup>
        <Label for="exampleEmail">
            Họ Tên
        </Label>
        <Input
            id="exampleEmail"
            name="ten"
            placeholder="Họ Tên"
            type="text"
            value={student.ten}
            onChange={handleChange}
        />
            </FormGroup>
                {''}
            <FormGroup>
                    <Label for="exampleEmail">
                        Thành phố
                    </Label>
                    <Input
                    id="exampleEmail"
                    name="thanhPho"
                    placeholder="Họ tên"
                    type="text"
                    value={student.thanhPho}
                    onChange={handleChange}
                    />
                </FormGroup>
          <FormGroup>
              <Label for = "exampleSelect">
                  Xếp loại
              </Label>
              <Input
              id="exampleSelect"
              name="xepLoai"
              type="select"
              value={student.xepLoai}
              onChange={handleChange}
              >
                <option>
                    Giỏi
                </option>
                  <option>
                    Khá
                </option>
                  <option>
                    Trung bình
                </option>
                  <option>
                    Yếu
                </option>
              </Input>
          </FormGroup>
        <FormGroup>
            <Label for ="ngaySinh">
                Ngày sinh
            </Label>
            <Input
            id="ngaySinh"
            name="ngaySinh"
            placeholder="date placeholder"
            type="date"
            value={convertDateToYYYYMMDD(student.ngaySinh)} // convert date to format input
            onChange={handleChange}
            />
        </FormGroup>
            </ModalBody>
            <ModalFooter>
                <Button color="primary" onClick={handle_add}>Thêm</Button>{' '}
                <Button color="secondary" onClick={toggle}>Hủy</Button>
            </ModalFooter>
        </Modal>
    </div>
  )
}
