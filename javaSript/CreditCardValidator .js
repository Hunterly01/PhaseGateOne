const prompt = require("prompt-sync")(); 
let creditCardNumber = prompt("Enter credit card number: ");
let cardType = toCheckCardType(creditCardNumber);



console.log(cardType)


function toCheckCardType(creditCardNumber){
let firstNumber = creditCardNumber.charAt(0);
let secondNumber = creditCardNumber.charAt(1);
if (firstNumber == ('4')){
	return "Credit Card Type: Visa Card";
} else if (firstNumber == ('5')){
	return "Credit Card type: Master Card";
} else if (firstNumber == ('3') && secondNumber == '7'){
	return "Credit Card Type: American Express Card";
} else if (firstNumber == ('6')){
	return "Credit Card Type: Discover Card";
} else {
	return "Unknown Card Type";
}
}