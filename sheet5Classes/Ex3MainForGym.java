package sheet5Classes;

import java.util.Scanner;

public class Ex3MainForGym {

	public static void main(String[] args) {
		Ex3Gym gym = new Ex3Gym();
		gym.setMemCost(300.0);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String input2 = scanner.nextLine();
		//
		System.out.println("Name is "  + input2);
		System.out.println("Would you prefer monthly or yearly payments? \nEnter 1 for Yearly Payments.\nEnter 2 for Monthly Payments.");
		int input = Integer.parseInt(scanner.next());
		if (input == 1){
			gym.setPaymentFreq(1);
			
		}
			else if(input == 2)
			
			{
				gym.setPaymentFreq(12);
				
			}
		System.out.println("Gym Membership Details");
		System.out.println("----------------------");
		System.out.println("\nYour yearly payment is €" + gym.getMemCost()/gym.getPaymentFreq());
		System.out.println("Your membership number is " + gym.getMemNum());
		
		Ex3Gym gym1 = new Ex3Gym();
		gym1.setMemCost(300.0);
		Scanner scanner1 = new Scanner(System.in);
		
		
		
		System.out.println("\nWould you prefer monthly or yearly payments? \nEnter 1 for Yearly Payments.\nEnter 2 for Monthly Payments.");
		int input1 = Integer.parseInt(scanner1.next());
		if (input1 == 1){
			gym1.setPaymentFreq(1
					);
			System.out.println("Your yearly payments are €" + gym1.getMemCost()/gym1.getPaymentFreq());
			System.out.println("Your membership number is " + gym1.memNum);
		}
			else
			{	
				input1 = 2;
				gym1.setPaymentFreq(12);
				System.out.println("Your monthly payments are €" + gym1.getMemCost()/gym1.getPaymentFreq());
				System.out.println("Your membership number is " + gym1.memNum);
			}
		{
			//Ex3Gym[] g1 = {g1.get};
//			Ex3Gym [] gymArray = {gym};
//			System.out.println(gymArray[0]);
			System.out.println(gym);
		}
		scanner.close();
		scanner1.close();
		}
	
	}
	


