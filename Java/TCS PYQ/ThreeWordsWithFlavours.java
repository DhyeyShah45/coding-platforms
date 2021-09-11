/**
 * @author DHYEY
 * TCS coding questions
 * 3 words input in 3 seperate lines
 * convert 1st word as vowels replaced by *
 * convert 2nd word as consonants replaced by @
 * convert 3rd word to uppercase 
 */
import java.util.Scanner;

public class ThreeWordsWithFlavours {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		String str1 = str.replaceAll("[aeiou]","*");
		String str2 = sc.nextLine().toLowerCase();
		String str3 = str2.replaceAll("[^aeiou]","@");
		String str4 = sc.nextLine().toUpperCase();
		System.out.println(str1+str3+str4);
		sc.close();
	}
}
