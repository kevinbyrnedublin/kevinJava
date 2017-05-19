package sheet3ControlFlow;

import java.util.Scanner;

public class Ex7Total10Values {

	public static void main(String [] args) {
	
		Scanner input = new Scanner(System.in);
		/* Declare total before the loop, so that it won't keep being
		initialised back to 0 (if it were declared inside the loop) */
		int total = 0;  // total [0]
		
		int i = 0; // 0 1 2 3 4 5 6 7 8 9 10
		for (    ; i < 10; i++) {  
			
			/* i + 1 is used so that the prompt won't start at 0 
			when the user is asked for the first number. 
			%d:
			% is a placeholder for a value
			d means the value is an int type (byte, short, int, long)*/
			System.out.printf("Enter number %d : ", i + 1);
			/* Declares a variable to hold the input from the user.
			num will be redeclared on each iteration of the loop and
			used for the next number */
			int num = input.nextInt();  
			/* Each time through the loop, the num entered by the 
			user will be added onto the total variable */ 
			total = total + num;
			/* Print out what the user entered */
			System.out.println("You typed: " + num);
		}
		System.out.println("Total " + total);
		/* When the loop is finished, i will be 10 and can therefore
		be used to calculate the average.*/
		System.out.println("Average " + (double)total / i);
		
		/* When you copy and paste a chunk of code, you might be able
		to use a method or loop instead. Here we will use a loop
		because we want to repeat the exact same code instantly and
		not at a later time. */
		
		/*System.out.print("Enter number 2 : ");
		int num2 = input.nextInt();
		System.out.println("You typed: " + num2);
		
		System.out.print("Enter number 3 : ");
		int num3 = input.nextInt();
		System.out.println("You typed: " + num3);
		
		System.out.print("Enter number 4 : ");
		int num4 = input.nextInt();
		System.out.println("You typed: " + num4);
		*/
	}
}