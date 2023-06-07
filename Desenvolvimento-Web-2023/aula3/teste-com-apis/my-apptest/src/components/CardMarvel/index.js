import React from 'react';
import '../Card/style.css';

export class CardMarvel extends React.Component {
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