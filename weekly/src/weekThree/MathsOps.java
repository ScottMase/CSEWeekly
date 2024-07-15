package weekThree;
import java.util.Scanner;


public class MathsOps {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("Enter num1: ");
			
			int num1 = sc.nextInt();
			
			System.out.println("Enter num2: ");
			
			int num2 = sc.nextInt();
		
			
			System.out.println("The sum of " + num1 + " and " + num2 + " is: " + num1 + num2);
			System.out.println("The product of " + num1 + " and " + num2 + " is: " + num1 * num2);
			System.out.println("The difference of " + num1 + " and " + num2 + " is: " + (num1 - num2));
			
			if (num2 == 0) {
				System.out.println("num2 is 0. Cannot divide by 0");
			}
			else {
			System.out.println("The quotient of " + num1 + " and " + num2 + " is: " + num1 / num2);
			}
			
			sc.nextLine();
		}
		
		
	}

}
