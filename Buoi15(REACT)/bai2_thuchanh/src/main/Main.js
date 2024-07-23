import React, { useState } from "react";
import "./Main.css";
import {
  Button,
  NavItem,
  Col,
  Container,
  Nav,
  TabContent,
  TabPane,
  Row,
  CardBody,
  Card,
  CardTitle,
  CardSubtitle,
  CardText,
} from "reactstrap";

export default function Main(props) {
  const { pro } = props;
  const [activeButton, setActiveButton] = useState("New York"); // Nút đang hoạt động ban đầu

  const handleButtonClick = (cityName) => {
    setActiveButton(cityName); // Cập nhật trạng thái khi nhấp vào nút
  };

  return (
    <>
      <Container className="mt-5">
        <div className="header_content">
          <h3>Điểm đến hoàn hảo</h3>
          <h2>Điểm đến thịnh hành</h2>
        </div>
        <Nav>
          <NavItem key="New York">
            <Button
              active={activeButton === "New York"} // Cài đặt hoạt động động dựa trên trạng thái
              onClick={() => handleButtonClick("New York")}
              className="btn-content">
              New York
            </Button>
          </NavItem>
          <NavItem key="London">
            <Button
              active={activeButton === "London"} // Cài đặt hoạt động động dựa trên trạng thái
              onClick={() => handleButtonClick("London")}
              className="btn-content">
              Luân Đôn
            </Button>
          </NavItem>
          <NavItem key="Tokyo">
            <Button
              active={activeButton === "Tokyo"} // Cài đặt hoạt động động dựa trên trạng thái
              onClick={() => handleButtonClick("Tokyo")}
              className="btn-content">
              Tokyo
            </Button>
          </NavItem>
          <NavItem key="Los Angeles">
            <Button
              active={activeButton === "Los Angeles"} // Cài đặt hoạt động động dựa trên trạng thái
              onClick={() => handleButtonClick("Los Angeles")}
              className="btn-content">
              Los Angeles
            </Button>
          </NavItem>
        </Nav>
        <TabContent activeTab={activeButton}>
          {" "}
          {/* Cài đặt tab hoạt động dựa trên trạng thái */}
          <TabPane tabId="New York">
            <Row>
              <h1>{pro.name}</h1>
              <h1>{pro.addr}</h1>
            </Row>
          </TabPane>
          {/* Thêm TabPanes cho các thành phố khác nếu cần thiết */}
        </TabContent>
      </Container>
    </>
  );
}
