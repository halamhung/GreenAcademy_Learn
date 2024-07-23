import React, { useState } from "react";
import { ListGroupItem, Button, Input } from "reactstrap";

export default function Student(props) {
  const [isEdit, setIsedit] = useState(false);
  const { student, reCheck, deleteByid, rename } = props;
  const [text, setText] = useState(student.name);

  return (
    <ListGroupItem className="student-item">
      <Input
        type="checkbox"
        checked={student.checked}
        onChange={() => reCheck(student.id)}
      />
      <div
        className={student.checked ? "student-name active" : "student-name"}
        onClick={() => reCheck(student.id)}>
        {!isEdit ? (
          <p onDoubleClick={() => setIsedit(true)}>{student.name}</p>
        ) : (
          <Input
            value={text}
            onChange={(e) => setText(e.target.value)}
            onKeyDown={(e) => {
              if (e.key == "Enter") {
                setIsedit(false);
                rename(student.id, text);
              }
            }}
          />
        )}
      </div>

      <Button>
        <i
          className="fa-solid fa-close"
          onClick={() => deleteByid(student.id)}></i>
      </Button>
    </ListGroupItem>
  );
}
