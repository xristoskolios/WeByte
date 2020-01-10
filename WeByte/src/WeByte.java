/**
 * WeByte
*/

import java.util.Scanner;

/**
 * It contains the main and 2 other methods.
 * One to load some objects of class Manager & Customer that extends class User and a method to show and begin the Starting menu.
 */

public class WeByte {

	public static void main(String[] args) {
		loadObjects();
		getStartingMenu();
	}
	
	/** Loading the objects of class Manager,Customer */
	public static void loadObjects() {
		/** Generating objects of the class Manager */
		Manager m1 = new Manager("nikos papadopoulos", "nikos@gmail.gr", "123");
		Manager m2 = new Manager("makis papadopoulos", "makis@gmail.gr", "456");
		Manager m3 = new Manager("xristos dimakis", "xristos@gmail.gr", "789");
		Manager m4 = new Manager("maria iliou", "maria@gmail.gr", "000");
		Manager m5 = new Manager("m","m","m"); //Test manager
				
		/** Generating  objects of the class Customer */
		Customer c1 = new Customer("ioannis dimou", "6900000000", "ioannisd@gmail.gr");
		Customer c2 = new Customer("ioannis papaioannou", "6911111111", "ioannisp@gmail.gr");
		Customer c3 = new Customer("markela agtzidi", "6922222222", "markela@gmail.gr");
		Customer c4 = new Customer("maria papa", "693333333", "maria@gmail.gr");
		Customer c5 = new Customer("ioanna syrou", "6944444444", "ioanna@gmail.gr");
		Customer c6 = new Customer("giorgos papas", "6955555555", "giorgos@gmail.gr");
		Customer c7 = new Customer("nikolas nikolaou", "6966666666", "nikolas@gmail.gr");
		Customer c8 = new Customer("konstantinos nikolaou", "6977777777", "konstantinos@gmail.gr");
		Customer c9 = new Customer("viky papadimitriou", "6988888888", "vicky@gmail.gr");
		Customer c10 = new Customer("aris xatzis", "6999999999", "aris@gmail.gr");
		Customer c11 = new Customer("c", "1", "c"); //Test Object.
	}
	
	/** Showing the starting menu. */
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
