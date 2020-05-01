import java.util.ArrayList;
import java.util.List;

public class MyProj46 {

	public static void main(String[] args) {
			User6 me = new User6();
			me.setFirstName("Caleb");
			me.setLastName("Curry");
			
			User6 you = new User6();
			you.setFirstName("Oho");
			you.setLastName("Plat");
			
			List<User6> users = new ArrayList<User6>();
			users.add(me);
			users.add(you);
			
			//User6.printUsers(users);
			
			System.out.println(me);

	}

}
