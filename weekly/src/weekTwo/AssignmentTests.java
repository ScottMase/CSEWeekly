package weekTwo;
import java.util.Scanner;

public class AssignmentTests {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		
		String tru = "y";
		
		
		while(tru == "y") {
			
		
		System.out.println("Enter integer: ");
		int ent = sc.nextInt();
		
		if (ent <= 10 && ent >= 1) {
			if(ent < 6) {
				System.out.println("Square of " + ent + " is " + Math.pow(ent, 2));
			}
			else {
				System.out.println("cube of " + ent + " is " + Math.pow(ent, 3));
			}
			
		}
		else {
			System.out.println("Input value outside of range 1 - 10: " + ent);
		}
	}
		
	}
		
		
		
	}


