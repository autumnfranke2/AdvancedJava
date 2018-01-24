
public class Palindrome {
	boolean checkPalindrome(String str) { 
	    int n = str.length();
	    
	    for( int i = 0; i < n/2; i++ ) {
	        if (str.charAt(i) != str.charAt(n-i-1)) {
	        	return false;
	        }
	    }
	    return true;    
	}
}

/*
 * Reference:
 * https://stackoverflow.com/questions/4138827/check-string-for-palindrome
 */


