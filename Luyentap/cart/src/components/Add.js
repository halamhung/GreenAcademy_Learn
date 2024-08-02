import React, { useState } from "react";
import { Input } from "reactstrap";

export default function Add(props) {
  const [text, setText] = useState("");
  const { handle_add } = props;
  return (
    <div>
      <Input
        type="text"
        value={text}
        onChange={(e) => setText(e.target.value)}
        onKeyDown={(e) => {
          if (e.key === "Enter") {
            handle_add(text);
            setText("");
          }
        }}
      />
    </div>
  );
}
