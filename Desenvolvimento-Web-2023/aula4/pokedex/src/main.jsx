import React from 'react';
import ReactDOM from 'react-dom/client';
import './common/style/global.css';
import { AllRoutes } from './routes/AllRoutes';

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
      <AllRoutes />
  </React.StrictMode>
);