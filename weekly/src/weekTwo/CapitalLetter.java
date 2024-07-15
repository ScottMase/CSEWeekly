package weekTwo;
import java.util.Scanner;

public class CapitalLetter {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String y = "y";
		
		while(y == "y") {
			
			System.out.println("Enter a character (a-z, A-Z): ");
			char ent = sc.next().charAt(0);
			int asciiValue = (int) ent;
			
			if (Character.isUpperCase(ent)) {
				System.out.println(ent + " is uppercase");
				System.out.println("The ascii value of " + ent + " is " + asciiValue);
			}
			else if (Character.isLowerCase(ent)) {
				System.out.println(ent + " is lowercase");
				System.out.println("The ascii value of " + ent + " is " + asciiValue);
			}
			else {
				System.out.println("Error in output: " + ent);
			}
			
		}
		
		
	}

}
