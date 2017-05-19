package sheet4Arrays;


import java.util.Scanner;

public class Ex2DoubleArray {
public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		double [] nums  = new double [3];
		/* A local variable is one declared inside a method.
		All local variables MUST be given a value (initialised)
		before they are accessed (added to or printed) */
		double total = 0;
		/* i is declared before the loop, so that it can be
		accessed after the loop to calculate the average */
		int i = 0;
		
		/* This loop loops through the nums array */
		for ( ; i < nums.length; i++) {
			/* Prompt the user to input a double */
			System.out.printf("Enter double %d : ", i + 1);
			/* RHS reads a double from the keyboard and 
			LHS assigns it to the current element in the array */
			nums[i] = input.nextDouble();
			total = total + nums[i]; // total += nums[i];
		}
		
		for (i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.printf("The total is %.2f\n", total);
		System.out.printf("The average is %.2f", total / i);
	}
}
