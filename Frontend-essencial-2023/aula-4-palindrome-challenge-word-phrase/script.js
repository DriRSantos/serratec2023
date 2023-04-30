// function printWord() {
//     var wordInput = document.getElementById("word");
//     var word = wordInput.value;
//     var resultElement = document.getElementById("result");
//     resultElement.textContent = "You typed: " + word;
// } // test to print Word typed

function validatePalindrome() {
    var wordInput = document.getElementById("word");
    var word = wordInput.value;
    var letters = word.split('');
    var reversedLetters = letters.reverse();
    var reversedWord = reversedLetters.join('');
    // could change just to -> var reversedWord = word.split("").reverse().join("");

    if (reversedWord.toLowerCase() == word.toLowerCase()) {
        document.getElementById("result").innerHTML = "You typed: " + word
            + "<br>The word splited is: " + letters
            + "<br>The word reversed is: " + reversedWord
            + "<br><h2> It's a palindrome !!! </h2>";
    }
    else {
        document.getElementById("result").innerHTML = "You typed: " + word
            + "<br>The word splited is: " + letters
            + "<br>The word reversed is: " + reversedWord
            + "<br><h2>It's not a palindrome !!! </h2>"
    }
}

function validatePalindPhrase() {
    var phraseInput = document.getElementById("word2");
    var phrase = phraseInput.value;
    var cleanedPhrase = phrase.replace(/[ ,\-]/g, ""); // remove space, commas and hifens
    var cleanedPhraseNoAccents = cleanedPhrase.normalize("NFD").replace(/[\u0300-\u036f]/g, ""); // remove accents
    var letters = cleanedPhraseNoAccents.split('');
    var reversedLetters = letters.reverse();
    var reversedPhrase = reversedLetters.join('');

    if (reversedPhrase.toLowerCase() == cleanedPhraseNoAccents.toLowerCase()) { // compare final phrase witw
        document.getElementById("result2").innerHTML = "You typed: " + phrase                // phrase without commas, space, hifens and accents
            + "<br> The phrase without space, commas, hifens and accents is: " + cleanedPhraseNoAccents
            + "<br>The phrase splited is: " + letters
            + "<br>The phrase reversed is: " + reversedPhrase
            + "<br><h2>It's a palindrome !!! </h2>";
    }
    else {
        document.getElementById("result2").innerHTML = "You typed: " + phrase
            + "<br>The phrase splited is: " + letters
            + "<br>The phrase reversed is: " + reversedPhrase
            + "<br><h2>It's not a palindrome !!! </h2>"
    }
}
