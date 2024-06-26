import React from 'react';
import { Link } from 'react-router-dom';

const Header: React.FC = () => (
  <header>
    <nav>
      <ul>
        <li><Link to="/">Home</Link></li>
        <li><Link to="/products">Productos</Link></li>
        <li><Link to="/inventory">Inventario</Link></li>
      </ul>
    </nav>
  </header>
);

export default Header;
