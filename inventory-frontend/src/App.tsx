import React from 'react';
import { Route, Routes } from 'react-router-dom';
import Header from './components/Header';
import Footer from './components/Footer';
import Home from './pages/Home';
import Products from './pages/Products';
import Inventory from './pages/Inventory';
import './App.css';

const App: React.FC = () => (
  <div className="App">
    <Header />
    <main>
      <Routes>
      <Route path="/" element={<Home />} />
        <Route path="/products" element={<Products />} />
        <Route path="/inventory" element={<Inventory />} />
      </Routes>
    </main>
    <Footer />
  </div>
);

export default App;

