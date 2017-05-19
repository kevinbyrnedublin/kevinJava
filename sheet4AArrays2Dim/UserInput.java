package sheet4AArrays2Dim;

import java.util.Scanner;

public class UserInput {

 
	public static void main(String[] args){
 
		 	String [] choices = { "Enter Name:","Enter age:","Enter gender:"};
		    String ctr1[];

		    //A simple text scanner which can parse primitive types 
		    //and strings using regular expressions.
		    Scanner scanner = new Scanner(System.in);
		    //First you decide  the number of Inputs you want to save inside the Array
		    System.out.print("Enter How Many Inputs: ");
		    int numOfInputs = Integer.parseInt(scanner.nextLine());
		    ctr1 = new String[numOfInputs];
		    for (int i = 0; i < numOfInputs; i++) {
		        System.out.println(choices[i]);
		        ctr1[i] = scanner.nextLine();
	    }
		    
		    //Second you Type the User Info you want to save inside your array ; But
		    //you got limited number of User to save according to number of inputs
		    for(int i = 0; i < ctr1.length; i++)
		    {
		        if(i == 0)
		            System.out.println("Name: "+ ctr1[i]);
		        else if( i == 1)
		            System.out.println("Age: "+ ctr1[i]);
		        else if( i == 2)
		            System.out.println("Gender: "+ ctr1[i]);
		    }
 
	}
 
}
