package weekTwo;
import java.util.Scanner;

public class AsciiValues {
	
	public static void main(String[] args) {
		
		String tru = "y";
				
		
		while (tru == "y") {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Char: ");
		char charec = sc.next().charAt(0);
		
		int asciiValue = (int) charec;
		
		System.out.println("The ascii value of " + charec + " is " + asciiValue);
		
		}
	}

}
