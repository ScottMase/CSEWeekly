package weekFour;

import java.util.Scanner;

public class StringExercises {
	
	public static void pr(String str) {
		System.out.println(str);
	}
	public static void pr(char str) {
		System.out.println(str);
	}
	public static void pr(Boolean str) {
		System.out.println(str);
	}
	public static void pr(int str) {
		System.out.println(str);
	}
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
			
//		stringMethodsExercises();
//		stringConstantPoolsExercise();
//		stringComparisonsExercise();
//		stringImutabilityExercise();
		stringFormattingExercise();

	}

	private static void stringFormattingExercise() {
//		System.out.printf("left justified string: " +  "%-15s" , "Total"  );
//		pr("");
		System.out.printf("Right justified string: %10.2f" + 123);
	}

	private static void stringImutabilityExercise() {
		String str = "hello";
		pr("original string: " + str);
		pr("appended: " + str.concat("World"));
		pr("original string: " + str);
		
		
	}

	private static void stringComparisonsExercise() {
		pr("Type string 1: ");
		String str1 = sc.nextLine();
		pr("Type string 2: ");
		String str2 = sc.nextLine();
		
		pr(str1.compareTo(str2));
		pr(str1 == str2);
		pr(str1.equals(str2));
		
		
		
	}

	private static void stringConstantPoolsExercise() {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		pr("str1 == str2: " + (str1 == str2));
		pr("str1 == str3: " + (str1 == str3));
		pr("str3 == str4: " + (str3 == str4));
		pr("str1.equals(str2): " + (str1.equals(str2)));
		pr("str1.equals(str3): " + (str1.equals(str3)));
		pr("str4.equals(str3): " + (str3.equals(str4)));
			
				
		
	}

	private static void stringMethodsExercises() {
		pr("Type string: ");
		String str = sc.nextLine();
		pr(str.charAt(5));
		pr(str.substring(4, 9));
		pr(str.toUpperCase());
		pr(str.contains("Prog"));
		pr(str.replace("Java", "Python"));
		
	}

}
