import java.util.Scanner;
public class StudentGrade {
public static void main (String [] args){
Scanner input = new Scanner(System.in);

System.out.println("how many student do you have?");
int studentNumber = input.nextInt();

System.out.println("how many subject do they offer?");
int subjectNumber = input.nextInt();

int [][] studentScores = new int[studentNumber][subjectNumber];


for(int count = 0; count < studentNumber; count++){
	System.out.println("Entering score for student " + (count + 1));
		for(int counter = 0; counter < subjectNumber; counter++){
				
				while(true){
				System.out.println("Enter score for subject " + (counter + 1));
					int score = input.nextInt();
				
						if(score >= 0 && score <= 100){
						studentScores[count][counter] = score;
						break;
						} else {
							System.out.println("you must enter number between 0 to 100");
							}
								}
}
}
System.out.println("Saving <<<<<<<<<<<<<<<<<<<<<");
System.out.println("Saved Sucessfully");

System.out.println("============================================");
System.out.print("STUDENT " + "\t" + "\t");
for(int index = 0; index < subjectNumber; index++){
	System.out.print("SUB" + (index + 1) + "\t");
}

System.out.print("TOT" + "\t" + "AVE" + "\t" + "POS");




}
}

