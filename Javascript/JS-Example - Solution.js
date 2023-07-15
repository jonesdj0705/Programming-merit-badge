// source:  https://scoutlife.org/about-scouts/merit-badge-resources/programming/41261/javascript/
// JavaScript Document
// Note: lines that start with two backslashes are comments - not code!
 
var bePrepared = function () {
  // = = = = = = = declare all the variables = = = = = = = = 
  var tempF, tempC, myActionText, newText;
  //get the temp (F) from the HTML page
  tempF = document.getElementById('MyInputTemp').value;

  // = = = = = = = convert the temp to Celsius (with only one decimal place)
  tempC = (5 / 9 * (tempF - 32)).toFixed(1);

 // = = = = = = = evaluate the temp (three categories) = = = = = = =  
 if (tempF < 30) {
       myActionText = " Bring hat and gloves!";
   }
 if ((tempF >= 60) && (tempC < 75)) {
           myActionText = " Have Fun!";
       }
 if (tempF >= 75) {
           myActionText = " Take Sunscreen!";
       }

 // = = = = = = = build a complete sentence = = = = = = =  
 newText = "If the temperature is " + tempF + " °F (" + tempC + " °C): " + myActionText;
 //push the sentence back to the HTML page (using the ID of the markup element: 'myAnswer')
 document.getElementById('myAnswer').innerHTML = newText;
};