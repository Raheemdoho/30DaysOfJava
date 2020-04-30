import java.util.ArrayList;
import java.util.List;

public class MyProj39 {

	public static void main(String[] args) {
		User3 me = new User3();
		me.setFirstName("Oho");
		me.setLastName("Plat");
		
		User3 you = new User3();
		you.setFirstName("Sub");
		you.setLastName("Scriber");
		
		List<User3> users = new ArrayList<User3>();
		users.add(you);
		users.add(me);
		
		System.out.println(users.get(0).getFullName());
	}

}
