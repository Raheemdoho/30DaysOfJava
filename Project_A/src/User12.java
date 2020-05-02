
public abstract class User12 implements Talk{
	public enum status {active, innactive, probation};
	public String firstName;
	public String lastName;
	public boolean verified = false;
	public status status;
	
	public final void sayHello() {
	 	System.out.println("User version");
	}
	

}
