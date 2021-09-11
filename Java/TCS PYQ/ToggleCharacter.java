/**
 * 
 * @author DHYEY
 * Toggle each character of a string
 * @Algorithm
 * if ASCII >94 subtract 32 else add 32
 */
import java.util.*;
public class ToggleCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = "";
		for (int i = 0; i < str.length(); i++){
			if (Character.isUpperCase(str.charAt(i))) {
				str1 = str1 + Character.toLowerCase(str.charAt(i));
			}
			else {
				str1 = str1 + Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(str1);
		sc.close();
	}
}
