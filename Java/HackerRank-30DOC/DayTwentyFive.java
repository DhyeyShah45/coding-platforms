/**
* @Author - Dhyey Shah
* @problem - https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            boolean isPrime = false;
            int val = sc.nextInt();
            if(val==1){
                System.out.println("Not prime");
                continue;
            }
            if(val==2||val==3){
                System.out.println("Prime");
                continue;
            }
            for(int j=2;j<=Math.sqrt(val);j++){
                // System.out.println("j: "+j);
                // System.out.println("val%j: "+val%j);
                if(val%j!=0){
                    isPrime = true;
                }
                else{
                    isPrime = false;
                    break;
                }
            }
            // System.out.println(isPrime);
            if(isPrime==true)
                System.out.println("Prime");
            else
                System.out.println("Not prime");
            
        }

}
