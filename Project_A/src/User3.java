public class User3 {
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


}