package weekThree;
import java.util.Scanner;

public class IfLogicalOps {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("Enter num1: ");
			
			int num1 = sc.nextInt();
			
			System.out.println("Enter num2: ");
			
			int num2 = sc.nextInt();
			
			
			if (num1 < 0 && num2 < 0) {
				System.out.println("Both numbers are negative");
			}
			
			else if (num1 >= 0 && num2 >= 0) {
				System.out.println("Both numbers are positive");
			}
			
			else if (num1 == 0 || num2 == 0) {
				System.out.println("At least one number is zero");
			}
			
			else if (num1 < 0 || num2 < 0) {
				System.out.println("At least one number is negative");
			}
			
			sc.next();
			
			
		}
		
		
	}

}
