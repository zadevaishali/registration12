import { Component } from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Login from "./Login";

import Logout from './Logout';
import RegistrationForm from "./RegistrationForm";


class Layout extends Component {
    render() {
        return (<BrowserRouter>
            <div className="App">
                <Routes>
                    <Route path={"/"} element={<Login />} />
                    <Route path={"/registration"} element={<RegistrationForm />} />
                    <Route path={"/login"} element={<Login />} /> 
                    <Route path={"/logout"} element={<Logout />} />
                </Routes>
            </div>
        </BrowserRouter>);
    }
}
export default Layout;