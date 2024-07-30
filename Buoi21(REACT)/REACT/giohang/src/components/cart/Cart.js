import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { removeItem,clearCart } from '../../redux/CartSlice';

const Cart = () => {
  const dispatch = useDispatch();
  const {items} = useSelector(state=>state.carts);
  return (
    <div>
        <h2>
          Cart 
        </h2>
        {
          items.lengt == 0 && <p>Your cart is empty</p>
        }
        {
          items.map(item=>(
            <div key = {items.id}>
              <h4>{items.product_name}</h4>
              <button onClick={()=> dispatch(removeItem(item))}>Remove</button>
            </div>
          ))
        }
        {
          items.lengt>0&& (
            <button onClick={()=>dispatch(clearCart())}>clearCart</button>
          )
        }
    </div>
  );
}
export default Cart;