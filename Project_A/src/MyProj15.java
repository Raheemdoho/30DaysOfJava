
public class MyProj15 {

	public static void main(String[] args) {
		boolean additionallogging = false;
		
		for(int i = 9; i >= 0; i--) {
			System.out.println(i);
			
			if(i==5) {
				if(additionallogging == true) {
				System.out.println("We found 5");
				}
			}
		}
	}
}

