package sheet6ArrayOfObjects;

public class Ex1Car {
	private String make;
	private String model;
	private double engineSize;
	
	public Ex1Car(){};

	public Ex1Car(String make, String model, double engineSize) {
		this.make = make;
		this.model = model;
		this.engineSize = engineSize;
	}
	//Setters
	public void setMake(String newMake){
		make = newMake;
	}
	public void setModel(String newModel){
		model = newModel;
	}
	public void setEngineSize(double newEngineSize){
		engineSize = newEngineSize;
	}
	//Getters
	public String getMake(){
		return this.make;
	}

	public String getModel(){
		return this.model;
	}
	public double getEngineSize(){
		return this.engineSize;
	}

	public String toString() {
		return "\nMake is " + make + 
				"\nModel is " + model + 
				"\nEngine Size is " + engineSize
				;

	}
}
