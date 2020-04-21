import java.util.Arrays;
import java.util.Scanner;

public class MyProj21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] grades = new int[size];
		
		/* Scanner input = new Scanner(System.in); */
		
		for(int i = 0; i < size; i++) {
			int x = input.nextInt();
			grades[i] = x;
		}
		
		System.out.println(Arrays.toString(grades));
	
		}
	}
