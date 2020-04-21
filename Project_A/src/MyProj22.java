import java.util.Arrays;
import java.util.Scanner;

public class MyProj22 {

	public static void main(String[] args) {
		int[] grades = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < grades.length; i++) {
			if(grades[i] == 3) {
				System.out.println("Found at index " + i);
			}
			
		}	
	}
}