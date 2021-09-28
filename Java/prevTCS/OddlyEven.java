package prevTCS;
/**
 * @author DHYEY
 * TCS coding question
 * Given a maximum of 100 digit number, find the difference between sum of odd and even position digits
 * remember (int) str.charAt(i) gives ascii value of that character
 */
import java.util.Scanner;
public class OddlyEven {

	public static void main(String[] args) {
		int odd = 0, even = 0;
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		for (int i = 0; i < str.length(); i++) {
			if(i%2==0) {
				odd = odd + ((int) str.charAt(i)-48);
			}
			else {
				even = even + ((int) str.charAt(i)-48);
			}
		}
		System.out.println(Math.abs(even-odd));
	}

}
