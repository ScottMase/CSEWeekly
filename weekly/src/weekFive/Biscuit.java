package weekFive;

public class Biscuit {
	public static int getNumOfBiscuits;
	private int weight;
	private String brand, maker;

	public Biscuit() {
		getNumOfBiscuits++;
	}
	
	public Biscuit(String brand,String maker, int weight) {
		this.brand =brand;
		this.maker = maker;
		this.weight = weight;
		getNumOfBiscuits++;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public int getNumberOfBiscuits() {
		return getNumOfBiscuits;
	}
	
	public boolean isOutOfDate() {
		return false;
	}

	@Override
	public String toString() {
		return "Biscuit [weight=" + weight + ", brand=" + brand + ", maker=" + maker + "]";
	}
	
	
	
	
}
