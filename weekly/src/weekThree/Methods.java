package weekThree;
import java.util.Scanner;

public class Methods {
	
	Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
		
		
		Methods meth = new Methods();
		
		int x = meth.getInt("Enter x: ");
		int y = meth.getInt("Enter y: ");
		
		meth.calcSum(x, y);
		meth.calcDiff(x, y);
		meth.calcProd(x, y);
		meth.calcQuot(x, y);
		
		System.out.println("");
		System.out.println("");
		
		int h = meth.getInt("Enter height: ");
		int l = meth.getInt("Enter length: ");
		int w = meth.getInt("Enter width: ");
		
		

		
		
		
		
		
		
		
		

		
	}
	
	public int getInt(String a) {
		System.out.println(a);
		return sc.nextInt();
	}
	
	public void calcSum(int a, int b) {
		System.out.println("the sum of " + a + " and " + b + " is " + (a+b));
	}
	public void calcProd(int a, int b) {
		System.out.println("the product of " + a + " and " + b + " is " + (a*b));
	}
	public void calcDiff(int a, int b) {
		System.out.println("the difference of " + a + " and " + b + " is " + (a-b));
	}
	
	public void calcQuot(int a, int b) {
		
		if (b != 0) {
		System.out.println("the quotient of " + a + " and " + b + " is " + (a/b));
		}
		else {
			System.out.println("Divisor cant be 0");
		}
	}
	
	public void calcVol(int h, int l, int w) {
		int r = w/2;
		int f = (int) (3.14* (Math.pow(r, 2)));
		System.out.println("The volume is: " + f);  
	}
	
	public void calcGeom() {
		System.out.println("enter x1 --> ");
		int x1 = sc.nextInt();
		System.out.println("enter x2 --> ");
		int x2 = sc.nextInt();
		System.out.println("enter y1 --> ");
		int y1 = sc.nextInt();
		System.out.println("enter y2 --> ");
		int y2 = sc.nextInt();
		
		double dx = x1 - x2;
		double dy = y1 - y2;
		
		double diff = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
		
		System.out.println("The distance between the two points is :" + diff);
	}
	
	public void calcHyp() {
		
		
		
	}
	
	

}
