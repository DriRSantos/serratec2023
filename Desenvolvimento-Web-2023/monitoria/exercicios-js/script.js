function bomDia() {
  return "Bom dia, Mundo!";
}

window.onload = function() {
  const bomDiaResult = document.getElementById('bomDiaResult');
  bomDiaResult.textContent = bomDia();

  const numberInput = document.getElementById('numberInput');
  const calculateButton = document.getElementById('calculateButton');
  const resultElement = document.getElementById('result');

  calculateButton.addEventListener('click', function() {
    const number = Number(numberInput.value);
    const cubeValue = cube(number);
    resultElement.textContent = `Cube: ${cubeValue}`;
  });

  function cube(number) {
    return Math.pow(number, 3);
  }

  const tempInput = document.getElementById('tempInput');
  const calculateButton2 = document.getElementById('calculateButton2');
  const resultElement2 = document.getElementById('result2');

  calculateButton2.addEventListener('click', function() {
    const number2 = Number(tempInput.value);
    const tempC = temperatureConvert(number2);
    resultElement2.textContent = `Degrees in C: ${tempC} ºC`;
  });

  function temperatureConvert(number2){
    const calc = (number2 - 32) * 0.5556;
    return calc.toFixed(2);
  }
};

function calculateTriangleArea() {
  const base = Number(document.getElementById('baseInput').value);
  const height = Number(document.getElementById('heightInput').value);
  const area = (base * height) / 2;
  document.getElementById('result3').textContent = `Triangle Area: ${area}`;
}

const calculateButton = document.getElementById('calculateButton3');
calculateButton.addEventListener('click', calculateTriangleArea);

function calculateFactorial() {
  const number = Number(document.getElementById('factorialInput').value);
  let factorial = 1;
  for (let i = 2; i <= number; i++) {
    factorial *= i;
  }
  document.getElementById('result4').textContent = `Factorial: ${factorial}`;
}

const calculateButton4 = document.getElementById('calculateButton4');
calculateButton4.addEventListener('click', calculateFactorial);

function calculateCharacter(){
  var word = document.getElementById('wordInput').value;
  var letter = document.getElementById('letterInput').value;

  var letters = word.split('');
  let count = 0;
  for (let i = 0; i < letters.length; i++){
    if (letters[i].toLowerCase() === letter.toLowerCase()){
      count++;
  } 
}
document.getElementById('result5').textContent = `The word has ${count} "${letter}" characters.`;
}
const calculateButton5 = document.getElementById('calculateButton5');
calculateButton5.addEventListener('click', calculateCharacter)

function verifyPrimeNumber(){
  const number = Number(document.getElementById('priNumberInput').value);
  
  let isPrime = true;
  if (number === 1) {
    isPrime = false;
  } else {
    for (let i = 2; i <= Math.sqrt(number); i++) {
      if (number % i === 0) {
        isPrime = false;
        break;
      }
    }
  }
  if (isPrime) {
    document.getElementById('result6').textContent = `The number is prime`;
  } else {
    document.getElementById('result6').textContent = `The number is not prime`;
  }
}
const calculateButton6 = document.getElementById('calculateButton6');
calculateButton6.addEventListener('click', verifyPrimeNumber);


function invertNumber(){
  const number = Number(document.getElementById('invNumberInput').value);
  const numbers = number.toString().split('');
  const inverseNumber = numbers.reverse().join('');

  document.getElementById('result7').textContent = `The number reversed is: ${inverseNumber}`;
}
const calculateButton7 = document.getElementById('calculateButton7');
calculateButton7.addEventListener('click', invertNumber);