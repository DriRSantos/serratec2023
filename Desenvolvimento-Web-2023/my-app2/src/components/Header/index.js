import myLogo from '../../assets/images/logo.png';

export function Header(){
    return (
    <div className="header">
      <img src={myLogo} alt ="logo" />
      <nav className="header-right"><a className="header-right-item" href="#academic">Formação</a>
      <a className="header-right-item" href="#experiencia">Experiência</a></nav>   
    </div>
  );
}