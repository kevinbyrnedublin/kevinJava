package sheet5Classes;

public class Ex2MainForDog {

	public static void main(String[] args) {
		Ex2Dog dog = new Ex2Dog();
		dog.setBreed("Doberman Pincherman");
		dog.setColour("Green with Blue Stripes");
		dog.setOwnersName("Johnny Wolfe");
		
		System.out.println("Dog Summary");
		System.out.println("----------------------");
		System.out.println("Your dog is a " + dog.getBreed());
		System.out.println("Wow! Where did you get a dog that's " + dog.getColour());
		System.out.println("Your joking me. Your name is really " + dog.getOwnersName());
		System.out.println(dog);

	}

}
