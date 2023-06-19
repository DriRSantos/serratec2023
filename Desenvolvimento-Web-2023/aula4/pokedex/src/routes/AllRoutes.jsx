import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { Header } from '../components/Header';
import { Home } from '../pages/Home';
import { Login } from '../pages/Login';
import { NotFound } from '../pages/NotFound';
import { Footer } from '../components/Footer';

export function AllRoutes() {
    return (
        <BrowserRouter>
            <Routes>
                <Route Component={Header}>
                    <Route Component={Footer}>
                        <Route Component={Home} path="/" />
                        <Route Component={Login} path="/login" />
                        <Route Component={NotFound} path="*" />

                    </Route>
                </Route>
            </Routes>
        </BrowserRouter>
    )
}