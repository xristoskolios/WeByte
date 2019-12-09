/**
 * User
 */

import java.util.ArrayList;

/** Containing everyone who uses our system */

public class User {

	private String name;
	private String email;
	
	public static ArrayList <User> users = new ArrayList <User>();
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
		users.add(this);
	}
	
	/** Getters for access to the object's fields.*/
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	/** Method toString so we can see the object of the class User.*/
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + "]";
	}
}
