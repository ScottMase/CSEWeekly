package weekFive;

public class Person {
	private int age, count;
	private String name, address;
	public static int counter;
	
	public Person(int age, String name, String address) {
		this.age = age;
		this.name = name;
		this.address = address;
		counter++;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCount() {
		return count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	



}
