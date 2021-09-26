/**
* @Author - Dhyey Shah
* @problem - https://www.hackerrank.com/challenges/30-nested-logic/problem?isFullScreen=true
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int[] actual = new int[3];
        int[] expected = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++)
            actual[i] = sc.nextInt();
        for(int i=0;i<3;i++)
            expected[i] = sc.nextInt();
        sc.close();
        if(actual[2]>expected[2]){
            System.out.println(10000);
            
        }
        else if (actual[2]==expected[2]){
            if(actual[1]>expected[1]){
                System.out.println(500*(actual[1]-expected[1]));
            }
            else{
                if(actual[0]>expected[0])
                    System.out.println(15*(actual[0]-expected[0]));
                else
                    System.out.println(0);
            }
        }
        else
            System.out.println(0);
    }
}
