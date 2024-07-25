//Student Name: Scott Daly
package cse.assessment.one;

import java.util.Scanner;

public class AssessmentOne2024 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		question1();
		question2();
		question3();
	}

	public static void question1() {
		System.out.println("Check if you can vote:");
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		System.out.print("Are you a citizen? (true/false): ");
		boolean citizen = sc.nextBoolean();
		allowedToVote(age, citizen);
		System.out.println();
	}

	public static void allowedToVote(int age, boolean citizen) {
		if (age >= 18 && citizen) {
			System.out.println("You are eligible to vote!");
		} else {
			System.out.println("You are not eligible to vote.");
		}
	}

	public static void question2() {
		System.out.println("Please enter two whole numbers and get some operations: ");
		System.out.print("Enter number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter number 2: ");
		int num2 = sc.nextInt();

		System.out.print("Which operation do you want (+,-,*,/) ? ");
		char operation = sc.next().charAt(0);

		if (num2 == 0 && operation == '/') {
			System.out.println("Cannot divide by zero!");
		} else {
			myCalculator(num1, num2, operation);
		}
		System.out.println();

	}

	public static void myCalculator(int num1, int num2, char operation) {
		int value = 0;
		String opkey = "";

		switch (operation) {
		case '+':
			value = num1 + num2;
			opkey = " plus ";
			break;
		case '-':
			value = num1 - num2;
			opkey = " minus ";
			break;
		case '*':
			value = num1 * num2;
			opkey = " times ";
			break;
		case '/':
			value = num1 / num2;
			opkey = " divided by ";
			break;
		default:
			System.out.println("Invalid Operation");
		}

		if (opkey != "") {
			System.out.println(num1 + opkey + num2 + " is " + value);
		}

	}

	public static void question3() {
		System.out.print("Enter a character: ");
		char character = sc.next().toLowerCase().charAt(0);

		myChar(character);
		System.out.println();

	}

	public static void myChar(char character) {
		int asciiVal = (int) character;
		String type = " special character";

		if (asciiVal >= 48 && asciiVal <= 57) {
			type = " digit";
		} else if (asciiVal >= 97 && asciiVal <= 122) {
			switch (character) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				type = " vowel";
				break;
			default:
				type = " consonant";
			}

		}

		System.out.println("You entered a" + type);
	}

}