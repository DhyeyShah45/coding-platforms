/**
 * 
 * @author DHYEY
 * Count Vowels in a string.
 * @Algorithm 
 * convert the whole string to lowercase and the compare
 */
import java.util.Scanner;
public class CountVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str.toLowerCase();
		int vowel = 0;
		for (char c : str.toCharArray()) {
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				vowel++;
		}
		System.out.print(vowel);
		sc.close();
	}
}
