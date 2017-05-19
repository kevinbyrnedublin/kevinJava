package sheet3ControlFlow;

public class Ex10Floats {

	public static void main(String[] args) {
		
		float num1 = 2;
		float num2 = 3;
		float num3 = 1;
		
		Ex10Floats ex10 = new Ex10Floats();
		ex10.sameOrDifferent(num1, num2, num3);
		ex10.largestAndSmallest(num1, num2, num3);
		ex10.printAverage(num1, num2, num3);
	}
	
	public void largestAndSmallest(float a, float b, float c) {
		float largest = a;
		String variable = "num1";
		
		if (b > largest) {
			largest = b;
			variable = "num2";
		}
		if (c > largest) {
			largest = c;
			variable = "num3";
		}
		System.out.printf("%s is the largest, its value is %.2f\n",
				variable, largest);
		
		float smallest = a;
		if (b < smallest)
			smallest = b;
		if (c < smallest)
			smallest = c;
		System.out.println("the smallest is " + smallest);
	}
	
	public void printAverage(float a, float b, float c) {
		float average = (a + b + c) / 3;
		System.out.printf("The average is %.2f", average);
	}
	
	public void sameOrDifferent(float a, float b, float c) {
		if (a == b && b == c)
			System.out.println("All numbers are the same");
		else if (a != b && b != c && a != c)
			System.out.println("All numbers are different");
		else 
			System.out.println("Two are the same");
		
		/* This if statement is fine for two or more are the same */
		//if (a == b || a == c || b == c) 
	}
}
/** OUTPUT
All numbers are different
The largest is 3.0
the smallest is 1.0
The average is 2.00
*/
