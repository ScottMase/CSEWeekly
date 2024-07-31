package ait.loops;

import java.util.Scanner;

public class WhileLoops {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// thirdOrderPolynomial();
		// whileAverage();
		// whileGrades();
		// whileHistogram();
		// whileLargestSmallest();
		// whileSales();
		//whileSquares();
//		whileAverageSentinel();
		System.out.println(rand());
	}

	public static void thirdOrderPolynomial() {

		double a = 0, b = 0, c = 0, d = 0, x = 0, fx = 0;
		char repeat = 'y';
		// String s="";
		// Get the coefficients of the polynomial
		System.out.print("Enter coefficient a : ");
		a = sc.nextDouble();
		System.out.print("Enter coefficient b : ");
		b = sc.nextDouble();
		System.out.print("Enter coefficient c : ");
		c = sc.nextDouble();
		System.out.print("Enter coefficient d : ");
		d = sc.nextDouble();

		while (repeat == 'y') {
			// input x value
			System.out.print("Enter the value for x: ");
			x = sc.nextDouble();

			// calculate and display the value of the polynomial at x
			fx = a * (x * x * x) + b * (x * x) + c * x + d;
			System.out.println("The value of the polynomial at " + x + " is " + fx);

			// ask user if he/she wants to continue
			System.out.print("Do you wish to continue (y/n) --> ");
			repeat = sc.next().charAt(0);
		}
	}

	public static void whileAverage() {
		double num = 0, total = 0, average = 0;
		int numbersEntered = 1;

		System.out.print("How many numbers in the sequence  --> ");
		int n = sc.nextInt();

		while (numbersEntered <= n) {
			System.out.print("Please enter a number  --> ");
			num = sc.nextDouble();
			total += num;
			numbersEntered++;
		}
		average = total / n;
		System.out.println("Average is " + average);
	}

	public static void whileGrades() {
		String grade = "";
		int aCount = 0, bCount = 0, cCount = 0, dCount = 0, eCount = 0, fCount = 0;

		System.out.print("Enter the grade a-f or A-F (x/X to exit) --> ");
		grade = sc.next().toLowerCase();

		while (!grade.equalsIgnoreCase("x")) {
			switch (grade) {
			case "a":
				aCount++;
				break;
			case "b":
				bCount++;
				break;
			case "c":
				cCount++;
				break;
			case "d":
				dCount++;
				break;
			case "e":
				eCount++;
				break;
			case "f":
				fCount++;
				break;
			default:
				System.out.println("Letter entered was not in range !" + grade);
				break;
			}
			// Get the next grade
			System.out.print("Enter the grade a-f or A-F (x/X to exit) --> ");
			grade = sc.next().toLowerCase();
		}
		// Output number of each grade
		System.out.println("Number of A's is \t" + aCount);
		System.out.println("Number of B's is \t" + bCount);
		System.out.println("Number of C's is \t" + cCount);
		System.out.println("Number of D's is \t" + dCount);
		System.out.println("Number of E's is \t" + eCount);
		System.out.println("Number of F's is \t" + fCount);

	}

	public static void whileHistogram() {
		int rows = 0, cols = 0, i = 1, j = 1;

		System.out.print("Enter number of rows --> ");
		rows = sc.nextInt();
		System.out.print("Enter number of cols" + " --> ");
		cols = sc.nextInt();

		while (i <= rows) {
			j = 1; // reset so next while loop works
			while (j <= cols) {
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i++;
		}
	}

	public static void whileLargestSmallest() {
		int i = 1, number = 0, largest = 0, smallest = 0, n;
		// if -3 is entered for n, 0 is coming out as the largest
		boolean someNumberEntered = false;

		System.out.print("Enter n --> ");
		n = sc.nextInt();
		while (i <= n) {
			someNumberEntered = true;
			System.out.print("Enter a number --> ");
			number = sc.nextInt();
			// n negative numbers could be entered leaving 0 as the
			// incorrect largest number; thus, the first number becomes
			// the largest by default (if only one number in the
			// sequence then its fine anyway)
			if (i == 1) { // first number
				largest = number;
				smallest = number;
			} else if (number > largest) {
				largest = number;
			} else if (number < smallest) {
				smallest = number;
			}
			i++;
		}
		if (someNumberEntered) {
			System.out.println("Largest is " + largest);
			System.out.println("Smallest is " + smallest);
		} else
			System.out.println("n was invalid: " + n);

	}

	public static void whileSales() {
		double sales = 0, salary = 0;

		System.out.print("Enter sales (-1 to end) --> ");
		sales = sc.nextDouble();

		while (sales != -1.0) {
			salary = 3000.0 + 0.09 * sales; // multiplication done first
			System.out.println("Salary is: " + salary + " Euro \n");
			System.out.print("Enter sales (-1 to end) --> ");
			sales = sc.nextDouble();
		}

	}

	public static void whileSquares() {
		int square = 0, x = 1, total = 0;

		while (x <= 5) {
			square = x * x;
			System.out.println(square);
			total += square;
			++x;
		}
		System.out.println("Total is " + total);
	}

	public static void whileAverageSentinel() {
		double num = 0, total = 0, average = 0;
		int numbersEntered = 0;

		System.out.print("Please enter a number (-1 to exit) --> ");
		num = sc.nextDouble();
		while (num != -1) {
			total += num;
			numbersEntered++; // only count VALID numbers
			System.out.print("Please enter a number (-1 to exit) --> ");
			num = sc.nextDouble();
		}
		// we will be typing in -1 at some stage (to terminate loop),
		// so our only check is to ensure that -1 was not the first
		// number
		if (numbersEntered == 0)
			System.out.println("No numbers entered...");
		else {
			average = total / numbersEntered;
			System.out.println("Average is " + average);
		}

	}
	
	public static double rand() {
		
		int i = 100;
		
		double x = Math.random() * i;
		
		return x;
	}
}
