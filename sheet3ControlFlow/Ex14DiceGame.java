/*
 * A simple dice game is played with two dice (store that 
 * values in two variables). For a normal dice throw, the 
 * amount of points you get will be calculated by multiplying 
 * the eyes from each dice, i.e. a throw of 4 and 2 would 
 * give you 8 points. There are some exceptions to this rule:
 * 
 * � 6 is a special number: Whenever at least one 6 is 
 *     thrown, the sum of the eyes will be used instead of 
 *     the multiplication.
 * � 3 is your lucky number: For each 3, you will get 10 
 *     bonus points.
 * � 5 is your unlucky number: For each 5, your score will 
 *     be decreased by 4 points.
 */
package sheet3ControlFlow;

import java.util.Random;

public class Ex14DiceGame {

	public static void main(String[] args) {
		/* Use Math.random() and the Random class to 
		 * get the values for each die.
		 */
		int die1 = (int)(Math.random() * 6) + 1;
		int die2 = new Random().nextInt(6) + 1;
		
		System.out.printf("die 1: %d\ndie 2: %d\n", die1, die2);
		/* Creates an instance of this class, so I can call
		 * the calculateScore() method underneath */		
		Ex14DiceGame ex14 = new Ex14DiceGame();
		/* Call the method and assign the retured value to the
		 * score variable */
		int score = ex14.calculateScore(die1, die2);
		/* Prints the score */
		System.out.println("Score: " + score);
	}
	
	/**
	 * calculateScore() takes in two ints, one for each die.
	 * It works out the score and return it. 
	 */
	private int calculateScore(int die1, int die2) {
		int score = 0;
		
		/* If either die is a 6 then sum the dice */
		if (die1 == 6 || die2 == 6) {
			score = die1 + die2;
		} else { // otherwise multiply the dice
			score = die1 * die2;
		}
		
		/* If the first die is a three, add 10
		 * or if the first die is a five, subtract 4 */
		if (die1 == 3)
			score += 10;
		else if (die1 == 5)
			score -= 4;
		
		/* If the second die is a three, add 10
		 * or if the second die is a five, subtract 4 */
		if (die2 == 3)
			score += 10;		
		else if (die2 == 5)
			score -= 4;
		
		/* return the score */
		return score;
	}
}
/** SAMPLE OUPUT
die 1: 2
die 2: 3
Score: 16

die 1: 1
die 2: 5
Score: 1


*/