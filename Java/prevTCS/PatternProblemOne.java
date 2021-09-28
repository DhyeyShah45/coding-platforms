package prevTCS;
/**
 * @author DHYEY
 * TCS coding problem 
 * 0,0,2,1,4,2,6,3,8,4,....
 * odd positions has even numbers
 * even positions has half value of previous odd position
 */
import java.util.Scanner;
public class PatternProblemOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2!=0) {
			System.out.println(n-1);
		}
		else
			System.out.println((n-2)/2);
		sc.close();
	}
}
