package sheet4AArrays2Dim;
public class test2 {

	public static void main(String[] args) {
		/* Set up an array with 4 elements, each element will 
		 * refer to an int array, not yet created in memory.
		 * An array is an object and therefore each element
		 * in the first dimension will contain null. 
		 * 
		 * 				0     1     2     3
		 * 	exams --> [null][null][null][null];		1st dimension
		 *
		 * The square brackets on the LHS cannot contain numbers.
		 * The first set of square brackets on the RHS must contain 
		 * a size. The second set of square brackets on the RHS may 
		 * contain a size.
		 **/
		int [][] exams = new int[4][];

		/* Now we are starting to set up the 2nd dimension. This
		 * sets up array 0 in memory and it will contain 2 elements.
		 * 
		 * 				0     1     2     3
		 * 	exams --> [null][null][null][null];		1st dimension 
		 * 	            /
		 *           [0][0]							2nd dimension
		 *           
		 * When you ask for new memory, you get default values.
		 */
		exams[0] = new int [2];
		exams[0][0] = 39;  // exams --> [][null][null][null];	
		exams[0][1] = 50;  //           /
						   //       [39][50]
		
		/* The following two lines set up an int array with one
		 * element containing 90 and exams[1] refers to it. 
		 * 
		 * 			    0   1    2      3
		 * 	exams -->  [ ] [ ] [null] [null];		1st dimension 
		 * 	           /    |
		 *        [39][50] [90]					2nd dimension
		 */
		exams[1] = new int[1];
		exams[1][0] = 90;
		
		exams[2] = new int [3];
		exams[2][0] = 39;
		exams[2][1] = 90;
		exams[2][2] = 40;
		
		exams[3] = new int [1];
		exams[3][0] = 20;
		
		/* The array now looks like this in memory:
		 * 
		 * 			    0    1    2         3
		 * 	exams -->  [ ]  [ ]  [ ]       [ ];		1st dimension 
		 * 	           /     |    \          \
		 *        [39][50] [90]	[39][90][40]  [20]	2nd dimension
		 *
		 * i 	is used to access each array in the 1st dimension
		 * j 	is used to access each element of each array in the
		 * 		second dimension. 
		 * The outer loop with i will execute four times as there
		 * are four arrays to loop through and the inner loop will 
		 * execute twice for the first array, once for the second 
		 * array, three times for the third array and once for the
		 * fourth array. 
		 * The condition  j < exams[i].length  causes the inner loop
		 * to execute the required number of times depending on the 
		 * length of each array in each dimension. 
		 */
		
		for (int i = 0; i < exams.length; i++) {
			for (int j = 0; j < exams[i].length; j++) {
				System.out.print(exams[i][j] + " ");
			}
			System.out.println();
		}
		
		/* Here is a one-liner for setting up an array in memory 
		 * with values for each element at the time of creation 
		 */
		int [][] examResults = { {39, 50},			// examResults[0]  
				                 {90},  			// examResults[1]
				                 {39, 90, 40}, 		// examResults[2]  
				                 {20}     			// examResults[3]
							   };
	}
}
/** OUTPUT
39 50 
90 
39 90 40 
20 
*/