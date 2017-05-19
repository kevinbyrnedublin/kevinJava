package sheet5Classes;

public class Ex2Dog {

	private String breed;
	private String colour;
	private String ownersName;
	
	public Ex2Dog(){
	};
	
	public Ex2Dog(String breed, String colour, String ownersName){
		this.breed = breed;
		this.colour = colour;
		this.ownersName = ownersName;
	}
	
	//Setters
	public void setBreed(String newBreed){
		breed = newBreed;
	}
	
	public void setColour(String newColour){
		colour = newColour;
	}
	public void setOwnersName(String newOwnersName){
		ownersName = newOwnersName;
	}
	
	//Getters
	public String getBreed(){
		return breed;
	}
	public String getColour(){
		return colour;
	}
	public String getOwnersName(){
		return ownersName;
	}
	
	public String toString(){
		
				return String.format("\nBreed: %s\nColour: %s"
						+ "\nOwners Name: €%s", 
						breed, colour, ownersName);					
	}
	
	
}
