import java.util.Scanner;

public class PalindromeMain {
	public static void main(String[] args) {
		
		Palindrome Pal = new Palindrome();
		Scanner Scan = new Scanner(System.in);
		
		System.out.print("Input word or phrase: ");
		
		System.out.print(Pal.checkPalindrome(Scan.nextLine()));
		

	}


}
