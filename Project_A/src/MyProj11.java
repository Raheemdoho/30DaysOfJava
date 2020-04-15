import java.util.Scanner;

public class MyProj11 {

	public static void main(String[] args) {
		System.out.println("What's your name?");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		switch(name)
		{
		case "Oho":
			System.out.println("Welcome guy");
			break;
		
		case "Claire":
			System.out.println("Go away");
			break;
		
		case "Bill":
		case "Jill":
			System.out.println("Nan nah");
			break;
			
		default:
			System.out.println("Try again later");
			break;
		}
		
		
	}

}
