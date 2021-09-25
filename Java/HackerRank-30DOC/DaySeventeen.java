/**
* @Author - Dhyey Shah
* @problem - https://www.hackerrank.com/challenges/30-more-exceptions/problem
*/
import java.util.*;
import java.io.*;

class NoNegativeException extends Exception {
    public NoNegativeException(String str){
        super(str);
    }
}

class Calculator{
    static int power(int a, int b) throws NoNegativeException{
        int product = 1;
        if(a<0 || b<0)
        throw new NoNegativeException("n and p should be non-negative");
        else{
            for(int i = 0;i<b;i++){
                product *= a;
            }
            return product;
        }
    }
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
