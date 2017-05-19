package sheet6ArrayOfObjects;

import sheet5Classes.Ex1Car;

public class Ex1MainForCar {


	public static void main(String[] args) {
		Ex1Car[] cars1 = new Ex1Car[3];
		cars1[0].setMake("Toyota");
		cars1[0].setModel("Corolla");
		cars1[0].setEngineSize(1.6);
		
		System.out.println(cars1);
		
//		Ex1Car[] cars2 = new Ex1Car[3];
//		cars2[0].setMake("Skoda");
//		cars2[1].setModel("Octavia");
//		cars2[2].setEngineSize(1.9);
//		
//		Ex1Car[] cars3 = new Ex1Car[3];
//		cars3[0].setMake("Suzuki");
//		cars3[1].setModel("Swift");
//		cars3[2].setEngineSize(1.0);
//		
//		printArray(cars1);
//	}	
//		
//		
//		public static void printArray(Ex1Car[] x){
//			System.out.println("22");
//			//System.out.println("Model: " + x[1]);
//			//System.out.println("EngineSize: " + x[2]);
//		}
	}

}
