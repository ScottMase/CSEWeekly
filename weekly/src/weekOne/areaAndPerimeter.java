package weekOne;

import java.util.Scanner;

public class areaAndPerimeter {

	public static void main(String[] args) {
		System.out.println("Welcome to user perimeter and area calculator"); // Welcome menu
		System.out.println(); // print a blank line

		// create the Scanner object
		Scanner sc = new Scanner(System.in);

		// perform conversions until choice isn't equal to "y" or "Y"
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			// Your application will run forever until you type something else
			System.out.println("Please enter the length: ");
			double len = sc.nextDouble();
			System.out.println("Please enter your width: ");
			double wid = sc.nextDouble();
			
			double area = len * wid;
			double perim = (len *2) + (wid *2);
			
			System.out.println("Area = " + area);
			System.out.println("Perimeter = " + perim);
			
			System.out.println();
			System.out.println("Continue? (y/n): ");
			sc.next();
			System.out.println();
			

			

		}

	}
	
}
