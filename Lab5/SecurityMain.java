package Lab5;

import java.util.Scanner;

public class SecurityMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Security sclass = new Security();
		
		System.out.print("enter a string: ");
		
		String x = sclass.SecurityCheck(scanner.nextLine());
		System.out.print(x);
	}

}
