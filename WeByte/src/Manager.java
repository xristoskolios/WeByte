/**
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
	/**
	 * Every Manager is a User so there is an ArrayList to collect every single one of them 
	 * to get further information and possibilities.
	 */
	
	public static ArrayList <Manager> managers = new ArrayList <Manager>();
	
	private String password; //manager's password to log in 
	
	public Manager(String name, String email, String password) {
		super(name, email);
		this.password = password;
		managers.add(this);
	}

	/** Getter for access to the object's fields.*/
	public String getPassword() {
		return password;
	}
	
	/** Method toString so we can see the object of the class Manager.*/
	public String toString() {
		return "Manager [name= " + this.getName() 
		+ " email= " + this.getEmail() 
		+ " pw= " + this.getPassword() + "]";
	}
	
	/** Showing the menu and also getting answer from the user-manager to calculate
	 * some of the given choices for statistic reasons.
	 */
	public static void getMenu(Manager m) {
		Scanner sc = new Scanner(System.in);
		int ans;	//Managers's given answer from the keyboard using class Scanner.
		boolean b;
		while (true) {
			ans = -1;
			System.out.println("Welcome, Mr/Ms." + m.getName() + "\n"
					+ "Please insert 1 for loyal customers.\n"
					+ "Please insert 2 for customers who are most likely to be lost.\n"
					+ "Please insert 3 for the Quality of Mobile Services.\n"
					+ "Please insert 4 for the Quality of Landline Services.\n"
					+ "Please insert 5 for the Quality of the Internet.\n"
					+ "Please insert 6 for the Quality of the Satellite TV.\n"
					+ "Please insert 7 for the Quality of Customer Service.\n"
					+ "Please insert 8 for Questionnaire evaluation.\n"
					+ "Please insert 0 to get back to the Starting Menu");
			b = false;
			do {
				try {
					do {
						ans = sc.nextInt();
						if (!(ans >= 0 && ans <= 8)) {
							System.err.println("Wrong input.Please insert one of the choices.");
						}
					} while (!(ans >= 0 && ans <= 8));
					b = true;
				} catch (InputMismatchException e) {
					System.err.println("Please type an integer.\nTry again.");
					sc.nextLine(); //Clearing the scanner if Manager gives String instead of int.
				}
			} while (b == false);
			if (ans == 1) {
				getLoyalQResults();
			} else if (ans == 2) {
				getLossQResults();
			} else if (ans == 3) {
				getMobileQResults();
			} else if (ans == 4) {
				getLandlineQResults();
			} else if (ans == 5) {
				getInternetQResults();
			} else if (ans == 6) {
				getSateliteTVQResults();
			} else if (ans == 7) {
				getCustomerQResults();
			} else if (ans == 8) {
				getEvaluationQResults();
			} else {//ans == 0
				WeByte.getStartingMenu();
			}
		}
	}

	/** Log-in method for the Managers.*/
	public static void login() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("~~~LOGIN AS MANAGER~~~");
			System.out.println("Please insert your email.");
			String em = sc.nextLine();
			if (em.equals("")) {
				WeByte.getStartingMenu();
			}
			System.out.println("Please insert your password.");
			String pw = sc.nextLine();
			if (pw.equals("")) {
				WeByte.getStartingMenu();
			}
			for (Manager i: managers) {
				if (em.equals(i.getEmail()) && pw.equals(i.getPassword())) {
					System.out.println("Log in done successfully.\nWelcome, Mr/Ms." + i.getName() + "\n");
					getMenu(i);
				}
			}
			System.out.println("Wrong email or/and password.Please try again.\n");
		}
	}

	/** Method to print the loyal customers*/
		public static void getLoyalQResults() {
			if (Customer.LoyalCustomers.size() == 0) {
				System.out.println("No loyal Customers found.");
			} else {
				System.out.println("---The Loyal Customers---");
				for(int i = 0; i < Customer.LoyalCustomers.size(); i++) {
					System.out.println(Customer.LoyalCustomers.get(i).toString()); 		
				}
			}
		}
	/** Method to print the customers who are most likely to be lost*/
		public static void getLossQResults() {
			if (Customer.LossCustomers.size() == 0) {
				System.out.println("No loss Customers found.");
			} else {
				System.out.println("---The Lost Customers---");
				for(int i = 0; i < Customer.LossCustomers.size(); i++) {
					System.out.println(Customer.LossCustomers.get(i).toString()); 		
				}
			}
		}
	/** Method to calculate the Quality of Mobile Services from answer sheet(ArrayList) from Questionnaire's field q2.*/
	public static void getMobileQResults() {
		System.out.println("---The Quality of Mobile Services---");
		int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0; //ANSWERS 1,2,3,4,5 FROM QUESTION 2 OF THE QUESTIONNAIRE
		for (Questionnaire k: Questionnaire.Qs) {
			if (k.getQ2() == 1) {
				a1++;
			} else if (k.getQ2() == 2) {
				a2++;
			} else if (k.getQ2() == 3) {
				a3++;
			} else if (k.getQ2() == 4) {
				a4++;
			} else { // k.q2 == 5
				a5++;
			}
		}
		int n = Questionnaire.n; //Number of questionnaires done.
		//Otherwise int n = Questionnaire.Qs.length();
		if (n > 0) {
			double p1 = (double) 100 * a1 / n; //Rate of answer 1
			double p2 = (double) 100 * a2 / n; //Rate of answer 2
			double p3 = (double) 100 * a3 / n; //Rate of answer 3
			double p4 = (double) 100 * a4 / n; //Rate of answer 4
			double p5 = (double) 100 * a5 / n; //Rate of answer 5
		System.out.printf("The rate of asnwer 1 is: %.2f%%.\n",p1);
		System.out.printf("The rate of asnwer 2 is: %.2f%%.\n",p2);
		System.out.printf("The rate of asnwer 3 is: %.2f%%.\n",p3);
		System.out.printf("The rate of asnwer 4 is: %.2f%%.\n",p4);
		System.out.printf("The rate of asnwer 5 is: %.2f%%.\n",p5);
		} else { //No questionnaires done by any Customer.
			System.out.println("No questionnaires have been done yet.");
		}
	}
	
    public static void getLandlineQResults() {
    	System.out.println("---The Quality of Landline Services---");
		int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0; //ANSWERS 1,2,3,4,5 FROM QUESTION 2 OF THE QUESTIONNAIRE
		for (Questionnaire k: Questionnaire.Qs) {
			if (k.getQ3() == 1) {
				a1++;
			} else if (k.getQ3() == 2) {
				a2++;
			} else if (k.getQ3() == 3) {
				a3++;
			} else if (k.getQ3() == 4) {
				a4++;
			} else { // k.q3 == 5
				a5++;
			}
		}
		int n = Questionnaire.n; //Number of questionnaires done.
		//Otherwise int n = Questionnaire.Qs.length();
		if (n > 0) {
			double p1 = (double) 100 * a1 / n; //Rate of answer 1
			double p2 = (double) 100 * a2 / n; //Rate of answer 2
			double p3 = (double) 100 * a3 / n; //Rate of answer 3
			double p4 = (double) 100 * a4 / n; //Rate of answer 4
			double p5 = (double) 100 * a5 / n; //Rate of answer 5
		System.out.printf("The rate of asnwer 1 is: %.2f%%.\n",p1);
		System.out.printf("The rate of asnwer 2 is: %.2f%%.\n",p2);
		System.out.printf("The rate of asnwer 3 is: %.2f%%.\n",p3);
		System.out.printf("The rate of asnwer 4 is: %.2f%%.\n",p4);
		System.out.printf("The rate of asnwer 5 is: %.2f%%.\n",p5);
		} else { //No questionnaires done by any Customer.
			System.out.println("No questionnaires have been done yet.");
		}
	}

	/** Method to calculate the Quality of the Internet from answer sheet(ArrayList) from Questionnaire's field q3.*/
	public static void getInternetQResults() {
		System.out.println("---The Quality of the Internet---");
		int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0; //ANSWERS 1,2,3,4,5 FROM QUESTION 3 OF THE QUESTIONNAIRE
		for (Questionnaire k: Questionnaire.Qs) {
			if (k.getQ4() == 1) {
				a1++;
			} else if (k.getQ4() == 2) {
				a2++;
			} else if (k.getQ4() == 3) {
				a3++;
			} else if (k.getQ4() == 4) {
				a4++;
			} else { // k.q4 == 5, definitely q3 must be either 1 either 2 either 3 either 4 either 5.
				a5++;
			}
		}
		int n = Questionnaire.n; //Number of questionnaires done.
		if (n  >0) {
			double p1 = (double) 100 * a1 / n; //Rate of answer 1
			double p2 = (double) 100 * a2 / n; //Rate of answer 2
			double p3 = (double) 100 * a3 / n; //Rate of answer 3
			double p4 = (double) 100 * a4 / n; //Rate of answer 4
			double p5 = (double) 100 * a5 / n; //Rate of answer 5
			System.out.printf("The rate of asnwer 1 is: %.2f%%.\n",p1);
			System.out.printf("The rate of asnwer 2 is: %.2f%%.\n",p2);
			System.out.printf("The rate of asnwer 3 is: %.2f%%.\n",p3);
			System.out.printf("The rate of asnwer 4 is: %.2f%%.\n",p4);
			System.out.printf("The rate of asnwer 5 is: %.2f%%.\n",p5);
		} else { //No questionnaires done by any Customer.
			System.out.println("No questionnaires have been done yet.");
		}
	}

	/** Method to calculate the Quality of the Satellite TV from answer sheet(ArrayList) from Questionnaire's field q4.*/
	public static void getSateliteTVQResults() {
		System.out.println("---The Quality of the Satellite TV---");
		int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0; //ANSWERS 1,2,3,4,5 FROM QUESTION 4 OF THE QUESTIONNAIRE
		for (Questionnaire k: Questionnaire.Qs) {
			if (k.getQ5() == 1) {
				a1++;
			} else if (k.getQ5() == 2) {
				a2++;
			} else if (k.getQ5() == 3) {
				a3++;
			} else if (k.getQ5() == 4) {
				a4++;
			} else { // k.q5 == 5, definitely q4 must be either 1 either 2 either 3 either 4 either 5.
				a5++;
			}
		}
		int n = Questionnaire.n; //Number of Questionnaires done.
		if (n > 0) {
			double p1 = (double) 100 * a1 / n; //Rate of answer 1
			double p2 = (double) 100 * a2 / n; //Rate of answer 2
			double p3 = (double) 100 * a3 / n; //Rate of answer 3
			double p4 = (double) 100 * a4 / n; //Rate of answer 4
			double p5 = (double) 100 * a5 / n; //Rate of answer 5
			System.out.printf("The rate of asnwer 1 is: %.2f%%.\n",p1);
			System.out.printf("The rate of asnwer 2 is: %.2f%%.\n",p2);
			System.out.printf("The rate of asnwer 3 is: %.2f%%.\n",p3);
			System.out.printf("The rate of asnwer 4 is: %.2f%%.\n",p4);
			System.out.printf("The rate of asnwer 5 is: %.2f%%.\n",p5);
		} else { //No questionnaires done by any Customer.
			System.out.println("No questionnaires have been done yet.");
		}
	}
	//** Method to calculate the Quality of Customer Service from answer sheet(ArrayList) from Questionnaire's field q6.*/
	public static void getCustomerQResults() {
		System.out.println("---The Quality of Customer Service---");
		int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0; //ANSWERS 1,2,3,4,5 FROM QUESTION 6 OF THE QUESTIONNAIRE
		for (Questionnaire k: Questionnaire.Qs) {
			if (k.getQ6() == 1) {
				a1++;
			} else if (k.getQ6() == 2) {
				a2++;
			} else if (k.getQ6() == 3) {
				a3++;
			} else if (k.getQ6() == 4) {
				a4++;
			} else { // k.q6 == 5, definetely q6 must be either 1 either 2 either 3 either 4 either 5.
				a5++;
			}
		}
		int n = Questionnaire.n; //Number of questionnaires done.
		//Otherwise int n = Questionnaire.Qs.length;
		if (n>0) {
			double p1 = (double) 100 * a1 / n; //Rate of answer 1
			double p2 = (double) 100 * a2 / n; //Rate of answer 2
			double p3 = (double) 100 * a3 / n; //Rate of answer 3
			double p4 = (double) 100 * a4 / n; //Rate of answer 4
			double p5 = (double) 100 * a5 / n; //Rate of answer 5
			System.out.printf("The rate of asnwer 1 is: %.2f%%.\n",p1);
			System.out.printf("The rate of asnwer 2 is: %.2f%%.\n",p2);
			System.out.printf("The rate of asnwer 3 is: %.2f%%.\n",p3);
			System.out.printf("The rate of asnwer 4 is: %.2f%%.\n",p4);
			System.out.printf("The rate of asnwer 5 is: %.2f%%.\n",p5);
		} else { //No questionnaires done by any Customer.
			System.out.println("No questionnaires have been done yet.");
		}
	}
	//** Method to calculate the Questionnaire Evaluation Service from answer sheet(ArrayList) from Questionnaire's field q9.*/
	public static void getEvaluationQResults() {
		System.out.println("---The Questionnaire Evaluation---");
		int a1 = 0, a2 = 0; //ANSWERS 1,2 FROM QUESTION 9 OF THE QUESTIONNAIRE
		for (Questionnaire k: Questionnaire.Qs) {
			if (k.getQ9() == 1) {
				a1++;
			} else if (k.getQ9() == 2) {
				a2++;
			}
		}
		int n = Questionnaire.n; //Number of questionnaires done.
		//Otherwise int n = Questionnaire.Qs.length;
		if (n>0) {
			double p1 = (double) 100 * a1 / n; //Rate of answer 1
			double p2 = (double) 100 * a2 / n; //Rate of answer 2
		System.out.printf("The rate of asnwer 1 is: %.2f%%.\n",p1);
		System.out.printf("The rate of asnwer 2 is: %.2f%%.\n",p2);
		} else { //No questionnaires done by any Customer.
			System.out.println("No questionnaires have been done yet.");
		}
	}
}
