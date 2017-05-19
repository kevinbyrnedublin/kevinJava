package sheet3ControlFlow;

import java.util.Random;

public class Ex13TotalTwoDice {

	public static void main(String[] args) {
		
		/* 
		 * Math.random()	* 6		(int)  +1
		 * 0.0				0.0		  0		1
		 * 0.2				1.2		  1		2
		 * 0.5				3.0		  3		4
		 * 0.8				4.8		  4		5
		 * 0.9				5.4		  5		6
		 * 
		 **/
		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;
		
		System.out.printf("Dice 1: %d\nDice 2: %d\n", dice1, dice2);
		
		Random random = new Random();
		/* nextInt(6) will return a number between 0 and 5 */
		int num = random.nextInt(6);  // 0 to 5
		System.out.println("using random.nextInt() " + (num + 1));  // 1 to 6
	}
}