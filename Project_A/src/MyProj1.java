import java.util.Scanner;

public class MyProj1 {

		public static void main(String[] args) { //method
		System.out.println("What is your name?");
		
		//type identifier = new type();
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println("Hello " + name);
		
		String string = new String("This is  string");
		System.out.println(string + ":)");
	}
}

//comment
//class - contains everything - has members
//methods - do something
//arguments - what you pass to a method (part of the calling of the method)
//parameter - variable to store arguments (part of definition of a method)
//statement - telling the computer to do something
//properties - store something

//access modifies (public) - who can use?
//static - No instance of class is needed
//object - instance of a class