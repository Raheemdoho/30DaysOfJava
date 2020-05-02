
public class Student2 extends User9 {
	public boolean verified = true;
	public String major;

	public Student2() {
		System.out.println("Creating a student");
	}
	
	public Student2(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}

	@Override
	public void sayHello() {
		System.out.println("Hi my major is " + major + ". My name is " + firstName + " " + lastName);

		
	}
	
}



