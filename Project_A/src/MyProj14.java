import java.util.Scanner;

public class MyProj14 {
	public static void main(String[] args) {
		
		String password = "let me in";
		Scanner scanner = new Scanner(System.in);
		String guess;
		do
	{
			System.out.println("Guess the password");
			guess = scanner.nextLine();
		} while(!guess.equals(password));
	
		System.out.println("congrats");
		scanner.close();
		
	for(int i = 9; i >= 0; i--) {
		System.out.println(i);
	}
	}
}


