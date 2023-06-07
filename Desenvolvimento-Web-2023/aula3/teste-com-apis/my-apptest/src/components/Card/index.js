import React from "react";
import './style.css'

export class Card extends React.Component {
  render() {
    return (
        <div>
            <div className="cardContainer">
                <img src={this.props.picture} alt="dog" />
            </div>
        </div>
    )
}
}