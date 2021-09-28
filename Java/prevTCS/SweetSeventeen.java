package prevTCS;
/**
 * @author DHYEY
 * TCS coding question 
 * Convert a 4 digit number of base 17 to decimal
 * @Algorithm 
 * use wrapper class Integer and parseInt method
 * parseInt(String, redix)
 */
import java.util.Scanner;
public class SweetSeventeen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int decimal = Integer.parseInt(str, 17);
		sc.close();
		System.out.println(decimal);
	}
}
