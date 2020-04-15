import java.util.Scanner;

public class MyTest1 {

	public static void main(String[] args) {
		System.out.println("What's your name?");
		String person1 = "Oho";
		String person2 = "Claire";
		String person3 = "Bill";
		String person4 = "Jill";
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		if(name.toLowerCase().equals(person1.toLowerCase()))
			{ System.out.println("Welcome guy");
					
			} else if(name.toLowerCase().equals(person2.toLowerCase()))
				{ System.out.println("Go away");
			
				} else if(name.toLowerCase().equals(person3.toLowerCase()))
				{	System.out.println("Nan nah");
				
			} else if(name.toLowerCase().equals(person4.toLowerCase()))
				{	System.out.println("Nan nah");
				
		} else 
			{System.out.println("Try again later");
		}
		
	}

}


