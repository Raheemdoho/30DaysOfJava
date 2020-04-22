import java.util.Arrays;
import java.util.List;

public class MyProj31 {

	public static void main(String[] args) {
		List<Integer> grades = Arrays.asList(5, 3, 2, 6,3);
	
		
		for(int i = 0; i < 	grades.size(); i++ ) {
			grades.set(i,  grades.get(i) * 2);
			System.out.println(grades.get(i));
			
		}
	}

}
