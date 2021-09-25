/**
* @Author - Dhyey Shah
* @problem - https://www.hackerrank.com/challenges/30-interfaces/problem
*/
import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    int out = 0,limit=0;
    public int divisorSum(int n) {
        if(n%2==0)
            limit = n/2;
        else
            limit = n/3;
        for (int i=1;i<=limit;i++){
            if(n%i==0)
                out += i;
        }
        return out+n;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
