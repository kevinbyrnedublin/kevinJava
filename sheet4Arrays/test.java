package sheet4Arrays;

public class test {

	public static void main(String[] args) {
		int name [][] = {{1,2,3},
				{2,4,6}};



		for (int i = 0; i < name.length; i++){
			for (int j = 0; j < name.length; j++){
				System.out.println(name[i][j]);
			}
		}
	}
}
