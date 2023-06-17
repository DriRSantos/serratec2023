import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';
import App2 from './App2';
import App3 from './App3';
import App4 from './App4';
import { App3Copy } from './App3 copy';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App name={"Dri"} /> {/* pode passar a propriedade para a função */}
    <App2 />
    <App3 />
    <App3Copy name={"Dri"} />
    <App4 />
  </React.StrictMode>
);