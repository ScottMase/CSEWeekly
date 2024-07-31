package ait.loops;

import java.util.Scanner;

public class DoWhileLoops {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		largestNumberOf5();
		squares();
		doWhileContinue();
	}

	public static void largestNumberOf5() {

		int counter = 1, number = 0, largest = 0;

		do {
			System.out.print("Enter a number : ");
			number = sc.nextInt();

			if (number > largest)
				largest = number;

			counter++; // increment counter by 1
		} while (counter <= 5);

		System.out.println("Largest is " + largest);
	}
	
	public static void squares() {
		   int square=0, x = 1, total = 0; 

		    do {
				square = x * x;
				System.out.println(square);
				total += square;
				++x;
			} while ( x <= 5 );

		   System.out.println("Total is " + total);
	}
	
	public static void doWhileContinue() {
		    int i = 0;
		    do {
		    	i++;
		       	if (i == 7){
		          	continue;
		       	}// goto end of loop (bypassing i++ !!)
			System.out.println(i);
		       
		    } while (i <= 9);
	}


}
