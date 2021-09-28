package trials;

import java.util.Scanner;

public class PalindromeByRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(isPalindrome(str));
		sc.close();

	}
	
	static boolean isPalindrome(String input) {
		if(input.length()==0 || input.length()==1)
			return true;
		if(input.charAt(0)==input.charAt(input.length()-1))
			return isPalindrome(input.substring(1, input.length()-1));
		return false;
	}

}
