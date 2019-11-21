/*
 *Manager
*/


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Containing everything that's necessary for a Manager.
 * There is the manager's menu with some choices which the manager can choose from
 * and there are the methods that calculate its one of them.
*/
public class Manager extends User {
	/*
	 * Every Manager is a User so there is an ArrayList to collect every single one of them to get further information and possibilities.
	 */
	
	/** ArrayList that contains every manager.*/
	public static ArrayList <Manager> managers = new ArrayList <Manager>();
	
	/* Manager's password.*/
	private String password;
	
	/** Manager's constructor getting as parameter Manager's name, email and password.*/
	public Manager(String name, String email, String password) {
		super(name, email);
		this.password = password;
		managers.add(this);
	}
	
	/** Having Setters & Getters so it's possible get access to the object's fields.*/
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static ArrayList<Manager> getManagers() {
		return managers;
	}
	
	/** Showing the menu and also getting answer from the user-manager to calculate
	 * some of the given choices for statistic reasons.
	 */
	@Override
	public void getMenu() {
		System.out.println("Welcome, Mr/Ms." + this.getName() + "\n"
				+ "Please insert 1 for loyal customers.\n"
				+ "Please insert 2 for customers who are most likely to be lost.\n"
				+ "Please insert 31 for effectiveness of Mobile.\n"
				+ "Please insert 32 for effectiveness of Internet.\n"
				+ "Please insert 33 for effectiveness of Satelite TV.\n"
				+ "Please insert 34 for effectiveness of Customer Service.\n"
				+ "Please insert 4 for Questionnaire evaluation.");
		Scanner sc = new Scanner(System.in);
		int ans = 0;	//Managers's given answer from the keyboard using class Scanner.
		boolean b = false;
		do {
		try {
			do {
				ans = sc.nextInt();
				if (!(ans == 1 || ans == 2 ||
						ans == 31 ||ans == 32 ||ans == 33 ||ans == 34 ||ans == 35 || ans == 4)) {
				System.err.println("Wrong input.Please insert one of the choices.");
				}
			} while (ans == 1 || ans == 2 ||
					ans == 31 ||ans == 32 ||ans == 33 ||ans == 34 ||ans == 35 || ans == 4);
			b = true;
		} catch (InputMismatchException e){
			System.err.println("Please type an integer.\nTry again.");
			sc.nextLine(); //Clearing the scanner if Manager gives string instead of int.
		}
		} while (b == false);
		if (ans == 1) {
			//method FIXME
		} else if (ans == 2) {
			//method FIXME
		} else if (ans == 31) {
			//method FIX ME
		} else if (ans == 32) {
			//method FIXME
		} else if (ans == 33) {
			//method FIXME
		} else if (ans == 34) {
			//method FIXME
		} else if (ans == 4) {
			//method FIXME
		}
		sc.close();
	}

}
