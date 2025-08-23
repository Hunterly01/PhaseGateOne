const prompt = require("prompt-sync")(); 
hunterly = true;
while(hunterly){
console.log(`
			 WELCOME TO MENSTRUAL CYCLE APP
			
			Choose your option
			1.Calculate safe periods
			2.Calculate ovulation day
			3.Calculate next period day
			0.Exit			
			`);
let option = parseInt(prompt("Enter your option: "));
switch(option){
	case 1: 
		let userInput =  parseInt(prompt("Enter your cycle Length:"));
		calculateSafePeriods(userInput);
		break;
	case 2:
		let userInput2 = parseInt(prompt("Enter your cycle Length:"));
		CalculateOvulationDay(userInput2);
		break;
	case 3: 
		let userInput3 = parseInt(prompt("Enter your cycle Length :"));
		let userInput4 = parseInt(prompt("Enter your last period day :"));
		CalculateNextPeriodDay(userInput3, userInput4);
		break;
		
	case 0:
	hunterly = false;
	console.log("bye bye");
	break;
	
	default: console.log("invalid input.. try again");
}
}

function calculateSafePeriods(CycleLength){
let firstSafePeriod = 7;
let secondSafePeriodStart = CycleLength - firstSafePeriod;
let secondSafePeriodEnd = CycleLength;
console.log("first safe period: Day 1 to ", firstSafePeriod);
console.log("second safe period: Day ", secondSafePeriodStart," to ", secondSafePeriodEnd);

}
function CalculateOvulationDay(CycleLength){
let result = CycleLength - 14;
 console.log("your ovulation day is ", result);
}

function CalculateNextPeriodDay(CycleLength, LastPeriodDay){
let nextPeriodDay = LastPeriodDay +  CycleLength;
console.log("next Period Day is ", nextPeriodDay);
}

