/**
 * 
 * @author DHYEY
 * TCS coding question
 * There are given keywords in a programming language
 * State if given string input is keyword or not
 * @Algorithm
 * Use array of string and compare
 * remember equals method compares the string by values
 * == operator does this by reference. Check the article to compare strings
 */
import java.util.Scanner;
public class Keyword {

	public static void main(String[] args) {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		String ip = sc.next();
		sc.close();
		String keywords[] = {"break","case","continue","default","defer","else","for","func","goto","if","map","range","return","struct","type","var"};
		for(int i = 0; i<16; i++) {
			if(keywords[i].equals(ip)) {
				flag = true;
				break;
			}
		}
		if(flag) 
			System.out.println(ip+" is a keyword");
		else
			System.out.println(ip+" is not a keyword");
	}
}
