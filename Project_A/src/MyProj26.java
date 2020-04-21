import java.util.Arrays;
import java.util.List;

public class MyProj26 {

	public static void main(String[] args) {
	/*
	 * 	int[] grades = {1, 2, 3, 72, 5};
	 */

	String[] grades = new String[5];
		Arrays.fill(grades, "");
	
		System.out.println(Arrays.toString(grades));
		
		List<String> testing = Arrays.asList(grades);
	}

}
