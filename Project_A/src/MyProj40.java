import java.util.ArrayList;
import java.util.List;

public class MyProj40 {

	public static void main(String[] args) {
		String[] firstName = {"Caleb", "Sub", "Sally", "Jamie"};
		String [] lastName = {"Curry", "Sciber", "Smith", "Cal" };
		
		List<User3> users = new ArrayList<User3>();
		for(int i = 0; i < firstName.length; i++) {
			User3 u = new User3();
			u.setFirstName(firstName[i]);
			u.setLastName(lastName[i]);
			users.add(u);
		}
		
		for(User3 u : users) {
			System.out.println(u.getFullName());
		}
	}

}
