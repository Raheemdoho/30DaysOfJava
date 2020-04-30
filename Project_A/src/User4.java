import java.util.List;

public class User4 {
	private String firstName;
	private String lastName;

	public String getFullName() {
		return getFirstName() + " " + lastName;
	}
	
	public String output() {
		return("Hi, my name is " + firstName + " " + lastName);
	}
	
	public String getFirstName() {
		return firstName.toUpperCase();
	}
	
	public void setFirstName(String fn) {
		firstName = fn.strip().toLowerCase();
	}
	
	public String getLastName() {
		return lastName.toUpperCase();
	}

	public void setLastName(String ln) {
		lastName = ln;
	}

	public static void printUsers(List<User4> users) {
		for(User4 u : users) {
			System.out.println(u.getFullName());
		}
	
	}
}