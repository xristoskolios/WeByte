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
			getQ2RESULTS();
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
	
	//** Log-in method for the Managers.*/
	public void login() {
		System.out.println("~~~LOGIN AS MANAGER~~~");
		while (false) {
			Scanner in = new Scanner(System.in);
			System.out.println("Please insert your email.");
			String em = in.nextLine();
			System.out.println("Please insert your password.");
			String pw = in.nextLine();
			for (Manager i: managers) {
				if (em.equals(i.getEmail()) && pw.equals(i.getPassword())) {
					System.out.println("Log in done successfully.");
					this.getMenu();
				}	
			}
			System.out.println("Wrong email or/and password.Please try again.");
		}
	}
	
	//** Method to calculate the effectiveness of Mobile from answer sheet(ArrayList) from Questionnaire's field q2.*/
	public static void getQ2Results() {
		System.out.println("---The effectiveness of mobile---");
		int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0; //ANSWERS 1,2,3,4,5 FROM QUESTION 2 OF THE QUESTIONNAIRE
		for (Questionnaire k: Questionnaire.Qs) {
			if (k.q2 == 1) {
				a1++;
			} else if (k.q2 == 2) {
				a2++;
			} else if (k.q2 == 3) {
				a3++;
			} else if (k.q2 == 4) {
				a4++;
			} else { // k.q2 == 5, definately q2 must be either 1 either 2 either 3 either 4 either 5.
				a5++;
			}
		}
		int n = Questionnaire.n; //Number of questionnaires done.
		//Otherwise int n = Questionnaire.Qs.length;
		if (n>0) {
			double p1 = (double) a1/n; //Rate of answer 1
			double p2 = (double) a2/n; //Rate of answer 2
			double p3 = (double) a3/n; //Rate of answer 3
			double p4 = (double) a4/n; //Rate of answer 4
			double p5 = (double) a5/n; //Rate of answer 5
		System.out.printf("The rate of asnwer 1 is: %.2f%%" + p1 + ".\n");
		System.out.printf("The rate of asnwer 2 is: %.2f%%" + p2 + ".\n");
		System.out.printf("The rate of asnwer 3 is: %.2f%%" + p3 + ".\n");
		System.out.printf("The rate of asnwer 4 is: %.2f%%" + p4 + ".\n");
		System.out.printf("The rate of asnwer 5 is: %.2f%%" + p5 + ".\n");
		} else { //No questionnaires done by any Customer.
			System.out.println("No questionnaires have been done yet.");
		}
	}
}
