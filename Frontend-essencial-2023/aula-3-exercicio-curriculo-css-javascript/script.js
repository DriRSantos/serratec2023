function changeColor() {
    document.getElementById("exp-data").style.color = "red";
    document.getElementById("exp-data").style.fontSize = "90px";
    setTimeout(disableChangeColor, 3000);
}

function disableChangeColor() {
    document.getElementById("exp-data").style.color = "black";
    document.getElementById("exp-data").style.fontSize = "100%";
}
