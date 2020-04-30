import java.util.List;

public class User5 {
		private String firstName;
		private String lastName;

		public String getFullName() {
			return getFirstName() + " " + lastName;
		}
		
		public String output() {
			return "Hi, my name is " + getFullName() + ".";
		}
		
		public String output(boolean nice) {
			if(nice ) {
				
				return "You are beautiful - " + getFullName() + ".";
				
			}
			
			return "You are a freak. - " + getFullName() + ".";
		
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public void setFirstName(String fn) {
			firstName = fn.strip();
		}
		
		public String getLastName() {
			return lastName;
		}

		public void setLastName(String ln) {
			lastName = ln;
		}

		public static void printUsers(List<User5> users) {
			for(User5 u : users) {
				System.out.println(u.getFullName());
			}
		
		}
		
			public static int searchList (List<User5> users, String fn, String ln) {
				return searchList(users, fn + " " + ln);
			}
			
			public static int searchList (List<User5> users, String fullName) {
				for(int i = 0; i < users.size(); i++) {
					if(users.get(i).getFullName().equals(fullName)) {
						return i;
					} 
				}
						return -1;
				
				}
			}
	

