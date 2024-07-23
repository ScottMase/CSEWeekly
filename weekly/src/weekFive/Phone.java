package weekFive;

public class Phone {
	
	private String phoneNumber;
	private String ownersName;
	private double price;
	
	public Phone(String num, String name, double pri) {
		phoneNumber = num;
		ownersName = name;
		price = pri;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getOwnersName() {
		return ownersName;
	}
	public double getPrice() {
		return price;
	}
	
	public void setPhoneNumber(String num) {
		phoneNumber = num;
	}
	public void setOwnersName(String name) {
		ownersName = name;
	}
	public void setPrice(double pri) {
		price = pri;
	}
	



}
