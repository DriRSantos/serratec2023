import { Outlet, Link, useLocation } from 'react-router-dom';
import {
  Container,
  LeftContainer,
  LogoContainer,
  NavList,
  NavItem,
  ProfileContainer,
} from './style';

export function Footer() {
  const location = useLocation();

  console.log(location)

  return (
    <>
      <Outlet />
      <Container>
        <LeftContainer>
          <LogoContainer>
            <span>My <span>Pokedex</span></span>
          </LogoContainer>
          <NavList>
            {/* <Link to={'/'}>
              <NavItem isActive={location.pathname === "/"}>Home</NavItem>
            </Link>
            <Link to={'/dashboard'}>
              <NavItem isActive={location.pathname === "/dashboard"}>Dashboard</NavItem>
            </Link>
            <Link to={'/mypokemon'}>
              <NavItem isActive={location.pathname === "/mypokemon"}>My Pokemon</NavItem>
            </Link>
            <Link to={'/login'}>
              <NavItem isActive={location.pathname === "/login"}>Login</NavItem>
            </Link> */}
          </NavList>
        </LeftContainer>
        <ProfileContainer>
          <span>Welcome, <span>Dri</span></span>
          <img src="https://avatars.githubusercontent.com/u/105232781?v=4" alt="DriRSantosNeves" />
        </ProfileContainer>
      </Container>
    </>
  )
}