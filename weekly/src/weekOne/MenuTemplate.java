package weekOne;

import java.util.Scanner;

public class MenuTemplate {

	public static void main(String[] args) {
		System.out.println("Welcome to user info"); // Welcome menu
		System.out.println(); // print a blank line

		// create the Scanner object
		Scanner sc = new Scanner(System.in);

		// perform conversions until choice isn't equal to "y" or "Y"
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			// Your application will run forever until you type something else
			System.out.println("Please enter your age: ");
			int age = sc.nextInt();
			System.out.println("Please enter your name: ");
			String name = sc.next();

			
			System.out.println("Hello " + name);
			System.out.println("You are: " + age + " years old");

			
			//simple if - else if - else
			if (age < 18) {
				System.out.println("you cannot drink or drive");

			} else if(age >= 18 && age <100) {
				System.out.println("You can drink or drive");
			} 
			
			else {
				System.out.println("Is this a valid age");
			}
			
			// see if the user wants to continue
			System.out.println();
			System.out.println("Continue? (y/n): ");
			sc.next();
			System.out.println();
		}

	}

}