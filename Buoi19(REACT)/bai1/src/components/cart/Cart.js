import React,{useContext} from 'react'
import { AppContext } from '../../AppContext'
import { Container, Table } from 'reactstrap'


export default function Cart() {
    const {cart} = useContext(AppContext)
  return (
    <div>
        <Container>
            <Table hover>
                <thead>
                    
                </thead>
            </Table>
        </Container>
    </div>
  )
}
