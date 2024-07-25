package weekFive;

public class BusDepot {

	public static void main(String[] args) {
		Driver driver1 = new Driver();
		
		driver1.setName("John");
		driver1.setPhoneNumber(110);
		
		Bus bus1 = new Bus();
		
		bus1.setMake("Volvo");
		bus1.setDriver(driver1);
		bus1.setNumberOfSeats(45);
		
		System.out.println(bus1.toString());
		
		Bus bus2 = new Bus();
		
		bus2.setMake("Mercedes");
		bus2.setNumberOfSeats(50);

		System.out.println(bus2.toString());
		
		Driver driver2 =new Driver("Tom", 999);
		
		Bus bus3 = new Bus();
		
		bus3.setDriver(driver2);
		bus3.setMake("Ford");
		bus3.setNumberOfSeats(20);
		
		System.out.println(bus3.toString());
		
	}

}
