import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyProj35 {

	public static void main(String[] args) {
		List<Integer> allGrades = Arrays.asList(5, 3, 2, 6, 3);
		Collections.sort(allGrades);
		Collections.reverse(allGrades);
		for(int grade : allGrades) {
			
			System.out.println(grade);
			
		}
	}

}
