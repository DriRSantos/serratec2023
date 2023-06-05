import { UserButton } from "./UserButton";

export function PersonalData(){

  return (
    <div className="main-content-personal">
      <img className="img-personal" src='https://avatars.githubusercontent.com/u/105232781?v=4' alt="personal"/>
      <div className="personal-text">
        <UserButton />
        <p className="container-top-data-job">Residente em TIC/Software do Serratec 2023.1</p>
        <p className="city">Petrópolis, Brasil </p>
        <p className="phone">(24) 981XXXXXX </p>
        <p className="email"><a href="mailto:drirsantos@outlook.com">Email@outlook</a></p>
        <p className="github"><a href="https://github.com/DriRSantos" target="_blank" rel="noreferrer">GitHub</a></p>
        <p className="linkedin"><a href="https://www.linkedin.com/in/drirsantos/" target="_blank" rel="noreferrer">LinkedIn</a></p>
      </div>
    </div>
  );
}