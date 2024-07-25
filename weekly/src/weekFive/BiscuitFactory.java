package weekFive;

public class BiscuitFactory {

	public static void main(String[] args) {
		Biscuit biscuit1 = new Biscuit();
		
		biscuit1.setBrand("Kimberly");
		biscuit1.setMaker("Jacobs");
		biscuit1.setWeight(15);
		
		System.out.println(biscuit1.toString());
		
		Biscuit biscuit2 = new Biscuit("McVities", "Digestive",20);
		
		System.out.println(biscuit2.toString());
		
		biscuit2.setBrand("Wholewheat");
		biscuit2.setMaker("Cadburys");
		biscuit2.setWeight(25);
		
		System.out.println(biscuit2.toString());
		
		System.out.println(Biscuit.getNumOfBiscuits);
		
	}

}
