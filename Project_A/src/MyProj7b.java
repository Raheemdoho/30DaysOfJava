import java.util.Scanner;

public class MyProj7b {

	public static void main(String[] args) {
		String fullAd = "  yummm.... my oh my eba nah the koko";
		//System.out.println(fullAd.toUpperCase());
		//System.out.println(fullAd.toLowerCase());

		
		String fullAd1 = "   yummm.... my oh my eba nah the koko\n    ";
				
		//System.out.println(fullAd1.strip());
	//	System.out.println(fullAd1.substring(10, 15));
		//System.out.println(fullAd1.repeat(10));
		//System.out.println(fullAd1.equals("hello"));
		
		
		String password = "let me in";
		System.out.println("Guess the password: ");
		
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		System.out.println(password.equals(guess)); 
		
		System.out.println(password == guess);
		
		//password == guess
		//works for primitives (i.e. it is the actuall value)
		
		//int x = 5;
		//String x  new String("This is an object");
		
		//does not work for objects (i.e objects are references)
		
		String a = "hi";
		String b = "hi";
		System.out.println(a == b);
		
		String c = new String ("hi");
		String d = new String ("hi");
		System.out.println (c == d);
		
		int x = 10;
		int y = 10;
		System.out.println(x == y);
		
	}

}
