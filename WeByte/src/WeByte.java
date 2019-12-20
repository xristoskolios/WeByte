
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
		//FIXME
		getStartingMenu();
	}
	//** Loading the objects of class Manager,Customer and User which is the superclass.
	public static void loadObjects() {
		//FIXME
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
		sc.close();
	}
}
