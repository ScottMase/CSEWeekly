package weekOne;
import java.util.Scanner;

public class invoiceAppV2 {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the invoice total calculator"); // Welcome menu
		System.out.println(); // print a blank line

		// create the Scanner object
		Scanner sc = new Scanner(System.in);

		// perform conversions until choice isn't equal to "y" or "Y"
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			// Your application will run forever until you type something else
			System.out.println("Please enter the subtotal: ");
			double subt = sc.nextDouble();
			double disc = 0;
			
			if (subt >= 500) {
				disc = 0.25;
			}
			else if (subt >=200) {
				disc = 0.2;
			}
			else if (subt >=100) {
				disc = 0.1;
			}
			System.out.println("Discount percent: " + (disc*100) + "%");
			System.out.println("Discount amount: " + (subt*disc));
			System.out.println("Invoice total: " + (subt - (subt*disc)));
			System.out.println("");
			

			
			System.out.println("Again? (y/n): ");
			choice = sc.next();
			

			

		}

	}

}
