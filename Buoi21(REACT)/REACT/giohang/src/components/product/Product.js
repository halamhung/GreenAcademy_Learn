import React, { useEffect } from 'react'
import {useDispatch, useSelector} from 'react-redux'
import { fetchProduct } from '../../redux/ProductSlice';
import { addItem } from '../../redux/CartSlice';
import { Card, CardBody, Row } from 'reactstrap';
import './product.css'

export default function Product() {
  const dispatch = useDispatch();
  const {items , status , error} = useSelector(state=>state.products)

  useEffect(()=>{
    dispatch(fetchProduct());
  },[])
  if(status =='loading') return<div>loading...</div>
  if(status =='failed') return<div>{error}</div>
  return (
    <div>
        <h1 className='list'>Danh sách sản phẩm</h1>
       
          <Row className='row' >
            {
              items.map(product => (
                          
                <Card className='col-6 col-lg-2 m-2 py-2' key={product.id}>
                <h3>Tên sản phẩm: {product.product_name}</h3>
                <p>số lượng: {product.quantity}</p>
                <p>{product.price}k</p>
                <button onClick={()=> dispatch(addItem(product))}>add cart</button>
                </Card>
              ))
            }
            
          </Row>
         
        
    </div>
  )
}
