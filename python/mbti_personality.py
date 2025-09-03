name = input("what is your name:");
question = [
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


response = [];
extrovert = 0;
introvert = 0;
sensing = 0;
intuition = 0;
thinking = 0;
feeling = 0;
judging = 0;
perceiving = 0;

for count in range (len(question)):
	while True:
		print(question[count]);
		user_answer = input("Enter option A for 'Agree' or B for 'Disagree' :").strip().upper();
		if user_answer == "A" or user_answer == "B":
			response.append(user_answer);

			if count == 0 or count  == 4 or count  == 8 or count  == 12 or count == 16:
				if user_answer == "A":
					extrovert += 1;
				else:
					introvert += 1;

			if count == 1 or count  == 5 or count  == 9 or count  == 13 or count == 17:
				if user_answer == "A":
					sensing += 1;
				else:
					intuition += 1;

			if count == 2 or count  == 6 or count  == 10 or count  == 14 or count == 18:
				if user_answer == "A":
					thinking += 1;
				else:
					feeling += 1;

			if count == 3 or count  == 7 or count  == 11 or count  == 15 or count == 19:
				if user_answer == "A":
					judging += 1;
				else:
					perceiving += 1;
				
			break;
		else:
			print("invalid input");

	mbti = "";

	if extrovert >= introvert:
		mbti += "E";
	else:
		mbti += "I";


	if sensing >= intuition:
		mbti += "S";
	else:
		mbti += "N";

	if thinking >= feeling:
		mbti += "T";
	else:
		mbti += "F";


	if judging >= perceiving:
		mbti += "J";
	else:
		mbti += "P";



print(name, " Here are your selected questions :");
for count in range (len(question)):
	print(question[count], "->", response[count]);
	print("your mbti test result is" , mbti)
	


if mbti == "INTJ":
	print("INNOVATIVE,INDEPENDENT,STRATEGIC,LOGICAL.RESERVED,INSIGHTFUL,Driven by their own original ideas to achieve improvement.");
if mbti == "INTP":
	print("Intellectual,Logical,Precise,Curious,Challenging,Independent,They create innovative solutions to problems.");
if mbti == "ENTJ":
	print("STRATEGIC, LOGICAL, EFFICIENT, OUTSPOKEN, AMBITIOUS, INDEPENDENT. They are natural leaders and long-range planners.");
if mbti == "ENTP":
	print("INVENTIVE, ENTHUSIASTIC, STRATEGIC, ENTERPRISING, INQUISITIVE, VERSATILE. They enjoy new ideas and challenges, value innovation.");
if mbti == "INFJ":
	print("ADVOCATE, ORGANIZED, INSIGHTFUL, DEPENDABLE, COMPASSIONATE, GENTLE. They seek harmony and cooperation, and enjoy intellectual stimulation.");
if mbti == "INFP":
	print("SINCERE, CREATIVE, IDEALISTIC, PERCEPTIVE, CARING, LOYAL. They value inner harmony and personal growth, focus on dreams and possibilities.");
if mbti == "ENFJ":
	print("CARING, ENTHUSIASTIC, IDEALISTIC, ORGANIZED, DIPLOMATIC, RESPONSIBLE. They are skilled communicators and focus on others.");
if mbti == "ENFP":
	print("ENTHUSIASTIC, CREATIVE, SPONTANEOUS, OPTIMISTIC, SUPPORTIVE, PLAYFUL. They value inspiration and enjoy starting new projects.");
if mbti == "ISTJ":
	print("SERIOUS, LOGICAL, RESPONSIBLE, ORGANIZED, SENSIBLE, REALISTIC. They are thorough and dependable.");
if mbti == "ISFJ":
	print("WARM, CONSIDERATE, GENTLE, RESPONSIBLE, HELPFUL, HARDWORKING. They are loyal and value traditions.");
if mbti == "ESTJ":
	print("EFFICIENT, OUTGOING, ANALYTICAL, SYSTEMATIC, DEPENDABLE, ASSERTIVE. They focus on getting things done in an orderly fashion.");
if mbti == "ESFJ":
	print("FRIENDLY, OUTGOING, RELIABLE, CONSCIENTIOUS, ORGANIZED, PRACTICAL. They seek to be helpful and please others.");
if mbti == "ISTP":
	print("ACTION-ORIENTED, LOGICAL, ANALYTICAL, ADVENTUROUS, INDEPENDENT. They enjoy understanding how things work.");
if mbti == "ISFP":
	print("SENSITIVE, KIND, FRIENDLY, OUTGOING, FLEXIBLE, ARTISTIC. They enjoy helping people in tangible ways.");
if mbti == "ESTP":
	print("ENERGETIC, ACTIVE, FRIENDLY, ADAPTABLE, OUTGOING, PRAGMATIC. They enjoy solving problems in the moment.");
if mbti == "ESFP":
	print("FRIENDLY, OUTGOING, SPONTANEOUS, FLEXIBLE, ENTHUSIASTIC, PLAYFUL. They enjoy helping people in tangible ways.");



