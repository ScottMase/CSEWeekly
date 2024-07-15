package weekTwo;
import java.util.Scanner;


public class AlgebraicExpression {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 2;
		int a = 3;
		
		System.out.println("Evaluating \"y = ax3 + 7\" where x == 2 and a == 3");
		
		System.out.println("y = a * x * x * x + 7 sets y to: " + (a * x * x * x + 7));
		System.out.println("y = a * x * x * (x + 7) sets y to: " + (a * x * x * (x + 7)));
		System.out.println("y = (a * x) * x * (x + 7) sets y to: " + ((a * x) * x * (x + 7)));
		System.out.println("y = (a * x) * x * x + 7 sets y to: " + ((a * x) * x * x + 7));
		System.out.println("y = a * (x * x * x) + 7 sets y to: " + (a * x * x * x + 7));
		System.out.println("y = a * x * (x * x + 7) sets y to: " + (a * x * (x * x + 7)));
		System.out.println("y = a * x^3 + 7 using Math.pow sets y to: " + (a * Math.pow(x, 3) + 7));
		
		

	
	}

}
