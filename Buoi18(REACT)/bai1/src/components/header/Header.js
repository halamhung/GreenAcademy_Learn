import React from 'react'
import { Nav, NavItem } from 'reactstrap'
import './Header.css'
export default function Header() {
  return (
    <div className='header'>
        <Nav>
            <NavItem>
                <a href="#">Home</a>
            </NavItem>
            <NavItem>
                <a href="#">About</a>
            </NavItem>
            <NavItem>
                <a href="#">Contact</a>
            </NavItem>
            <NavItem>
                <a href="#">Weather</a>
            </NavItem>
        </Nav>
    </div>
  )
}
