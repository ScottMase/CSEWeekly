package weekOne;

import java.util.Scanner;

public class gradeConverter {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Welcome to Grade converter"); // Welcome menu
		System.out.println(); // print a blank line
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
		
			System.out.println("Enter numerical grade: ");
			int grade = sc.nextInt();
			
			if (grade < 0 || grade > 100) {
				System.out.println("Error in grade input: " + grade);
			}

			
			
			else {
				if (grade >= 85) {
					System.out.println("Letter grade: A");
				}
				else if(grade >= 70) {
					System.out.println("Letter grade: B");
				}
				else if(grade >= 55) {
					System.out.println("Letter grade: C");
				}
				else if(grade >= 40) {
					System.out.println("Letter grade: D");
				}
				else {
					System.out.println("Letter grade: Failed");
				}
				
			}	
			
			
			System.out.println();
			System.out.println("Continue? (y/n): ");
			sc.next();
			System.out.println();
		
			
		}

			

	
		
		

		

	}
}
