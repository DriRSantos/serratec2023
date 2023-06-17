import { Outlet } from 'react-router-dom';

import {Container,
LeftContainer,
LogoContainer,
NavList,
NavItem,
RightContainer,
ProfileContainer} from 'style';

export function Header(){
  return (
    <>
     <Container>
      <LeftContainer>
        <LogoContainer>
          <img src="" alt="" />
          <span>Pokedex</span>
        </LogoContainer>
        <NavList>
          <NavItem>Home</NavItem>
          <NavItem>Dashboard</NavItem>
          <NavItem>My Pokemon</NavItem>
        </NavList>
      </LeftContainer>
      <RightContainer>
        <ProfileContainer>
            <img src="" alt="" />
            <span>Welcome, Dri</span>
        </ProfileContainer>
      </RightContainer>
    </Container>
    <Outlet/>
    </>
  );
}