import React,{useContext} from 'react'
import { AppContext } from '../../AppContext'


export default function Cart() {
    const {cart} = useContext(AppContext)
  return (
    <div>Cart</div>
  )
}
