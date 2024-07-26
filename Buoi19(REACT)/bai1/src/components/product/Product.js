import React,{useContext} from 'react'
import { Link } from 'react-router-dom'
import { Button, Card, CardBody, CardSubtitle, CardText, CardTitle, Col } from 'reactstrap'
import Swal from 'sweetalert2'
import { AppContext } from '../../AppContext'

export default function Product(props) {
   const {product} = props
   const {addCart} = useContext(AppContext)
   const handle_add=(id)=>{
    Swal.fire({
      title:"Add Succesfull!",
      text:"yeah",
      icon: "success"
    });
    addCart(id);
   }
  return (
       <Col lg ={3} md={4} xs={6} className=''>
            <Card>
              <CardBody>
                <CardTitle tag= "h5">
                  Card title
                </CardTitle>
                <CardSubtitle className='mb-2 text-muted' tag='h6'>
                  CardSubtitle
                </CardSubtitle>
                <CardText>
                  <h1>product</h1>
                  <p>Info:{product.name}</p>
                  <Link to= {`/detail/${product.id}`}>chi tiết sản phẩm</Link>
                </CardText>
                <Button onClick={()=>handle_add(product.id)}>addCart</Button>
              </CardBody>
            </Card>
        </Col>
  )
}
