import java.util.Scanner;

public class MyProj10 {
	public static void main(String[] args) {
System.out.println("How old are you");
		
		Scanner scanner = new Scanner(System.in);
		int age = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Cat or dogs");
		String animal = scanner.nextLine();
		
		if(age > 12 && ! animal.equals("dogs"))
		{
			System.out.println("Welcome");
		}
	}
		
	
}

	


/* comparison operators
 * == equality (equal to)
 * != Inequality (not equal to)
 * < less than
 * > greater than
 * <= less than or equal to
 * >= greater than or equal to
 */

/* Logical operators
 * && And (both have to be true)
 * || Or (either or both have to be true)
 * ! not (inverse the boolean)
 */
