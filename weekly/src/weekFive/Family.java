package weekFive;

public class Family {

	public static void main(String[] args) {
		Person person1 = new Person(22, "John", "Dublin");
		Person person2 = new Person(25, "Ann", "Galway");
		
		
		System.out.println("Details for John");
		System.out.println(person1.getAge());
		System.out.println(person1.getName());
		System.out.println(person1.getAddress());
		
		System.out.println("Details for Ann");
		System.out.println(person2.getAge());
		System.out.println(person2.getName());
		System.out.println(person2.getAddress());
		
		System.out.println(Person.counter);
		
		person1.setName("Jack");
		person1.setAddress("Cork");
		person1.setAge(23);
		
		System.out.println("Updated details for John");
		System.out.println(person1.getAge());
		System.out.println(person1.getName());
		System.out.println(person1.getAddress());
		
		
		
		

	}

}
