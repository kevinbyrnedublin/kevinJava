package sheet4AArrays2Dim;

import java.util.Scanner;

public class NamesAndAddresses {
	public static void main(String[] args) {

		String [][] NameAndAddress = {
				{"Paddy Murphy"," 10 High Street ","Belmont ","Co. Offaly\n"},
				{"Paddy Dempsey"," 22 New Street ","Churchtown ","Co. Wexford\n"},
				{"Paddy Clancy"," 10 High Street ","Belmont ","Co Antrim\n"}
		};
		//System.out.println(NameAndAddress[1][0]);
		NamesAndAddresses N = new NamesAndAddresses();
		N.enterNamePrintAddress(NameAndAddress);

		//Scanner scanner = new Scanner(System.in);

		//System.out.print("Please enter a name");

		//String name = scanner.next();	
		//String[] ctr1 = new String[name];
	}

	/*System.out.print("Enter How Many Inputs: ");
	    int numOfInputs = Integer.parseInt(scanner.nextLine());
	    ctr1 = new String[numOfInputs];
	    for (int i = 0; i < numOfInputs; i++) {
	        System.out.println(choices[i]);
	        ctr1[i] = scanner.nextLine();*/

	/*private void ScanNames(String [][] x){
		for (int row = 0; row < x.length; row++)
			for (int column = 0; column <x[row].length; column++){
				System.out.print(x[row][column]);
				//ctr1[i] = scanner.nextLine();
			}
	}*/
	public void enterNamePrintAddress(String[][] y){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a name");
		String name = scanner.nextLine();
		scanner.close();
		for (int row = 0; row < y.length; row++){
			//for (int column = 0; column < y[row].length; column++){

				if (y[row][0].equals(name))
				{
					System.out.print(y[row][0]);
					System.out.print(y[row][1]);
					System.out.print(y[row][2]);
					System.out.print(y[row][3]);
				}
				
		}
		}
	}



/*for (int i = 0; i < exams.length; i++) {
	for (int j = 0; j < exams[i].length; j++) {
		System.out.print(exams[i][j] + " ");
	}
	System.out.println();
}*/
