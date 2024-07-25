package weekFive;

public class Bank {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		
		customer1.setName("James");
		customer1.setAccountNo(123);
		customer1.setBalance(1000.00);
		
		System.out.println(customer1.toString());
		
		Customer customer2 = new Customer("Kate", 345, 2000.00);
		
		System.out.println(customer2.toString());
		
		customer2.setAccountNo(348);
		customer2.setBalance(2500.00);
		customer2.setName("Katy");
		
		System.out.println(customer2.toString());
		
		System.out.println(Customer.count);
		
		

	}

}
