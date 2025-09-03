import java.util.Scanner;
import java.util.ArrayList;
public class MBTIpersonality{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
String [] response  = new String [20];
System.out.println("what is your name:");
String name = input.next();

String [] question = {
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
};

int extrovert = 0;
int  introvert = 0;
int sensing = 0;
int intuition = 0;
int thinking = 0;
int feeling = 0;
int judging = 0;
int perceiving = 0;






for(int counter = 0; counter < question.length; counter++){
	while(true){
		System.out.println(question[counter]);
		System.out.println("Enter option A or B");
		String userAnswer = input.next().trim().toUpperCase();
			if(userAnswer.equals("A") || userAnswer.equals("B")){
			 response[counter] = userAnswer;
		
			if (counter == 0 || counter  == 4 ||counter  == 8 || counter  == 12 ||counter == 16) {
                        if (userAnswer.equals("A")) extrovert++;
                        else introvert++;
                    }

                  
                    if (counter  == 1 || counter  == 5 || counter  == 9 || counter  == 13 || counter == 17) {
                        if (userAnswer.equals("A")) sensing++;
                        else intuition++;
                    }

                    
                    if (counter  == 2 || counter  == 6 || counter  == 10 || counter == 14 || counter  == 18) {
                        if (userAnswer.equals("A")) thinking++;
                        else feeling++;
                    }
	
		   if (counter  == 3 || counter  == 2 || counter  == 11 || counter  == 15 || counter  == 19) {
                        if (userAnswer.equals("A")) judging++;
                        else perceiving++;
                    }
			break;
			} else {
			System.out.println("invalid input ,  Enter only option A and B ");
			}
	

}

}

String mbti = "";

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

      System.out.println(name + "Here are you selected :");
        for (int count = 0; count < response.length; count++) {
            System.out.println(question[count] + " → " + response[count]);
        }
      System.out.println("your MBTI test result is " + mbti);

if (mbti.equals("INTJ")){
	System.out.println("INNOVATIVE,INDEPENDENT,STRATEGIC,LOGICAL.RESERVED,INSIGHTFUL,Driven by their own original ideas to achieve improvement.");
}
if (mbti.equals("INTP")){
	System.out.println("Intellectual,Logical,Precise,Curious,Challenging,Independent,They create innovative solutions to problems.");
}
if (mbti.equals("ENTJ")){
	System.out.println("STRATEGIC, LOGICAL, EFFICIENT, OUTSPOKEN, AMBITIOUS, INDEPENDENT. They are natural leaders and long-range planners.");
}
if (mbti.equals("ENTP")){
	System.out.println("INVENTIVE, ENTHUSIASTIC, STRATEGIC, ENTERPRISING, INQUISITIVE, VERSATILE. They enjoy new ideas and challenges, value innovation.");
}
if (mbti.equals("INFJ")){
	System.out.println("ADVOCATE, ORGANIZED, INSIGHTFUL, DEPENDABLE, COMPASSIONATE, GENTLE. They seek harmony and cooperation, and enjoy intellectual stimulation.");
}
if (mbti.equals("INFP")){
	System.out.println("SINCERE, CREATIVE, IDEALISTIC, PERCEPTIVE, CARING, LOYAL. They value inner harmony and personal growth, focus on dreams and possibilities.");
}
if (mbti.equals("ENFJ")){
	System.out.println("CARING, ENTHUSIASTIC, IDEALISTIC, ORGANIZED, DIPLOMATIC, RESPONSIBLE. They are skilled communicators and focus on others.");
}
if (mbti.equals("ENFP")){
	System.out.println("ENTHUSIASTIC, CREATIVE, SPONTANEOUS, OPTIMISTIC, SUPPORTIVE, PLAYFUL. They value inspiration and enjoy starting new projects.");
}
if (mbti.equals("ISTJ")){
	System.out.println("SERIOUS, LOGICAL, RESPONSIBLE, ORGANIZED, SENSIBLE, REALISTIC. They are thorough and dependable.");
}
if (mbti.equals("ISFJ")){
	System.out.println("WARM, CONSIDERATE, GENTLE, RESPONSIBLE, HELPFUL, HARDWORKING. They are loyal and value traditions.");
}
if (mbti.equals("ESTJ")){
	System.out.println("EFFICIENT, OUTGOING, ANALYTICAL, SYSTEMATIC, DEPENDABLE, ASSERTIVE. They focus on getting things done in an orderly fashion.");
}
if (mbti.equals("ESFJ")){
	System.out.println("FRIENDLY, OUTGOING, RELIABLE, CONSCIENTIOUS, ORGANIZED, PRACTICAL. They seek to be helpful and please others.");
}
if (mbti.equals("ISTP")){
	System.out.println("ACTION-ORIENTED, LOGICAL, ANALYTICAL, ADVENTUROUS, INDEPENDENT. They enjoy understanding how things work.");
}
if (mbti.equals("ISFP")){
	System.out.println("SENSITIVE, KIND, FRIENDLY, OUTGOING, FLEXIBLE, ARTISTIC. They enjoy helping people in tangible ways.");
}
if (mbti.equals("ESTP")){
	System.out.println("ENERGETIC, ACTIVE, FRIENDLY, ADAPTABLE, OUTGOING, PRAGMATIC. They enjoy solving problems in the moment.");
}
if (mbti.equals("ESFP")){
	System.out.println("FRIENDLY, OUTGOING, SPONTANEOUS, FLEXIBLE, ENTHUSIASTIC, PLAYFUL. They enjoy helping people in tangible ways.");
}
}
}
