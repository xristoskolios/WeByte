/**
 * Questionnaire
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Questionnaire {
	
	private int q1 = 0;
	private int q2 = 0;
	private int q3 = 0;
	private int q4 = 0;
	private int q5 = 0;
	private int q6 = 0;
	private int q7 = 0;
	private int q8 = 0;
	private int q9 = 0;
	private int q10 = 0;
	
	public static int n = 0; //Number of Questionnaires 
	
	public static ArrayList <Questionnaire> Qs = new ArrayList <Questionnaire>();
	
	public Questionnaire(int ans1, int ans2, int ans3, int ans4, int ans5, int ans6, int ans7, int ans8, int ans9, int ans10) {
		this.q1 = ans1;
		this.q2 = ans2;
		this.q3 = ans3;
		this.q4 = ans4;
		this.q5 = ans5;
		this.q6 = ans6;
		this.q7 = ans7;
		this.q8 = ans8;
		this.q9 = ans9;
		this.q10 = ans10;
		n++;
		Qs.add(this);
	}
	
	public int getQ1() {
		return q1;
	}

	public int getQ2() {
		return q2;
	}

	public int getQ3() {
		return q3;
	}

	public int getQ4() {
		return q4;
	}

	public int getQ5() {
		return q5;
	}

	public int getQ6() {
		return q6;
	}
	
	public int getQ7() {
		return q7;
	}

	public int getQ8() {
		return q8;
	}

	public int getQ9() {
		return q9;
	}

	public int getQ10() {
		return q10;
	}

	public void setQ10(int q10) {
		this.q10 = q10;
	}
	
	/** Method that contains the questionnaire */
	public static void getQ(Customer c) {
		Scanner sc = new Scanner(System.in);
		boolean m = false;
		int ans1 = 0, ans2 = 0, ans3 = 0, ans4 = 0, ans5 = 0, ans6 = 0, ans7 = 0, ans8 = 0, ans9 = 0, ans10 = 0;
		do { // Checking the case of REDO
			//Q1
			do {
				try {
					do {
						System.out.println("For how long have you been a subscriber. Type 1 for "
								+ "LESS THAN ONE YEAR, 2 for ONE TO THREE YEARS or 3 for "
								+ "MORE THAN THREE YEARS.\n");
						ans1 = sc.nextInt();
						if (!(ans1 == 1 || ans1 == 2 || ans1 == 3)) {
							System.err.println("Wrong input. Please insert one of the choices.\n");
						}
					} while (!(ans1 == 1 || ans1 == 2 || ans1 == 3));
					m = true;
				} catch (InputMismatchException e){
					System.err.println("Please type an integer.\nTry again.");
					sc.nextLine(); //Clearing the scanner if Manager gives string instead of int.
				}
			} while (m == false);
			//Q2
			m = false;
			do {
				try {
					do {
						System.out.println("How satisfied are you with your mobile service from 1 to 5 "
								+ "with 1 being not satisfied at all and 5 being fully satisfied.\n");
						ans2 = sc.nextInt();
						if (!(ans2 == 1 || ans2 == 2 || ans2 == 3 || ans2 == 4 || ans2 == 5)) {
							System.err.println("Wrong input. Please insert one of the choices.\n");
						}
					} while (!(ans2 == 1 || ans2 == 2 || ans2 == 3 || ans2 == 4 || ans2 == 5));
					m = true;
				} catch (InputMismatchException e){
					System.err.println("Please type an integer.\nTry again.");
					sc.nextLine(); //Clearing the scanner if Customer gives string instead of int.
				}
			} while (m == false);
			//Q3
			m = false;
			do {
				try {
					do {
						System.out.println("How satisfied are you with your landline service from 1 "
								+ "to 5 with 1 being not satisfied at all and 5 being fully satisfied.\n");
						ans3 = sc.nextInt();
						if (!(ans3 == 1 || ans3 == 2 || ans3 == 3 || ans3 == 4 || ans3 == 5)) {
							System.err.println("Wrong input. Please insert one of the choices.");
						}
					} while (!(ans3 == 1 || ans3 == 2 || ans3 == 3 || ans3 == 4 || ans3 == 5));
					m = true;
				} catch (InputMismatchException e){
					System.err.println("Please type an integer.\nTry again.");
					sc.nextLine(); //Clearing the scanner if Customer gives string instead of int.
				}
			} while (m == false);
			//Q4
			m = false;
			do {
				try {
					do {
						System.out.println("How satisfied are you with your internet service from 1 "
								+ "to 5 with 1 being not satisfied at all and 5 being fully satisfied.\n");
						ans4 = sc.nextInt();
						if (!(ans4 == 1 || ans4 == 2 || ans4 == 3 || ans4 == 4 || ans4 == 5)) {
							System.err.println("Wrong input. Please insert one of the choices.");
						}
					} while (!(ans4 == 1 || ans4 == 2 || ans4 == 3 || ans4 == 4 || ans4 == 5));
					m = true;
				} catch (InputMismatchException e){
					System.err.println("Please type an integer.\nTry again.");
					sc.nextLine(); //Clearing the scanner if Customer gives string instead of int.
				}
			} while (m == false);
			//Q5
			m = false;
			do {
				try {
					do {
						System.out.println("How satisfied are you with your cable TV service from 1 "
								+ "to 5 with 1 being not satisfied at all and 5 being fully satisfied.\n");
						ans5 = sc.nextInt();
						if (!(ans5 == 1 || ans5 == 2 || ans5 == 3 || ans5 == 4 || ans5 == 5)) {
							System.err.println("Wrong input. Please insert one of the choices.\n");
						}
					} while (!(ans5 == 1 || ans5 == 2 || ans5 == 3 || ans5 == 4 || ans5 == 5));
					m = true;
				} catch (InputMismatchException e){
					System.err.println("Please type an integer.\nTry again.");
					sc.nextLine(); //Clearing the scanner if Customer gives string instead of int.
				}
			} while (m == false);
			//Q6
			m = false;
			do {
				try {
					do {
						System.out.println("How satisfied are you with your customer service from 1 "
								+ "to 5 with 1 being not satisfied at all and 5 being fully satisfied.\n");
						ans6 = sc.nextInt();
						if (!(ans6 == 1 || ans6 == 2 || ans6 == 3 || ans6 == 4 || ans6 == 5)) {
							System.err.println("Wrong input. Please insert one of the choices.\n");
						}
					} while (!(ans6 == 1 || ans6 == 2 || ans6 == 3 || ans6 == 4 || ans6 == 5));
					m = true;
				} catch (InputMismatchException e){
					System.err.println("Please type an integer.\nTry again.");
					sc.nextLine(); //Clearing the scanner if Customer gives string instead of int.
				}
			} while (m == false);
			//Q7
			m = false;
			do {
				try {
					do {
						System.out.println("Does the price correspond with the value of the services? "
								+ "Type 1 for YES or 2 for NO.\n");
						ans7 = sc.nextInt();
						if (!(ans7 == 1 || ans7 == 2)) {
							System.err.println("Wrong input. Please insert one of the choices.\n");
						}
					} while (!(ans7 == 1 || ans7 == 2));
					m = true;
				} catch (InputMismatchException e){
					System.err.println("Please type an integer.\nTry again.");
					sc.nextLine(); //Clearing the scanner if Customer gives string instead of int.
				}
			} while (m == false);
			//Q8
			m = false;
			do {
				try {
					do {
						System.out.println("Would you recommend our services to other people? "
								+ "Type 1 for YES or 2 for NO.\n");
						ans8 = sc.nextInt();
						if (!(ans8 == 1 || ans8 == 2)) {
							System.err.println("Wrong input. Please insert one of the choices.\n");
						}
					} while (!(ans8 == 1 || ans8 == 2));
					m = true;
				} catch (InputMismatchException e){
					System.err.println("Please type an integer.\nTry again.");
					sc.nextLine(); //Clearing the scanner if Customer gives string instead of int.
				}
			} while (m == false);
			//Q9
			m = false;
			do {
				try {
					do {
						System.out.println("Are you satisfied with our questionnaire? "
								+ "Type 1 for YES or 2 for NO.\n");
						ans9 = sc.nextInt();
						if (!(ans9 == 1 || ans9 == 2)) {
							System.err.println("Wrong input. Please insert one of the choices.\n");
						}
					} while (!(ans9 == 1 || ans9 == 2));
					m = true;
				} catch (InputMismatchException e){
					System.err.println("Please type an integer.\nTry again.");
					sc.nextLine(); //Clearing the scanner if Customer gives string instead of int.
				}
			} while (m == false);
			//Q10
			m = false;
			do {
				try {
					do {
						System.out.println("Would you like to submit your answers? Type 1 for SUBMIT,"
								+ " 2 for REDO or 3 for CANCEL.\n");
						ans10 = sc.nextInt();
						if (!(ans10 == 1 || ans10 == 2 || ans10 == 3)) {
							System.err.println("Wrong input. Please insert one of the choices.\n");
						}
					} while (!(ans10 == 1 || ans10 == 2 || ans10 == 3));
					m = true;
				} catch (InputMismatchException e){
					System.err.println("Please type an integer.\nTry again.");
					sc.nextLine(); //Clearing the scanner if Customer gives string instead of int.
				}
			} while (m == false);
		} while (ans10 == 2);
		if (ans10 == 1) { //if the customer submits the answers 
			if (ans1 == 3) {
				Customer.LoyalCustomers.add(c); 
			}
			if (ans2 < 3 && ans3 < 3 && ans4 < 3 && ans5 < 3 && ans6 < 3) {
				Customer.LossCustomers.add(c); 
				//the customer is not satisfied with all of the services
			}
			Questionnaire q = new Questionnaire(ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9, ans10);
			WeByte.getStartingMenu();
		} else { //ans10 == 3
			WeByte.getStartingMenu();
		}
		sc.close();
	}
}
	