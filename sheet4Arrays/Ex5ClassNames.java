package sheet4Arrays;

public class Ex5ClassNames {

	public static void main(String[] args) {
		
		String [] firstNames = {"Stephen", "Pat", "John", "Mary"};
		String [] lastNames = {"Murphy", "O'Connor", "Jones", "Smith"};
		
		/* Prints the first name concatenated to the last name */
		for (int i = 0; i < firstNames.length; i++) {
			System.out.println(firstNames[i] + " " + lastNames[i]);
		}
		
		/* Declares a string array to hold first and last names*/
		String [] fullNames = new String[firstNames.length];
			
		/* A loop to populate the fullNames array, I cannot 
		 * use the enhanced for loop to populate an array or
		 * to access three arrays as I am doing here. The enhanced
		 * for loop can only be used to access one array at once.*/
		for (int i = 0; i < fullNames.length; i++) {
			
			fullNames[i] = firstNames[i] + " " + lastNames[i];
		}

		System.out.println("***** The enhanced for loop printing *****");
		
		/* The enhanced for loop to print the contents of the 
		 * fullNames array.
		 * RHS: name of the array to loop through
		 * LHS: declare one of what's in it, i.e. a single String
		 *      variable to hold each name as the fullNames array
		 *      is being looped through. 
		 * As this array loop, name will hold a COPY of each 
		 * array element. */
		for (String name : fullNames) {
			System.out.println(name);
		}
	}

}