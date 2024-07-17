package assOne;

import java.util.Scanner;

public class SampleOne {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	
        System.out.print("Enter your age ");
        int age = sc.nextInt();
        boolean okToWatchFilm = admitToFilm(age);
        if (okToWatchFilm) {
            System.out.println("Enjoy the film!");
        } else {
            System.out.println("Sorry, you cannot watch this film.");
        }

		multTable();

		oddNumbers();

	}
    public static boolean admitToFilm(int age) {
    	final int CERT=15;
        if (age >= CERT) {
            return true;
        } else { // < 15
            System.out.print("Is there an adult with you (true/false) ? ");
            return sc.nextBoolean();
        }
    }
	public static void multTable() {	// for or while allowed
		final int CEILING=4;
		
		System.out.print("Display the multiplication table for? : ");
		int n = sc.nextInt();
		// for
		for(int i=1; i<=CEILING; i++) {
			System.out.println(n * i);
		}
		// while
		int i=1;
		while(i <= CEILING) {
			System.out.println(n * i);
			i++;
		}
	}
	public static void oddNumbers() {
		System.out.print("Please low number : ");
		int low = sc.nextInt();
		System.out.print("Please high number : ");
		int high = sc.nextInt();
		
		for(int i=low; i<=high; i++) {
			if(i % 2 == 0) {
				// even number
				continue;
			}
			System.out.println(i + " ");// odd
		}
	}
		

	
	
}
