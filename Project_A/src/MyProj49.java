import java.util.ArrayList;
import java.util.List;

public class MyProj49 {

	public static void main(String[] args) {
		User7 me = new User7();
		me.setFirstName("Caleb");
		me.setLastName("Curry");
		
		User7 you = new User7();
		you.setFirstName("Oho");
		you.setLastName("Cur");
		
		List<User7> users = new ArrayList<User7>();
		users.add(me);
		users.add(you);
		
		User7 search = new User7();
		search.setFirstName("Oho");
		search.setLastName("Cur");
		
		User7 found = User7.findUser(users, search);
		
		found.setFirstName("Sally");
		
		//System.out.println(found);
		
		System.out.println(you);
		

	}

}
