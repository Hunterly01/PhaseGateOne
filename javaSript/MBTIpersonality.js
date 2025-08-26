const prompt = require("prompt-sync")();

let name = prompt("what is your name:");
let response  =  [];
let question = [
"1. You regularly make new friends",
"2. Complex and novel ideas excite you more than simple and straightforward ones",
"3.You usually feel more persuaded by what resonates emotionally with you than by factual arguments",
"4.Your living and working spaces are clean and organized",
"5.You usually stay calm, even under a lot of pressure",
"6.You usually stay calm, even under a lot of pressure",
"7.You find the idea of networking or promoting yourself to strangers very daunting.",
"8.You prioritize and plan tasks effectively, often completing them well before the deadline",
"9.People’s stories and emotions speak louder to you than numbers or data",
"10.You like to use organizing tools like schedules and lists",
"11.Even a small mistake can cause you to doubt your overall abilities and knowledge",
"12.You feel comfortable just walking up to someone you find interesting and striking up a conversation",
"13.You are not too interested in discussions about various interpretations of creative works",
"14.You prioritize facts over people’s feelings when determining a course of action",
"15.You prioritize facts over people’s feelings when determining a course of action",
"16.You often allow the day to unfold without any schedule at all",
"17.You rarely worry about whether you make a good impression on people you meet",
"18.You enjoy participating in team-based activities",
"19.You enjoy experimenting with new and untested approaches",
"20.You prioritize being sensitive over being completely honest",
];

let extrovert = 0;
let introvert = 0;
let sensing = 0;
let intuition = 0;
let thinking = 0;
let feeling = 0;
let judging = 0;
let perceiving = 0;


for(let counter = 0; counter < question.length; counter++){
	while(true){
		console.log(question[counter]);
		let userAnswer = prompt("Enter option A or B:").trim().toUpperCase();
			if(userAnswer == "A" || userAnswer == "B"){
			 response[counter] = userAnswer;
		
		if (counter == 0 || counter  == 4 ||counter  == 8 || counter  == 12 ||counter == 16) {
                        if (userAnswer == "A") extrovert++;
                        else introvert++;
                    }
		if (counter  == 1 || counter  == 5 || counter  == 9 || counter  == 13 || counter == 17) {
                        if (userAnswer == "A") sensing++;
                        else intuition++;
                    }

                    
                    if (counter  == 2 || counter  == 6 || counter  == 10 || counter == 14 || counter  == 18) {
                        if (userAnswer == "A") thinking++;
                        else feeling++;
                    }
	
		   if (counter  == 3 || counter  == 2 || counter  == 11 || counter  == 15 || counter  == 19) {
                        if (userAnswer == "A") judging++;
                        else perceiving++;
                    }
			break;
			} else {
			console.log("invalid input ,  Enter only option A and B ");
			}
	

}

}

let mbti = "";

if (extrovert >= introvert) {
    mbti += "E";
} else {
    mbti += "I";
}

if (sensing >= intuition) {
    mbti += "S";
} else {
    mbti += "N";
}

if (thinking >= feeling) {
    mbti += "T";
} else {
    mbti += "F";
}

if (judging >= perceiving) {
    mbti += "J";
} else {
    mbti += "P";
}

      console.log(name + "Here are you selected :");
        for (let count = 0; count < response.length; count++) {
            console.log(question[count] + " → " + response[count]);
        }
      console.log("your MBTI test result is " + mbti);



                  
