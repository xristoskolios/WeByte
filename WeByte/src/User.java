import java.util.ArrayList;

public class User {

	private String name;
	private String email;
	
	public static ArrayList <User> users = new ArrayList <User>();
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
		users.add(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + "]";
	}
}
