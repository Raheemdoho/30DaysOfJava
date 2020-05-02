
public class MyProj59 {

	public static void main(String[] args) {
		Student3 s = new Student3("Trape", "dePoh");
							
				s.status = s.status.probation;
				
			System.out.println(s.status);
			
			switch(s.status) {
			case probation:
				System.out.println("Ouch");
				break;
			case active:
				System.out.println("Ouch");
				break;
			case innactive:
				System.out.println("Ouch");
				break;

		}
	}

}
