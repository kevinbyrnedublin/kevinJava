package sheet4AArrays2Dim;

public class CalendarTest {

	public static void main(String[] args) {

		String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String [] days = {"M","T","W","Th","F","S","S"};
		int [][] daysInEachMonth = {
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}
		};
		int startingDay = 6;
		int printCounter = startingDay;
		for (int m= 0; m < months.length; m++)
		{
			System.out.println(months[m]);

			for (int i = 0; i < days.length; i++)
			{
				System.out.printf("%-3s",days[i]);
			}
			System.out.println();


			if(printCounter > 0)
			{
				for (int k = 0; k < printCounter; k++)
				{
					System.out.printf("%-3s", " ");
				}
			}
			for (int j = 0; j < daysInEachMonth[m].length; j++)
			{
				System.out.printf("%-3d",daysInEachMonth[m][j]);

				if ((printCounter + 1) % 7 ==0)
				{
					System.out.println();
					printCounter = 0;
				}
				else
				{
					printCounter++;
				}
			}
			System.out.println();
			System.out.println();
		}
	}
}



