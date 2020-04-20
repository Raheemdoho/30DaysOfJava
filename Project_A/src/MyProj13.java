import java.util.Scanner;

public class MyProj13 {

	public static void main(String[] args) {
	
	/*
		int i = 1;
		
		while(i < 11)
		{
		System.out.println("iteration " + i);
		i++;
		}
	 */
	
	System.out.println("Guess the password");
	String password = "let me in";
	Scanner scanner = new Scanner(System.in);
	String guess = scanner.nextLine();
	
	while(!guess.equals(password))
	{
		System.out.println("Guess the password");
		guess = scanner.nextLine();
	}
	
	System.out.println("congrats");
	scanner.close();
	}
		
}


