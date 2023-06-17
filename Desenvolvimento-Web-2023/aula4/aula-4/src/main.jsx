import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { Home } from './components/Home/index.jsx';
import './index.css';
import { Login } from './pages/Login';
import { Header } from './pages/Header';
import App from './App.jsx';

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <BrowserRouter>
      <Routes>
        <Route Component={Header} path='/' >
          <Route Component={Home} path='/' />
          <Route Component={App} path='/app' />
          <Route Component={Login} path='/login' />
        </Route>
      </Routes>
    </BrowserRouter>
  </React.StrictMode>,
)
