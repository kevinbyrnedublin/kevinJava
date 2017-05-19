package sheet4Arrays;

public class Ex8OrderingSystem1 {

	public static void main(String[] args) {
		int [] refNums = {1000, 1001, 1002, 1003, 1004}; 
		String [] productNames = {"keyboard", "Mouse", "Monitor", "Mouse mat", "Speakers"};
		double [] prices = {49.99, 15.5, 124.99, 3.99, 23.5};
		
		Ex8OrderingSystem1 ex8 = new Ex8OrderingSystem1();
		ex8.printProduct(refNums);
		ex8.printProduct1(productNames);
		ex8.printProduct2(prices);
		System.out.println("\n");
	}
		private void printProduct(int [] results) {
			System.out.print("Reference Number\t\n");
			for (int num1 : results) {
				System.out.print(num1 + "\n");
	}
		}
			private void printProduct1(String [] results) {
				System.out.print("Product Name");
				for (String num1 : results) {
					System.out.print(num1 + "\n");
		}
			}
				private void printProduct2(double [] results) {
					System.out.print("Price\n");
					for (double num1 : results) {
						System.out.print(num1 + "\n");
			}
		}
}


