import React, { useEffect } from "react";
import { useDispatch, useSelector } from "react-redux";
import { delmeo, Fetchmeo, addMeo, reCheckCat } from "../../redux/CatSlice";
import { Container, Input } from "reactstrap";
export default function Cat() {
  const dispatch = useDispatch();
  const { cats } = useSelector((state) => state.cats);
  useEffect(() => {
    dispatch(Fetchmeo());
  }, []);
  const handle_delete = (id) => {
    dispatch(delmeo(id));
  };
  const handle_add = (cat) => {
    dispatch(addMeo(cat));
  };
  const handle_checked = (cat) => {
    dispatch(reCheckCat(cat));
  };
  return (
    <div>
      <Container>
        <Input
          placeholder="Nhập tên"
          onKeyDown={(e) => {
            if (e.key === "Enter") {
              handle_add({ name: e.target.value, checked: false });
            }
          }}
        />
      </Container>
    </div>
  );
}
