/* To compile and run this class from the command line:
 * 
 * To compile:
 * 
 * javac sheet3ControlFlow\Ex9IfElseStatements.java
 * 
 * java sheet3ControlFlow.Ex9IfElseStatements
 * 
 * Because this class is physically in a package / folder,
 * its full name is the package name dot class name. I.e.
 * sheet3ControlFlow.Ex9IfElseStatements
 * 
 * *** Note: It cannot be executed without its package name. ***
 *  
 **/
package sheet3ControlFlow;

import java.util.Scanner;

public class Ex9IfElseStatements {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/* 
		 * I inserted an infinite loop just for testing as I 
		 * wanted to run the program around 20 times to test
		 * out my if else statement. When I had finished testing
		 * I could remove the loop.
		 */
		//while(true) {

		/* Prompt the user */
		System.out.print("Please enter an integer: ");
		/* Reads in a value from the user and stores it in num */
		int num = scanner.nextInt();

		/* When both sides of the && are true then the whole
		 * condition will be true. If either side is false
		 * then the whole condition will be false. 
		 * && this is called a short circuit and. When it finds
		 * false on the LHS, it will NOT check the RHS. 
		 * 
		 * Curly brackets are optional when there is only one
		 * statement as part of the if. */
		if (num >= 1 && num <= 10) 
			System.out.println("You typed 1 to 10");
		else if (num >= 11 && num <= 20)
			System.out.println("You typed 11 to 20");
		else if (num >= 21 && num <= 30)
			System.out.println("You typed 21 to 30");
		else if (num >= 31 && num <= 40)
			System.out.println("You typed 31 to 40");
		else if (num >= 41 && num <= 50)
			System.out.println("You typed 41 to 50");
		else // Good programming practice to have a final else
			System.out.println("You typed under 0 or over 50");
		
		//}  // End of infinite loop, for testing only
		
		/* Close the scanner instance */
		scanner.close();
	}
}
/*****  Sample output: (only one of the following two lines would
 * print during a single execution of the program)
Please enter an integer: -22
You typed under 0 or over 50

Please enter an integer: 25
You typed 21 to 30

Please enter an integer: 52
You typed under 0 or over 50
 */