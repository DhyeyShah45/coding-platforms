/**
 * @author DHYEY
 * TCS coding question
 * A person goes right from 0,0 in coordinate axis and travels 10m
 * Then upwards for other 10m
 * Then left
 * then down
 * then again right
 * now he repeats the pattern
 * @Algorithm
 * Just do as said - Keep in mind its coordinate axis
 */
import java.util.Scanner;

public class Walker {

	public static void main(String[] args) {
		int x = 0, y = 0, distance = 0;
		char c = 'R';
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		while(n!=0) {
			if(c == 'R') {
				distance += 10;
				x += distance;
				c = 'U';
			}
			else if(c=='U') {
				distance += 10;
				y += distance;
				c = 'L';
			}
			else if(c=='L') {
				distance += 10;
				x -= distance;
				c = 'D';
			}
			else if(c=='D') {
				distance += 10;
				y -= distance;
				c = 'A';
			}
			else if(c=='A') {
				distance += 10;
				x += distance;
				c = 'R';
			}
			n--;
		}
		System.out.println(x+" "+y);
	}

}
