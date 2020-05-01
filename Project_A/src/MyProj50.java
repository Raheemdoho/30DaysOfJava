import java.util.ArrayList;
import java.util.List;

public class MyProj50 {

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
		
		int y = 4;
		User7.changeCrap(y);
		System.out.println(y);
		
		User7.changeGrap(you);
		System.out.println(you);
		
	}

}
