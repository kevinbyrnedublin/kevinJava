package sheet5Classes;


public class Ex1MainForCar {

	public static void main(String[] args) {
		Ex1Car car1 = new Ex1Car("Toyota", "Avensis", 1.60);
		System.out.println("Cars in Stock");
		System.out.println("-------------------------");
		System.out.println("The make of your car is " + car1.getMake()
							+ "\nThe Model of your car is " + car1.getModel()
							+ "\nThe Engine Size of your car is " + car1.getEngineSize() + " Litre." );
		
		Ex1Car car2 = new Ex1Car("Skoda", "Octavia", 1.90);
		System.out.println("\nThe make of your car is " + car2.getMake()
							+ "\nThe Model of your car is " + car2.getModel()
							+ "\nThe Engine Size of your car is " + car2.getEngineSize() + " Litre." );

		
		Ex1Car car3 = new Ex1Car("Renault", "Scenic", 1.40);
		System.out.println("\nThe make of your car is " + car3.getMake()
							+ "\nThe Model of your car is " + car3.getModel()
							+ "\nThe Engine Size of your car is " + car3.getEngineSize() + " Litre." );

		
		Ex1Car car4 = new Ex1Car("Ford", "Focus", 1.60);
		System.out.println("\nThe make of your car is " + car4.getMake()
							+ "\nThe Model of your car is " + car4.getModel()
							+ "\nThe Engine Size of your car is " + car4.getEngineSize() + " Litre." );

		
		Ex1Car car5 = new Ex1Car("Susuki", "swift", 1.00);
		System.out.println("\nThe make of your car is " + car5.getMake()
							+ "\nThe Model of your car is " + car5.getModel()
							+ "\nThe Engine Size of your car is " + car5.getEngineSize() + " Litre." );

		
		
	}
	
}
