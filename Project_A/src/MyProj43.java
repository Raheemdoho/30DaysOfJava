import java.util.ArrayList;
import java.util.List;

public class MyProj43 {

	public static void main(String[] args) {
		User4 me = new User4();
		me.setFirstName("Caleb");
		me.setLastName("Curry");
		
		User4 you = new User4();
		you.setFirstName("Charles");
		you.setLastName("Curry");
		
		List<User4> users = new ArrayList<User4>();
		users.add(me);
		users.add(you);
		
		User4.printUsers(users);

	}

}
