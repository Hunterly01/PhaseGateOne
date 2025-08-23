import java.util.Scanner;
public class MenstrualApp{
public static void main (String [] args){
Scanner input = new Scanner(System.in);
boolean hunterly = true;
while(hunterly){
System.out.println(""" 
			 WELCOME TO MENSTRUAL CYCLE APP
			
			Choose your option
			1.Calculate safe periods
			2.Calculate ovulation day
			3.Calculate next period day
			0.Exit			
			""");
int option = input.nextInt();
switch(option){
	case 1: System.out.println("Enter your cycle Length:");
		int userInput = input.nextInt();
		calculateSafePeriods(userInput);
		break;
	case 2: System.out.println("Enter your cycle Length:");
		int userInput2 = input.nextInt();
		CalculateOvulationDay(userInput2);
		break;
	case 3: System.out.println("Enter your cycle Length and Last period day:");
		int userInput3 = input.nextInt();
		int userInput4 = input.nextInt();
		CalculateNextPeriodDay(userInput3, userInput4);
		break;
		
	case 0:
	hunterly = false;
	System.out.print("bye bye");
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

public static void CalculateOvulationDay(int CycleLength){
 int result = CycleLength - 14;
 System.out.println("your ovulation day is " + result);
}

public static void CalculateNextPeriodDay(int CycleLength, int LastPeriodDay){
int nextPeriodDay = LastPeriodDay +  CycleLength;
System.out.println("next Period Day is " + nextPeriodDay);
}


}

