/**
* @Author - Dhyey Shah
* @problem - https://www.hackerrank.com/challenges/30-queues-stacks/problem
*/
import java.io.*;
import java.util.*;

public class Solution {
    // Write your code here.
    int first=0,rear=0,top=0;
    char[] stack = new char[100];
    char[] queue = new char[100];
    void enqueueCharacter(char c){
        queue[rear] = c;
        rear++;  
    }
    char dequeueCharacter(){
        first++;
        return queue[first - 1];
    }
    void pushCharacter(char c){
        stack[top] = c;
        top++;
    }
    char popCharacter(){
        top--;
        return stack[top];
    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
