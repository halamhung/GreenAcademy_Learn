import React, { useEffect, useState } from 'react'
import axios from 'axios'
import Product from '../product/Product';
import { Container, Row } from 'reactstrap';

export default function Products() {
  const [data,setData] = useState([])
const url="https://66a077917053166bcabb8106.mockapi.io/student"
const goidata=()=>{
  axios.get(url)
  .then(function(phanhoi){
    setData(phanhoi.data)
  })
  .catch(function(error){
    console.log(error)
  })
}

useEffect(()=>goidata(),[])
  return (
    <div>
          Sản phẩm mới nhất
          <Container>
            <Row>
              {
                data.map((item,index)=>(
                  <Product key={index} product={item}/>
                ))
              }
            </Row>
          </Container>
    </div>
  )
}