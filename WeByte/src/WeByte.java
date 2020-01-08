
/**
 * WeByte
*/
import java.util.Scanner;

/**
 * It contains the main plus 2 methods one to load some objects of class Manager & Customer that have super class User and a method to show and begin the Starting menu.
 * @author eskountis
 */
public class WeByte {

	public static void main(String[] args) {
		loadObjects();
		getStartingMenu();
	}
	//** Loading the objects of class Manager,Customer
	public static void loadObjects() {
		/* Generating objects of the class Manager */
		Manager m1 = new Manager("Nikos papadopoulos", "nikos@gmail.gr", "aqwesd7");
		Manager m2 = new Manager("makis papadopoulos", "makis@gmail.gr", "wasd7");
		Manager m3 = new Manager("xristos dimakis", "xristos@gmail.gr", "rtyhgf8");
		Manager m4 = new Manager("t", "t", "t");//Test Object
		/* Generating  objects of the class Customer */
		Customer c1 = new Customer("ioannis dimou", "6914725836", "ioannisd@gmail.gr");
		Customer c2 = new Customer("ioannis papaioannou", "6978725836", "ioannisp@gmail.gr");
		Customer c3 = new Customer("markela agtzidi", "6935625836", "markela@gmail.gr");
		Customer c4 = new Customer("maria papa", "6985425836", "maria@gmail.gr");
		Customer c5 = new Customer("ioanna syrou", "6914725786", "ioanna@gmail.gr");
		Customer c6 = new Customer("giorgos papas", "6978725676", "giorgos@gmail.gr");
		Customer c7 = new Customer("nikolas nikolaou", "6935625326", "nikolas@gmail.gr");
		Customer c8 = new Customer("konstantinos nikolaou", "6985425850", "konstantinos@gmail.gr");
		Customer c9 = new Customer("viky papadimitriou", "6933775326", "vicky@gmail.gr");
		Customer c10 = new Customer("aris xatzis", "6985425850", "aris@gmail.gr");
		Customer c11 = new Customer("c", "1", "c");//Test Object.
	}
	//** Showing the starting menu.
	public static void getStartingMenu() {
		Scanner sc = new Scanner(System.in);
		boolean s = true;
		int ans = -1;
		do {
			System.out.println("~~~Menu~~~\nPress 1 to login as Customer.\nPress 2 to login as Manager.\nYou can press enter on login menu Customer/Manager to leave.");
			try {
				do {
					ans = sc.nextInt();
					if (ans < 1 || ans > 2) {
						System.out.println("Please press one of the options.Please try again.");
					}
				} while (ans < 1 || ans > 2);
				s = false;
			} catch (Exception e) {
			System.err.println("Invalid input, type a number.Please try again.\n");
			sc.nextLine();
			}
		} while (s);
		if (ans == 1) {
			Customer.login();
		} else {
			Manager.login();
		}
	}
}
