import java.util.ArrayList;
import java.util.List;

public class MyProj48 {

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
			
			System.out.println(User7.searchList(users, you));
			
			
	}

}
