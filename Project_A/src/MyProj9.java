import java.util.Scanner;

public class MyProj9 {

	public static void main(String[] args) {
		String password = "let me in";
		System.out.println("Guess the password: ");
		
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		
		System.out.println(password.equals(guess));
		
		if(password.toLowerCase().equals(guess.toLowerCase()))
		{
			System.out.println("Your guess was correct!");
			//return;
			
		} else if("don't stop believing".toLowerCase().equals(guess.toLowerCase()))
		
			{
			System.out.println("You got the second password");
			}
		
		else
		{
			System.out.println("This is false!");
		}
	}
}

//if(expression)
//{code to execute (if true)}
