import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { Home } from '../pages/Home';
import { Login } from '../pages/Login';
// import { Header } from '../components/Header';

export function AllRoutes() {
    return (
        <BrowserRouter>
            <Routes>
                {/* <Route Component={Header} path="/header" /> */}
                <Route Component={Home} path="/" />
                <Route Component={Login} path="/login" />
            </Routes>
        </BrowserRouter>
    )
}