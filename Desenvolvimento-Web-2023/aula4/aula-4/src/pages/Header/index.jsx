import { Outlet } from "react-router-dom";

export function Header(){
  return (
    <>
      <h1>Teste header</h1>
      <Outlet />
    </>
  )
}