import java.util.ArrayList;
import java.util.List;

public class MyProj57 {

	public static void main(String[] args) {
		Student3 s = new Student3("Trape", "dePoh");
		s.sayHello();
		
		List<Talk> thingsThatTalk = new ArrayList<Talk>();
		thingsThatTalk.add(s);
	}

}
