import React from "react";
import { useDispatch, useSelector } from "react-redux";
import { Container, Row, Table } from "reactstrap";
import Add from "./Add";
import { addproduct, deleteproduct } from "../redux/ProductSlice";
export default function Product() {
  const products = useSelector((state) => state.products.products);
  const dispatch = useDispatch();
  const handle_add = (text) => {
    dispatch(addproduct(text));
  };
  return (
    <>
      <Container>
        <h1 className="text-center p-3 m-2">Danh sách sản phẩm</h1>
        <Add handle_add={handle_add} />
        <Table>
          <thead>
            <tr>
              <th>#</th>
              <th>Tên sản phẩm</th>
              <th>Số lượng</th>
              <th>Đã kiểm tra</th>
              <th>Chức năng</th>
            </tr>
          </thead>
          <tbody>
            {products.map((item, index) => (
              <tr key={index}>
                <td>{item.id}</td>
                <td>{item.name}</td>
                <td>{item.quantity}</td>
                <td>{item.checked ? "true" : "flase"}</td>
                <td>
                  <button>Thêm vào giỏ</button>
                  <button>Sửa</button>
                  <button onClick={() => dispatch(deleteproduct(item.id))}>
                    Xóa
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </Table>
      </Container>
    </>
  );
}
