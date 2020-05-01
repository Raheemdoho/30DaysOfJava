import java.util.List;

public class User6 {

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

	public static void printUsers(List<User6> users) {
		for(User6 u : users) {
			System.out.println(u.getFullName());
		}
	
	}
	
		public static int searchList (List<User6> users, String fn, String ln) {
			return searchList(users, fn + " " + ln);
		}
		
		public static int searchList (List<User6> users, String fullName) {
			for(int i = 0; i < users.size(); i++) {
				if(users.get(i).getFullName().equals(fullName)) {
					return i;
				} 
			}
					return -1;
			
			}

		@Override
		public String toString() {
			return "User6 [getFullName()=" + getFullName() + "]";
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
			User6 other = (User6) obj;
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


