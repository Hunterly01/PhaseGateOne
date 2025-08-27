import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
public class CheckOutApp{
public static void main (String [] args){
ArrayList<String> itemList = new ArrayList<>();
ArrayList<Double> unitList = new ArrayList<>();
ArrayList<Double> pieceList = new ArrayList<>();
ArrayList<Double> totalList = new ArrayList<>();

Scanner input = new Scanner(System.in);
LocalDate date = LocalDate.now();


System.out.println("What is the customer's Name");
String name = input.nextLine();

System.out.println("What is your name? ");
String cashiersName = input.nextLine();

String addItem = "Yes";
double piece = 0;
double unit = 0;
double total = 1; 
double subTotal = 0;
while(!addItem.equals("NO")){
System.out.println("What did the user buy? ");
String product = input.next();


System.out.println("How much per unit? ");
unit = input.nextDouble();

System.out.println("How many pieces? ");
piece = input.nextDouble();

System.out.println("Add more items? ");
addItem = input.next().toUpperCase();

total = unit * piece;
totalList.add(total);
itemList.add(product);
unitList.add(unit);
pieceList.add(piece);

}


System.out.println("enter discount ");
double discount = input.nextDouble();
double discountPrice = (discount / 100) * discount;

double disForCustomer = total - discount;

System.out.println("SEMICOLON STORES");
System.out.println("MAIN BRANCH");
System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
System.out.println("TEL: 03293828343");
System.out.println("Date: " + date);
System.out.println("Cashier: " + cashiersName);
System.out.println("Customer Name: " + name);
System.out.println("=================================================================");
System.out.println("ITEM\tPRICE\tQTY\tTotal(NGN)");
System.out.println("-----------------------------------------------------------------");
for(int counter = 0; counter < unitList.size(); counter++){
	subTotal += unitList.get(counter) * pieceList.get(counter);

System.out.println(itemList.get(counter) + "\t" + unitList.get(counter) + "\t" + pieceList.get(counter) + "\t" + totalList.get(counter));
}
System.out.println("-----------------------------------------------------------------");
System.out.println("subTotal:" + subTotal);










}
}

