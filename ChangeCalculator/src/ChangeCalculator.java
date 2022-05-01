import java.util.Scanner;
import java.lang.Math; 
/** This class will convert the monetary amount to the fewest
 * number of each bill. */

public class ChangeCalculator {
	/**
	 *  @author levan
	 *  */
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
		
		double rem2; //The second reminder.
		
		double rem3; //The third reminder.
		
		double rem4; //The fourth reminder.
		
		double rem5; //The fifth reminder.

		double rem6; //The sixth reminder.
		
		
		System.out.println("Amount $"); //Asking the user for an amount 
		
		Scanner input = new Scanner(System.in); // new scanner
		
		amountEntered = input.nextDouble(); // this is where the user input is stored
		
		System.out.println("Amount $" + amountEntered); //Prints the amount the user entered
		
		 amountEntered1 = (int)Math.round(amountEntered) /20; //Converts the double to a single digit
		 
		 rem1 = amountEntered %20; //The reminder of the user input divided by 20
	
		System.out.println(amountEntered1 + " twenty dollar bills"); //Displays the amount of $20 bills
		
		 amountEntered2 = (int)Math.round(rem1) /10; // Divides the reminder by 10 to display $10 bills
		 
		 rem2 = rem1 %10; //  After taking away the $10 bills this will represent the $5 bills
		
        System.out.println(amountEntered2 + " ten dollar bills"); // Displays the amount of $10 bills
        
        amountEntered3 = (int)Math.round(rem2) /5; // Divides the reminder by  to display $5 bills
        
        rem3 = rem2 %5; // After taking away the $5 bills this will represent the $1 bills
        
        System.out.println( amountEntered3 + " five dollar bills"); // Displays the amount of $5 bills
        
        amountEntered4 = (int)Math.round(rem3) /1; // Divides the reminder by  to display $1 bills
        
        rem4 = rem3 %5; // The reminder of rem3 //After taking away the $1 bills this will represent the change
        
        System.out.println( amountEntered4 + " one dollar bills"); // Displays the amount of $1 bills		
        
        amountEntered5 = (int)((rem4%1)*100) /25;    // Divides the reminder by  to display quarters
		
		System.out.println( amountEntered5 +" quarters"); //Displays the number of quarters
		
		
		if ((rem4%1) <= .50) {  //this logic is used to determine how many quarters are left over if .50cents left it will minus .25
			rem5 = (rem4%1) - .25;
			}
		if ((rem4%1) >= .25) {  //if it is .25  or more left over -.25
			rem5 = (rem4%1) - .25;
			} else {                // if none of the conditions are met we are going to pass the value through
				rem5 =(rem4%1);
			}
		
		amountEntered6 = (int)(rem5*100) /10; // This is used to determine the number of dimes.
		
		System.out.println(amountEntered6 + " dimes"); //Displays the amount of dimes
		
		rem6 = (Math.round(rem5 *100)-10); //Used this formula to convert .18 to 8 to break it down to shown nickels and pennies
		
	    amountEntered7 = (int)rem6/5; //Using the division operation to take out the number of nickels
		
	    System.out.println(amountEntered7 + " nickels");  // displays the number of pennies
	    
	    amountEntered8 = (int)rem6 -5; // the number of pennies
	    
		System.out.println(amountEntered8 + " pennies");  // displays the number of pennies
		
		input.close();
	}
}
