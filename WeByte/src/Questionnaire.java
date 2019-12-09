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