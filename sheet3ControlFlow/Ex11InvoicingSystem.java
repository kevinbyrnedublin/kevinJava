package sheet3ControlFlow;

public class Ex11InvoicingSystem {

	public static void main(String[] args) {

		String refNum = "123ABC";
		double price = 1;
		int quantity = 101;
		
		Ex11InvoicingSystem ex11 = new Ex11InvoicingSystem();
		ex11.calculateTotal(refNum, price, quantity);
	}
	
	public void calculateTotal(String refNum, double price,
						       int quantity) {
		int remainder;
		double totalCost;
		/* If the quantity is over 100, the first 100 products
		 * are charged at the base price and any additional 
		 * products over 100 are charged at 75% of the price. */
		if (quantity > 100) {
			/* Works out the number of items over 100 */
			remainder = quantity - 100;
			/* Calculates the price for all items */
			totalCost = 100 * price + remainder * price * 0.75;
		} else {
			/* if the quantity is not over 100, then work
			 * out the price using the cost of the full price */
			totalCost = quantity * price;
		}
		
		System.out.printf("Reference number: %s \n"
				+ "Quantity: %d * price: �%.2f = �%.2f", 
				refNum, quantity, price, totalCost);
	}
}
/** SAMPLE OUTPUT
Reference number: 123ABC 
Quantity: 100 * price: �1.00 = �100.00

Reference number: 123ABC 
Quantity: 101 * price: �1.00 = �100.75
*/