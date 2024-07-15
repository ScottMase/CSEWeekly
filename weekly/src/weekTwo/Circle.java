package weekTwo;
import java.util.Scanner;

public class Circle {
	
	

	
	public static void main(String[] args) {
		
		

		
		radius();
		
		
		
	}
	
	public static void radius() {
		
		
		int a = 0;
		System.out.println("Enter radius: ");
		Scanner sc = new Scanner(System.in);
		int rad = sc.nextInt();
		
		System.out.println("The diameter is: "+ (rad * 2));
		System.out.println("The circumference is: "+ (rad * 3.14));
		System.out.println("The area is: "+ (Math.pow(rad, 2) * 3.14));
		System.out.println("");
			
	}

}
