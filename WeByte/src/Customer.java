import java.util.ArrayList;
import java.util.Scanner;

/* Customer*/

public class Customer extends User {
	
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
	
	public static Customer exists(String name,String tel) {
		Customer c = null;
		for (Customer rc:Customer.customers) {
			if ((rc.getName().equals(name)) && (rc.getTel().equals(tel))) {
				c = rc;
			}
		}
		return c;
		
	}
	
	public static void login() {
		Scanner input = new Scanner(System.in);
		
		boolean b = true;
		while (b) {
			System.out.println("Please insert your name.");
			String name = input.nextLine();
			if (name == "\n") {
				Webyte.startingMenu();
			}
			System.out.println("Please insert your phone number.");
			String num = input.next();
			if (num == "\n" ) {
				Webyte.startingMenu();
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
		return "Customer [name= " + getName() + " email= " + getEmail() + " tel= " + tel + "]";
	}

}
