import java.util.ArrayList;
import java.util.List;

public class MyProj45 {

	public static void main(String[] args) {
		User5 me = new User5();
		me.setFirstName("Caleb");
		me.setLastName("Curry");
		
		User5 you = new User5();
		you.setFirstName("Oho");
		you.setLastName("Plat");
		
		List<User5> users = new ArrayList<User5>();
		users.add(me);
		users.add(you);
		
		//User5.printUsers(users);
		
		System.out.println(User5.searchList(users, "Oho", "Plat"));

	}

}
