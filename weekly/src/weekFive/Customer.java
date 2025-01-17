package weekFive;

public class Customer {
	int accountNo;
	double balance;
	String name;
	public static int count;
	
	public Customer() {
		count++;
	}
	
	
	public Customer(String name, int accountNo, double balance) {
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
		count++;
	}


	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public static int getCount() {
		return count;
	}


	@Override
	public String toString() {
		return "Customer [accountNo=" + accountNo + ", balance=" + balance + ", name=" + name + "]";
	}
	
	

}
