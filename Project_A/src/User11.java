
public abstract class User11 {
	private String firstName;
	private String lastName;
	
	public User11(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
		
	public final void sayHello() {
	 	System.out.println(firstName + " " + lastName);
	}
}
