/**
 * @author DHYEY
 * Stack implementation using array of size 100.
 * It has three methods 
 * 1 - isEmpty
 * 2 - push
 * 3 - pop
 */

package dataStructures;

import java.util.Arrays;

public class Stack {

	static int top;
	static int[] stack = new int[10]; 
	public static void main(String[] args) {
			push(3);
			push(20);
			push(11);
			push(98);
			pop();
			System.out.println(pop());
			System.out.println(Arrays.toString(stack));
	}
	
	static boolean isEmpty() {
		if (top==0)
			return true;
		else 
			return false;
	}
	
	static void push(int d) {
		if(top<=stack.length) {
			stack[top] = d;
			top++;			
		}
		else
			System.out.println("Overflow");
	}
	
	static int pop() {
		if(!isEmpty()) {
			top--;
			return stack[top];
		}
		else {
			System.out.println("Underflow");
			return 0;
		}
		
	}
}
