import java.util.Scanner;
public class MenstrualApp{
public static void main (String [] args){
Scanner input = new Scanner(System.in);
while(true){
System.out.println(""" 
			 WELCOME TO MENSTRUAL CYCLE APP
			
			1.Calculate safe periods			
			""");
int option = input.nextInt();
switch(option){
	case 1: System.out.println("Enter your cycle Length:");
		int userInput = input.nextInt();
		calculateSafePeriods(userInput);
		break;


}
}
}
public static void calculateSafePeriods(int CycleLength){
int firstSafePeriod = 7;
int secondSafePeriodStart = CycleLength - firstSafePeriod;
int secondSafePeriodEnd = CycleLength;
System.out.println("first safe period: Day 1 to " + firstSafePeriod);
System.out.println("second safe period: Day " + secondSafePeriodStart + " to " + secondSafePeriodEnd);

}
}


