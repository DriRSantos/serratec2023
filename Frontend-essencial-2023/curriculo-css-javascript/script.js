function changeColor() {
    document.getElementById("container-top-data-job").style.color = "red";
    document.getElementById("container-top-data-job").style.fontSize = "40px";
    setTimeout(disableChangeColor, 3000);
}

function disableChangeColor() {
    document.getElementById("container-top-data-job").style.color = "yellow";
    document.getElementById("container-top-data-job").style.fontSize = "100%";
}