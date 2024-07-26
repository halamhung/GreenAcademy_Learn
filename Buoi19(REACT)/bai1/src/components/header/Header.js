import React, { useContext,useState } from 'react'
import { Nav, NavItem, NavbarToggler,Collapse,NavLink, Navbar  } from 'reactstrap'
import './Header.css'
import { AppContext } from '../../AppContext'
import { Link } from 'react-router-dom';
export default function Header() {
    const {count, setCount}= useContext(AppContext);
    const [collapsed, setCollapsed] = useState(true);

    const toggleNavbar = () => setCollapsed(!collapsed);
    const {cart} = useContext(AppContext)
  return (
    <div className='header'>
        <Navbar className='navbar navbar-expand-lg'>
        <NavbarToggler onClick={toggleNavbar} className="me-2" />
        <Collapse isOpen={!collapsed} navbar>
          <Nav >
            <NavItem>
              <NavLink href="/">home</NavLink>
            </NavItem>
            <NavItem>
              <NavLink href="/Product/">Product</NavLink>
            </NavItem>
            <NavItem>
              <NavLink href="/components/">Components</NavLink>
            </NavItem>
            <NavItem>
              <NavLink href="/components/">Components</NavLink>
            </NavItem>
          </Nav>
        </Collapse>
            <Link to="/cart">cart<span>{cart.length}</span></Link>
        </Navbar>
       
        
    </div>
  )
}
