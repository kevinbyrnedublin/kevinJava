package sheet5Classes;

public class Ex4Email {

		private String emailAddress;
		private String password;
		private int StorageLimit;
		public static final int MAX_STORAGE_LIMIT_100 = 100;
		public static final int MAX_STORAGE_LIMIT_500 = 500;
		public static final int MAX_STORAGE_LIMIT_1000 = 1000;
		
public Ex4Email(){}

public Ex4Email(String EmailAddress, String PassWord, int Storage){
	this.emailAddress = EmailAddress;
	setEmailAddress(PassWord); 
	setStorageLimit(Storage);
}
//Setters
public void setEmailAddress(String EmailAddress){
	if ((EmailAddress.contains("@") && EmailAddress.contains(".") &&
		(EmailAddress.indexOf("@") < EmailAddress.indexOf("."))))
	this.emailAddress = EmailAddress;
	else
		System.out.println("Incorrect email address");
}
public void setPassWord(String Password){
	if (Password.length() <= 20)
	this.password = Password;
	else 
		System.out.println("Password length is too long");
}
public void setStorageLimit(int Storage){
	switch (Storage){
	case 100:
		StorageLimit = Storage;
		System.out.println("Storage is 100");
		break;
	case 500:
		StorageLimit = Storage;
		System.out.println("Storage is 500");
		break;
	case 1000:
		StorageLimit = Storage;
		System.out.println("Storage is 1000");
		break;
	default:
		StorageLimit = Storage;
		System.out.println("Storage must be 100, 500, or 1000");
	}

}
//Getters
public String getEmailAddress(){
	return emailAddress;
}
public String getPassWord(){
	return password;
}
public int getStorageLimit(){
	return StorageLimit;
}
//toString
public String toString(){
	return "\ntoString" +
			"\n-------" +
			"\nEmail Address is " + emailAddress +
			"\nPassword is " + password +
			"\nStorage Limit is " + StorageLimit;
}

}
