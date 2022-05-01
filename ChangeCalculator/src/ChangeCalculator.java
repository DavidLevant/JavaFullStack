import java.util.Scanner;
import java.lang.Math; 
/** This class will convert the monetary amount to the fewest
 * number of each bill. */

public class ChangeCalculator {
	
	public static void main(String[] args) {
		
		double amountEntered; // This will represent the amount the user enters
		
		int amountEntered1; //This will the amount of $20's
		
		int amountEntered2; //This will the amount of 10's
		
		int amountEntered3; //This will the amount of $5's
		
		int amountEntered4; //This will the amount of $1's 
		
		int amountEntered5; //This will the amount of .25's
		
		int amountEntered6; //This will the amount of .10's
		
		int amountEntered7; //This will the amount of .5's
		
		int amountEntered8; //This will the amount of .1's
		
		double rem1; //The first reminder.
		
		double rem2; //The first reminder.
		
		double rem3; //The first reminder.
		
		double rem4;
		
		double rem5;

		double rem6;
		
		double rem7;
		
		double rem8;
		
		double rem9;
		
		double rem10;
		
		System.out.println("Amount $"); //Asking the user for an amount 
		
		Scanner input = new Scanner(System.in); // new scanner
		
		amountEntered = input.nextDouble(); // this is where the user input is stored
		
		System.out.println("Amount $" + amountEntered); //Prints the amount the user entered
		
		 amountEntered1 = (int)Math.round(amountEntered) /20; //Converts the double to a single digit
		 
		 rem1 = amountEntered %20; //The reminder of the user input divided by 20
	
		System.out.println(amountEntered1 + " twenty dollar bills"); //Displays the amount of $20 bills
		
		 amountEntered2 = (int)Math.round(rem1) /10; // Divides the reminder by 10 to display $10 bills
		 
		 rem2 = rem1 %10; // The reminder of rem1
		
        System.out.println(amountEntered2 + " ten dollar bills"); // Displays the amount of $10 bills
        
        amountEntered3 = (int)Math.round(rem2) /5; // Divides the reminder by  to display $5 bills
        
        rem3 = rem2 %5; // The reminder of rem2
        
        System.out.println( amountEntered3 + " five dollar bills"); // Displays the amount of $5 bills
        
        amountEntered4 = (int)Math.round(rem3) /1; // Divides the reminder by  to display $1 bills
        
        rem4 = rem3 %5; // The reminder of rem3
        
        System.out.println( amountEntered4 + " one dollar bills"); // Displays the amount of $1 bills
		
        amountEntered5 = (int)Math.round(rem4); // Divides the reminder by  to display $1 bills
        
        (rem5*100/25) = rem4%1;   //The reminder of rem3
		
		System.out.println(amountEntered5 +" quarters");
		
		System.out.println(rem4);
		
		System.out.println(rem5);
		
		System.out.println("dimes");
		
		System.out.println("nickels");
		
		System.out.println("pennies");
		
	// this will minus the twenties  to determine how many we need.
	// this will minus the tens   to determine how many we need.
	// this will minus the fives   to determine how many we need.
	// this will minus the ones  to determine how many we need.
	// this will minus the quarters  to determine how many we need.
	// this will minus the dimes  to determine how many we need.
	// this will minus the nickels  to determine how many we need.
	// this will minus the pennies  to determine how many we need.
	}
}
