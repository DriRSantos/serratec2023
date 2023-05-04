function initiateTimer() {
    var seconds = document.getElementById("number").value;
    var countdownElem = document.getElementById("countdown");
  
    var countdownInterval = setInterval(function() {
      seconds--;
      countdownElem.innerHTML = seconds + " seconds remaining";
  
      if (seconds <= 0) {
        clearInterval(countdownInterval);
        countdownElem.innerHTML = "Time's up!";
      }
    }, 1000);
  }