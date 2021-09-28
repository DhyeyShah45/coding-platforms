package trials;
import java.util.Scanner;
import java.util.Stack;
public class ReverseByStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> st = new Stack<>();
		String a = sc.nextLine();
		for(char c : a.toCharArray())
			st.push(c);
		for(char c : a.toCharArray())
			System.out.print(st.pop());
		sc.close();
	}

}
