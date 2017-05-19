package sheet3ControlFlow;

class Ex4Loops {

	public static void main(String [] args) {
	
		int numOfLives = 8;
		
		do {
			System.out.println("Number of lives " + numOfLives);
			numOfLives--;
			//numOfLives = numOfLives - 1;
			//numOfLives -= 1;
		} while(numOfLives > 0);
	}
}