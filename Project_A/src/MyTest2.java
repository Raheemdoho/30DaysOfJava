import java.util.Arrays;
import java.util.Scanner;

public class MyTest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size1 = input.nextInt();
		int[] grades = new int[size1];
				
		for(int i = 0; i < size1; i++) {
			int x = input.nextInt();
			grades[i] = x;
		}
				
			for(int i = 0; i < size1; i++) {
				System.out.println(grades[i]+ " ");
			}
	}
}

