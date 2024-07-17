package assOne;

import java.util.Scanner;

public class SampleOneMe {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
//		oddNums();
		
		System.out.println("how many stars?: ");
		int numStars = sc.nextInt();
		
		stars(numStars);
		
		

	}

	private static void stars(int num) {
		for (int i = 1; i <= num; i++) {
			for (int n = 1; n <= i; n++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 1; i <= num; i++) {
			for (int n = num; n >= i; n--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

	public static void oddNums() {
		
		System.out.println("Enter low num: ");
		int low = sc.nextInt();
		System.out.println("Enter high num: ");
		int high = sc.nextInt();
		
		for (int i = low; i <= high; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
			else {
				continue;
			}
		}
		
	}

}
