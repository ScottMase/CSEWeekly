
public class ShippingCalculator {

	public static double calculateShippingCosts(char shippingType, double weight) {

		int costPerKg = 0;

		switch (shippingType) {
		case 'S':
			costPerKg = 5;
			break;
		case 'E':
			costPerKg = 10;
			break;
		case 'O':
			costPerKg = 20;
			break;
		default:
			costPerKg = 0;
		}

		if (weight <= 0) {
			System.out.println("Invalid weight");
			return 0;
		}
		else {
			return costPerKg * weight;
		}

	}

}
