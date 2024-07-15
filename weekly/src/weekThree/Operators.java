package weekThree;
import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int x=0, w=0, y=0, z=0;
			
			x = 4;
			
			System.out.println(++x);
			System.out.println(x++);
			System.out.println(x);
			System.out.println(--x);
			System.out.println(x--);
			System.out.println(x);
			
			w = 20; x = 10; y = -5; z = 0;
			
			// true if w = x and y is not = z
			System.out.println(w==x && y != z);
			
			// true if w = x or y is not = z
			System.out.println(w == x || y != z);
			
			// true if w does not = x + z
			System.out.println(!(w == (x+z)));
			
			
			sc.next();
			
			
			
		}
		
	}

}
