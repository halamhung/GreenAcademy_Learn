import React, { useState } from 'react'
import { Row } from 'reactstrap'
import Product from './product/Product'

export default function Product() {
    const [listpro,setListpro] = useState([
        {
            id:1,
            name:"Three Temples Bangkok City Tour Must Visit", 
            addr:"New York",
            price:149.99
        },
        {
            id:2,
            name:"Essence of Vietnam South to North", 
            addr:"New York",
            price:167.19
        },
        {
            id:3,
            name:"Osa Peninsula to Dominical City Tour", 
            addr:"New York",
            price:149.99
        },
        {
            id:4,
            name:"Mt Fuji, Hakone, Lake Ashi Cruise", 
            addr:"New York",
            price:149.99
        },
        {
            id:5,
            name:"Three Temples Bangkok City Tour Must Visit", 
            addr:"London",
            price:149.99
        },
        {
            id:6,
            name:"Essence of Vietnam South to North", 
            addr:"London",
            price:149.99
        },
        {
            id:7,
            name:"Osa Peninsula to Dominical City Tour", 
            addr:"London",
            price:149.99
        },
        {
            id:8,
            name:"Mt Fuji, Hakone, Lake Ashi Cruise", 
            addr:"London",
            price:149.99
        },
        {
            id:9,
            name:"Three Temples Bangkok City Tour Must Visit", 
            addr:"Tokyo",
            price:149.99
        },
        {
            id:10,
            name:"Three Temples Bangkok City Tour Must Visit", 
            addr:"Tokyo",
            price:149.99
        },
        {
            id:11,
            name:"Three Temples Bangkok City Tour Must Visit", 
            addr:"Tokyo",
            price:149.99
        },
        {
            id:12,
            name:"Three Temples Bangkok City Tour Must Visit", 
            addr:"Tokyo",
            price:149.99
        },
        {
            id:13,
            name:"Three Temples Bangkok City Tour Must Visit", 
            addr:"Los Angeles",
            price:149.99
        },
          {
            id:14,
            name:"Three Temples Bangkok City Tour Must Visit", 
            addr:"Los Angeles",
            price:149.99
        },
        {
            id:15,
            name:"Three Temples Bangkok City Tour Must Visit", 
            addr:"Los Angeles",
            price:149.99
        },
        {
            id:16,
            name:"Three Temples Bangkok City Tour Must Visit", 
            addr:"Los Angeles",
            price:149.99
        }
    ])
  return (
    <div>
        <Row>
            {listpro.map((item,index) => (
                <div key={index} className="col-md-3">
                    <div className="card">
                        <img src="https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.shutterstock.com%2Fsearch%2Fproduct%2Bimages&psig=AOvVaw33eN-4-7467n_59Y_0362&ust=1701452852324000&source=images&cd=vfe&ved=0CA8QjRxqFwoTCJ-X75_7-f8CFQAAAAAdAAAAABAD&uact=8&ved=2ahUKEwiD4b2756_AAxV_QmMBHbfyB0wQ9QF6BAgBEAE&usg=AOvVaw15_462834w_505_1089_1579_2048" className="card-img-top" alt="..." />
                        <div className="card-body">
                            <h5 className="card-title">{item.name}</h5>
                            <p className="card-text">{item.addr}</p>
                            <p className="card-text">Price: {item.price}</p>
                        </div>
                    </div>
                </div>
            ))}
        </Row>
    </div>
  )
}
