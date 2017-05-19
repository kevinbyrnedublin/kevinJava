package sheet5Classes;

public class Ex4MainForEmail {

	public static void main(String[] args) {
		Ex4Email email = new Ex4Email();
		email.setEmailAddress("kevinbyrnedublin@yahoo.com");		
		email.setStorageLimit(500);
		email.setPassWord("FailWordddddddddddddddddddddddd");
		
		System.out.println("Your password is " + email.getPassWord() +
				". Please enter a valid password");
		System.out.println("Your storage limit is " + email.getStorageLimit());
		System.out.println(email);
	}

}
