import java.util.ArrayList;
import java.util.Scanner;

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
	
	public static boolean login(String name,String tel) {
		boolean b = false;
		String i=" ";
		for (Customer rc:Customer.customers) {
			if ((rc.getName().equals(name)) && (rc.getTel().equals(tel))) {
				i = rc.getTel(); 
			}
		}
		if (i!="") {
			b = true;
		}
		return b;
		
	}
	
	public static void getMenu() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome!\nPlease insert your name.");
		String name = input.nextLine();
		System.out.println("Please insert your phone number.");
		String num = input.next();
		boolean b = true;
		while (b) {
			if (login(name,num) == true) {
				//emfanizetai erotimatologio
				b = false;
			} else {
				System.out.println("You gave invalid name or phone number. Please try again.");
				System.out.println("Please insert your name.");
				name = input.nextLine();
				System.out.println("Please insert your phone number.");
				num = input.next();
			}
		}
	}

}
