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
            console.log(question[count] + " -> " + response[count]);
        }
      console.log("your MBTI test result is " + mbti);

if (mbti == "INTJ"){
	console.log("INNOVATIVE,INDEPENDENT,STRATEGIC,LOGICAL.RESERVED,INSIGHTFUL,Driven by their own original ideas to achieve improvement.");
}
if (mbti == "INTP"){
	console.log("Intellectual,Logical,Precise,Curious,Challenging,Independent,They create innovative solutions to problems.");
}
if (mbti == "ENTJ"){
	console.log("STRATEGIC, LOGICAL, EFFICIENT, OUTSPOKEN, AMBITIOUS, INDEPENDENT. They are natural leaders and long-range planners.");
}
if (mbti == "ENTP"){
	console.log("INVENTIVE, ENTHUSIASTIC, STRATEGIC, ENTERPRISING, INQUISITIVE, VERSATILE. They enjoy new ideas and challenges, value innovation.");
}
if (mbti =="INFJ"){
	console.log("ADVOCATE, ORGANIZED, INSIGHTFUL, DEPENDABLE, COMPASSIONATE, GENTLE. They seek harmony and cooperation, and enjoy intellectual stimulation.");
}
if (mbti == "INFP"){
	console.log("SINCERE, CREATIVE, IDEALISTIC, PERCEPTIVE, CARING, LOYAL. They value inner harmony and personal growth, focus on dreams and possibilities.");
}
if (mbti == "ENFJ"){
	console.log("CARING, ENTHUSIASTIC, IDEALISTIC, ORGANIZED, DIPLOMATIC, RESPONSIBLE. They are skilled communicators and focus on others.");
}
if (mbti == "ENFP"){
	console.log("ENTHUSIASTIC, CREATIVE, SPONTANEOUS, OPTIMISTIC, SUPPORTIVE, PLAYFUL. They value inspiration and enjoy starting new projects.");
}
if (mbti == "ISTJ"){
	console.log("SERIOUS, LOGICAL, RESPONSIBLE, ORGANIZED, SENSIBLE, REALISTIC. They are thorough and dependable.");
}
if (mbti == "ISFJ"){
	console.log("WARM, CONSIDERATE, GENTLE, RESPONSIBLE, HELPFUL, HARDWORKING. They are loyal and value traditions.");
}
if (mbti == "ESTJ"){
	console.log("EFFICIENT, OUTGOING, ANALYTICAL, SYSTEMATIC, DEPENDABLE, ASSERTIVE. They focus on getting things done in an orderly fashion.");
}
if (mbti == "ESFJ"){
	console.log("FRIENDLY, OUTGOING, RELIABLE, CONSCIENTIOUS, ORGANIZED, PRACTICAL. They seek to be helpful and please others.");
}
if (mbti == "ISTP"){
	console.log("ACTION-ORIENTED, LOGICAL, ANALYTICAL, ADVENTUROUS, INDEPENDENT. They enjoy understanding how things work.");
}
if (mbti == "ISFP"){
	console.log("SENSITIVE, KIND, FRIENDLY, OUTGOING, FLEXIBLE, ARTISTIC. They enjoy helping people in tangible ways.");
}
if (mbti == "ESTP"){
	console.log("ENERGETIC, ACTIVE, FRIENDLY, ADAPTABLE, OUTGOING, PRAGMATIC. They enjoy solving problems in the moment.");
}
if (mbti == "ESFP"){
	console.log("FRIENDLY, OUTGOING, SPONTANEOUS, FLEXIBLE, ENTHUSIASTIC, PLAYFUL. They enjoy helping people in tangible ways.");
}

                  
