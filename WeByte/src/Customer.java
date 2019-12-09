/**
 * Customer
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Containing everything that's necessary for a Customer.
 * There is the customer's menu with the questionnaire the customer is called to answer.
*/

public class Customer extends User {
	/**
	 * Every Customer is a User so there is an ArrayList to collect every single one of them to get further information and possibilities.
	 */
	
	private String tel;
	
	public static ArrayList <Customer> customers = new ArrayList <Customer>();
	public static ArrayList <Customer> LoyalCustomers = new ArrayList <Customer>();
	public static ArrayList <Customer> LossCustomers = new ArrayList <Customer>();
	
	public Customer(String name, String tel, String email) {
		super(name,email);
		this.tel = tel;
		customers.add(this);
	}

	public String getTel() {
		return tel;
	}
	
	/** Method that checks if the user is a valid customer, 
	 * if there is his name and telephone number in our customer list*/
	public static Customer exists(String name,String tel) {
		Customer c = null;
		for (Customer rc:Customer.customers) {
			if ((rc.getName().equals(name)) && (rc.getTel().equals(tel))) {
				c = rc;
			}
		}
		return c; //if the customer does not exists, it returns null	
	}
	
	/** Log-in method for the Customers.*/
	public static void login() {
		Scanner input = new Scanner(System.in);
		
		boolean b = true;
		while (b) {
			System.out.println("Please insert your name.");
			String name = input.nextLine();
			if (name.equals("")) {
				WeByte.getStartingMenu();
			}
			System.out.println("Please insert your phone number.");
			String num = input.next();
			if (num.equals("")) {
				WeByte.getStartingMenu();
			}
			if (exists(name,num) !=  null) {
				Customer c = exists(name,num);
				Questionnaire.getQ(c);
				b = false;
			} else {
				System.out.println("You gave invalid name or phone number. Please try again.");
			}
		}
	}

	@Override
	public String toString() {
		return "Customer [name= " + this.getName() + " email= " + this.getEmail() + " tel= " + tel + "]";
	}

}
