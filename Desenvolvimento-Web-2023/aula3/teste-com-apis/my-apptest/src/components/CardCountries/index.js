import React from 'react';
import '../Card/style.css';

export function CardCountries({flags, common}){
     return (
        <div>
            <div className="cardContainer">
                <img src={flags.svg} alt="countries" />
                <h3>{common}</h3>
            </div>
        </div>
    )
}