/**
 * @author DHYEY
 * Queue implementation using array
 * Two methods are implemented 
 * Enqueue and Dequeue
 */
package dataStructures;

public class Queue {

	static int front=0, rear=0;
	static int[] queue = new int[10];
	public static void main(String[] args) {
		enqueue(20);
		enqueue(11);
		enqueue(98);
		enqueue(3);
		dequeue();
		System.out.println(front+" "+rear);
		System.out.println(dequeue());
		System.out.println(front+" "+rear);
		
	}
	
	static void enqueue(int data) {
		if(rear<queue.length) {
			queue[rear] = data;
			rear++;			
		}
		else
			System.out.println("Queue Full");
	}
	
	static int dequeue() {
		if(front<=rear) {
			front++;
			return queue[front-1];
		}
		else {
			System.out.println("Queue Empty");
			return 0;
		}
	}

}
