import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) {
		System.out.println("Enter your name");
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		if(s.equals("Okhaide"))	{
			System.out.println("Hey Okhaide");
			} else if(s.contentEquals("Caleb")) {
				System.out.println("Hey Caleb");
			} else {
				System.out.println("You're not welcome here");
			}
				
		in.close();
		
		}
}


