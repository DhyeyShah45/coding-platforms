/**
 * 
 * @author DHYEY
 * TCS coding question
 * series has two GPs 1,1,2,3,4,9,8,27,16,81,...
 * even positions has different GP, odd has other.
 * find the n the term of the series.
 * @Algorithm
 * The n will give the index
 * find which gp is followed by n
 */

import java.util.Scanner;
public class TwoInOneGP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int index = n-1, sum = 0;
		if(index%2==0) {
			sum = (int) Math.pow(2, index/2);
		}
		else
			sum = (int) Math.pow(3, index/2);
		System.out.println(sum);

	}

}
