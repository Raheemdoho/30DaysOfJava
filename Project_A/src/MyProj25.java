import java.util.Arrays;

public class MyProj25 {

	public static void main(String[] args) {
		int[] grades1 = {1, 2, 3, 72, 5};
		int[] grades2 = {1, 2, 3, 72, 5};
		
		if(grades1 == grades2) {
			System.out.println("Equals");
		}
		
		if(grades1.equals(grades2)) {
			System.out.println("Equals");
		}
		
		System.out.println(grades1 + " " + grades2);
		
		if(Arrays.equals(grades1, grades2)) {
		System.out.println("Equals now");
		}
	}

}
