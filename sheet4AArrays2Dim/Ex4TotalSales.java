package sheet4AArrays2Dim;

public class Ex4TotalSales {



	public static void main(String[] args) {

		//Ex4TotalSales ex = new Ex4TotalSales();

		//ex.printSlip(SalesPerson);

		int [][] SalesPerson = {
				{1,1,100},
				{1,2,200},
				{1,3,400},
				{1,1,300},
				{2,4,400},
				{2,5,500},
				{2,3,600},
				{2,3,600},
				{3,2,1000},
				{2,3,800},
				{3,4,300},
				{3,4,500},
				{4,1,200},
				{4,3,300},
				{4,5,500}
				
		};

		System.out.printf("SalesPerson\tProduct\t\tTotal\n");
		for (int i=0; i< SalesPerson.length; i++){
			for (int j = 0; j < SalesPerson[i].length; j++){
				//for (int k = 0; k < SalesPerson.length; k++){
				System.out.printf(SalesPerson[i][j] + "\t\t ");

			}
			System.out.println();
		}
	}
}



//System.out.printf("%-10s%10s\n", "Old Price", "New Price");
//for (int i = 0; i < prices.length; i++) {
//	System.out.printf("%-10.2f %-10.2f\n", 
//					  prices[i], newPrices[i]);