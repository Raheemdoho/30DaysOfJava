import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project_2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("Students.txt"));
			
		while(in.hasNextLine()) {
			System.out.println(in.nextLine());
			
		}
		
		in.close();
		
		}
}