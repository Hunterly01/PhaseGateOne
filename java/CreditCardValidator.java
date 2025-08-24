import java.util.Scanner;
public class CreditCardValidator {
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a credit card number:");
long creditCardNumber = input.nextLong();

String newCreditCardNumber =  String.valueOf(creditCardNumber);
String cardType = toCheckCardType(newCreditCardNumber);



System.out.println(cardType);



}
public static String toCheckCardType(String creditCardNumber){
 char firstNumber = creditCardNumber.charAt(0);
 char secondNumber = creditCardNumber.charAt(1);
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
public static boolean checkValidityOfCreditCardNumber(String creditCardNumber){
if(creditCardNumber.length() < 13 || creditCardNumber.length() > 16){
return false;

}