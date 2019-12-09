import java.util.Scanner;
import java.util.ArrayList;

public class QsDone {
	
	private int ans1 = 0;
	private int ans2 = 0;
	private int ans3 = 0;
	private int ans4 = 0;
	private int ans5 = 0;
	private int ans6 = 0;
	private int ans7 = 0;
	private int ans8 = 0;
	private int ans9 = 0;
	private int ans10 = 0;
	
	private static int n = 0; //Number of customers 
	
	public QsDone(int ans1, int ans2, int ans3, int ans4, int ans5, int ans6, int ans7, int ans8, int ans9, int ans10) {
		this.ans1 = ans1;
		this.ans2 = ans2;
		this.ans3 = ans3;
		this.ans4 = ans4;
		this.ans5 = ans5;
		this.ans6 = ans6;
		this.ans7 = ans7;
		this.ans8 = ans8;
		this.ans9 = ans9;
		this.ans10 = ans10;
		n += 1;
		super();
	}
	
	Scanner sc = new Scanner(System.in);
	
	public static ArrayList <QsDone> CustomersQ = new ArrayList <QsDone>();
	
	
	do { // Checking the case of REDO
	
		//Q1 
		boolean m = false;
		m = false;
		do {
			try {
				do {
					System.out.println("For how long have you been a subscriber. Type 1 for "
							+ "LESS THAN ONE YEAR, 2 for ONE TO THREE YEARS or 3 for "
							+ "MORE THAN THREE YEARS.\n");
					ans1 = sc.nextInt();
					if (!(ans1 == 1 || ans1 == 2)) {
						System.err.println("Wrong input. Please insert one of the choices.");
					}
				} while (ans1 == 1 || ans1 == 2);
				m = true;
			} catch (InputMismatchException e){
				System.err.println("Please type an integer.\nTry again.");
				sc.nextLine(); //Clearing the scanner if Manager gives string instead of int.
			}
		} while (m == false);