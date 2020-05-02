import java.util.ArrayList;
import java.util.List;

public class MyProj53 {

	public static void main(String[] args) {
		Student s = new Student();
		s.major = "E No work";
		s.firstName = "Skrall";
		s.lastName = "Nald";
		//s.sayHello();
		
		Teacher t = new Teacher();
		t.firstName = "Teacher";
		t.lastName = "Chike";
		
		List<User8> users = new ArrayList<User8>();
		users.add(s); users.add(t);
		
		for(User8 u: users) {
			u.sayHello();
		}
	}

}
