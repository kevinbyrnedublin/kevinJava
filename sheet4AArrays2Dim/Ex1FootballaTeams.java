package sheet4AArrays2Dim;

public class Ex1FootballaTeams {

	public static void main(String[] args) {
	
		String [][] Teams = {
				{"Leeds\n", "Paul", "Mick", "Joe", "John\n"},
				{"Arsenal","Ronnie", "Philip", "Jack", "Peter\n"},
				{"Swindon\n","Trevor", "Pat", "Conor", "Mick"}
				};
			
for (int i = 0; i < Teams.length; i++)
		for (int j = 0; j < Teams[0].length; j++)
{
			System.out.println(Teams[i][j]);
		}
		
	}
}

