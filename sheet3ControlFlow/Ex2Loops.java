package sheet3ControlFlow;

public class Ex2Loops {
public static void main(String [] args) {
		
		int counter = 100;
		
		while (counter <= 200) {
			System.out.print(counter + " ");
			counter += 2;
			//counter = counter + 2;
		}
		
		System.out.println("\nEnd of while loop");  
		
		/* The first section of a for loop is the initialisation 
		section, you can declare as may variables are you like but
		they must all be the same type.
		e.g. int i = 0, j = 20, k = 50; // All are of type int
		
		The section is the test/ condition and must true or false
		i.e. a boolean. 
		
		The third section is the increment section and is used to 
		increment the counter but ANY statement that doesn't return
		a value can go here, e.g. you can put in println() methods
		and you can call any method so long as the method doesn't
		return a value (a void method). 
		
		N.B. each declaration of i in the following loops belongs
		to that for loop and cannot be seen outside it. 
		*/
		for (int i = 100; i <= 200; System.out.print(i + " "), i += 2) {
			
		}
		
		System.out.println("\nEnd of 1st for loop");  // Prints a newline
		
		for (int i = 100; i <= 200; i += 2) {
			System.out.print(i + " ");
		}
	}
}
