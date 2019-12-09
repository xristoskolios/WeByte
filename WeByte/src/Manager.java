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

	public void getMenu() {
		System.out.println("Welcome, Mr/Ms." + this.getName() + "\n"
				+ "Please insert 1 for loyal customers.\n"
				+ "Please insert 2 for customers who are most likely to be lost.\n"
				+ "Please insert 3 for the Quality of Mobile Services.\n"
				+ "Please insert 4 for the Quality of the Internet.\n"
				+ "Please insert 5 for the Quality of the Satellite TV.\n"
				+ "Please insert 6 for the Quality of Customer Service.\n"
				+ "Please insert 7 for Questionnaire evaluation.");
		Scanner sc = new Scanner(System.in);
		int ans = 0;	//Managers's given answer from the keyboard using class Scanner.
		boolean b = false;
		do {
		try {
			do {
				ans = sc.nextInt();
				if (!(ans >= 1 && ans <= 7)) {
				System.err.println("Wrong input.Please insert one of the choices.");
				}
			} while (ans >= 1 && ans <= 7);
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
		} else if (ans == 3) {
			getQ2Results();
		} else if (ans == 4) {
			getInternetQResults();
		} else if (ans == 5) {
			getSateliteTVQResults();
		} else if (ans == 6) {
			//method FIXME
		} else if (ans == 7) {
			//method FIXME
		}
		sc.close();
	}
	
	/* Log-in method for the Managers.*/
	public void login() {
		System.out.println("~~~LOGIN AS MANAGER~~~");
		while (true) {
			Scanner in = new Scanner(System.in);
			System.out.println("Please insert your email.");
			String em = in.nextLine();
			if (em == "\n" ) {
				Webyte.startingMenu();
			}
			System.out.println("Please insert your password.");
			String pw = in.nextLine();
			if (pw == "\n") {
				Webyte.startingMenu();
			}
			for (Manager i: managers) {
				if (em.equals(i.getEmail()) && pw.equals(i.getPassword())) {
					System.out.println("Log in done successfully.");
					this.getMenu();
				}	
			}
			System.out.println("Wrong email or/and password.Please try again.");
		}
	}
	
	//** Method to calculate the Quality of Mobile Services from answer sheet(ArrayList) from Questionnaire's field q2.*/
	public static void getQ2Results() {
		System.out.println("---The Quality of Mobile Services---");
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
			double p1 = (double) 100*a1/n; //Rate of answer 1
			double p2 = (double) 100*a2/n; //Rate of answer 2
			double p3 = (double) 100*a3/n; //Rate of answer 3
			double p4 = (double) 100*a4/n; //Rate of answer 4
			double p5 = (double) 100*a5/n; //Rate of answer 5
		System.out.printf("The rate of asnwer 1 is: %.2f%%" + p1 + ".\n");
		System.out.printf("The rate of asnwer 2 is: %.2f%%" + p2 + ".\n");
		System.out.printf("The rate of asnwer 3 is: %.2f%%" + p3 + ".\n");
		System.out.printf("The rate of asnwer 4 is: %.2f%%" + p4 + ".\n");
		System.out.printf("The rate of asnwer 5 is: %.2f%%" + p5 + ".\n");
		} else { //No questionnaires done by any Customer.
			System.out.println("No questionnaires have been done yet.");
		}
	}
	//** Method to calculate the Quality of the Internet from answer sheet(ArrayList) from Questionnaire's field q3.*/
	public static void getInternetQResults() {
		System.out.println("---The Quality of the Internet---");
		int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0; //ANSWERS 1,2,3,4,5 FROM QUESTION 3 OF THE QUESTIONNAIRE
		for (Questionnaire k: Questionnaire.Qs) {
			if (k.q3 == 1) {
				a1++;
			} else if (k.q3 == 2) {
				a2++;
			} else if (k.q3 == 3) {
				a3++;
			} else if (k.q3 == 4) {
				a4++;
			} else { // k.q3 == 5, definitely q3 must be either 1 either 2 either 3 either 4 either 5.
				a5++;
			}
		}
		int n = Questionnaire.n; //Number of questionnaires done.
		if (n>0) {
			double p1 = (double) 100*a1/n; //Rate of answer 1
			double p2 = (double) 100*a2/n; //Rate of answer 2
			double p3 = (double) 100*a3/n; //Rate of answer 3
			double p4 = (double) 100*a4/n; //Rate of answer 4
			double p5 = (double) 100*a5/n; //Rate of answer 5
			System.out.printf("The rate of answer 1 is: %.2f%%" + p1 + ".\n");
			System.out.printf("The rate of answer 2 is: %.2f%%" + p2 + ".\n");
			System.out.printf("The rate of answer 3 is: %.2f%%" + p3 + ".\n");
			System.out.printf("The rate of answer 4 is: %.2f%%" + p4 + ".\n");
			System.out.printf("The rate of answer 5 is: %.2f%%" + p5 + ".\n");
		} else { //No questionnaires done by any Customer.
			System.out.println("No questionnaires have been done yet.");
		}
	}
	//** Method to calculate the Quality of the Satellite TV from answer sheet(ArrayList) from Questionnaire's field q4.*/
	public static void getSateliteTVQResults() {
		System.out.println("---The Quality of the Satellite TV---");
		int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0; //ANSWERS 1,2,3,4,5 FROM QUESTION 4 OF THE QUESTIONNAIRE
		for (Questionnaire k: Questionnaire.Qs) {
			if (k.q4 == 1) {
				a1++;
			} else if (k.q4 == 2) {
				a2++;
			} else if (k.q4 == 3) {
				a3++;
			} else if (k.q4 == 4) {
				a4++;
			} else { // k.q4 == 5, definitely q4 must be either 1 either 2 either 3 either 4 either 5.
				a5++;
			}
		}
		int n = Questionnaire.n; //Number of questionnaires done.
		if (n>0) {
			double p1 = (double) 100*a1/n; //Rate of answer 1
			double p2 = (double) 100*a2/n; //Rate of answer 2
			double p3 = (double) 100*a3/n; //Rate of answer 3
			double p4 = (double) 100*a4/n; //Rate of answer 4
			double p5 = (double) 100*a5/n; //Rate of answer 5
			System.out.printf("The rate of answer 1 is: %.2f%%" + p1 + ".\n");
			System.out.printf("The rate of answer 2 is: %.2f%%" + p2 + ".\n");
			System.out.printf("The rate of answer 3 is: %.2f%%" + p3 + ".\n");
			System.out.printf("The rate of answer 4 is: %.2f%%" + p4 + ".\n");
			System.out.printf("The rate of answer 5 is: %.2f%%" + p5 + ".\n");
		} else { //No questionnaires done by any Customer.
			System.out.println("No questionnaires have been done yet.");
		}
	}
}
