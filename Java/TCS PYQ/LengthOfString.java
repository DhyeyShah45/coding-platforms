/**
 * 
 * @author DHYEY
 * Code for finding the length of string without using strlen().
 */

/**
 * 
 * @author DHYEY
 * Algorithm 
 * Increment a length variable unless a character is found out from the string
 * The method nextLine in line 22 will read the whole line given as input and also consider blank space as a character.
 * next method instead of nextLine will read the string until white space is encountered
 */

import java.util.*;
public class LengthOfString {

	public static void main(String[] args) {
		int length = 0;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for (@SuppressWarnings("unused") char c : str.toCharArray()) {
			length++;
		}
		System.out.println(length);
		sc.close();
	}

}
