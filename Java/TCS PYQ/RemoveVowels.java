/**
 * 
 * @author DHYEY
 * Remove vowels from the given string
 * @Algorithm
 * convert whole string to lowercase and then remove the vowel from string
 */

import java.util.Scanner;
public class RemoveVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		String str1 = str.replaceAll("[aeiou]","");
		System.out.println(str1);
		sc.close();
	}
}
