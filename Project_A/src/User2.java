public class User2 {
	public String firstName;
	public String lastName;

	/*
	 * public void output() {
	 
		System.out.println(firstName + " " + lastName);
		*/
	
	public void output(int times) {
		for(int i = 0; i < times; i++) {
			System.out.println(firstName + " " + lastName);
		}
		
	}

}
