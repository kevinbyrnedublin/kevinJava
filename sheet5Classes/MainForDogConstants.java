package sheet5Classes;

/** 
 * Author: Sandra Hawkins
 * Date:   16 May 2017
 * ExerciseSolutions/sheet5Classes/MainForDog.java
 */ 


public class MainForDogConstants {

	public static void main(String[] args) {

		DogConstants d1 = new DogConstants();
		d1.setBreed(DogConstants.LABRADOR);
		d1.setColour("Golden");
		d1.setOwnersName("Mr. Brown");
		System.out.println("Breed: " + d1.getBreed());
		System.out.println("Colour: " + d1.getColour());
		System.out.println("Owner: " + d1.getOwnersName());
		
		// print the counter, static variable in Dog
		System.out.println("count: " + DogConstants.dogCounter);
		
		DogConstants d2 = new DogConstants(DogConstants.POINTER, "Black", "Agnieszka");
		System.out.println(d2);
		// print the counter
		System.out.println("count: " + DogConstants.dogCounter);
		
		DogConstants d3 = new DogConstants(DogConstants.GERMAN_SHEPHARD, "white", "Bill Gates");
		System.out.println(d3);
		
		DogConstants d4 = new DogConstants(65, "Brown", "Mr. Smith");  // Invalid breed
		System.out.println("Breed is " + d4.getBreed());  // 0
		System.out.println(d4);
	}
}
/** OUTPUT
Breed: 1
Colour: Golden
Owner: Mr. Brown
count: 1

Breed: Pointer
Colour: Black
Owner's name: Agnieszka
count: 2

Breed: German shephard
Colour: white
Owner's name: Bill Gates
Invalid breed
Breed is 0

Breed: Breed not set
Colour: Brown
Owner's name: Mr. Smith
*/
