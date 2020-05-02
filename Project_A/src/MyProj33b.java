import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MyProj33b {

	public static void main(String[] args) {
		List<List<Integer>> allGrades = new ArrayList<List<Integer>>();
		allGrades.add(Arrays.asList(5, 3, 2, 6, 3));
		allGrades.add(Arrays.asList(4, 4, 2, 6, 4));
		allGrades.add(Arrays.asList(59, 40, 23, 6, 83));

		for(List<Integer> grades : allGrades) {
			for(int grade: grades) {
				System.out.print(grade + " ");
			}
			
			System.out.println();
		}
	}

}
