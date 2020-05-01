import java.util.List;

public class User7 {
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

	public static void printUsers(List<User7> users) {
		for(User7 u : users) {
			System.out.println(u.getFullName());
		}
	}
	
	public static User7 findUser(List<User7> users, User7 u) {
		for(User7 user: users) {
			if(user.equals(u)) {
				return user;
			}
		}
				return null;
	}
		
		public static int searchList (List<User7> users, User7 u) {
			return searchList(users, u.getFullName());
		}
	
		
		public static int searchList (List<User7> users, String fn, String ln) {
			return searchList(users, fn + " " + ln);
		}
		
		public static int searchList (List<User7> users, String fullName) {
			for(int i = 0; i < users.size(); i++) {
				if(users.get(i).getFullName().equals(fullName)) {
					return i;
				} 
			}
					return -1;
			
			}

		public static void changeCrap(int x) {
			x++;
		}

		
		public static void changeGrap(User7 p) {
			p = new User7();
			p.setFirstName("Changed");
		}
		
		@Override
		public String toString() {
			return "User7 [getFullName()=" + getFullName() + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
			result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User7 other = (User7) obj;
			if (firstName == null) {
				if (other.firstName != null)
					return false;
			} else if (!firstName.equals(other.firstName))
				return false;
			if (lastName == null) {
				if (other.lastName != null)
					return false;
			} else if (!lastName.equals(other.lastName))
				return false;
			return true;
		}
				
		
		}


