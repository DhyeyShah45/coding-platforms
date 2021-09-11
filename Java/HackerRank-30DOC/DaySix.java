/**
 * @author - Dhyey Shah
 * @problem - https://www.hackerrank.com/challenges/30-review-loop/problem
 */
import java.util.*;

public class DaySix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            String str = sc.next();
            String str1 = "",str2 = "";
            for(int j = 0; j<str.length(); j++){
                if (j%2==0)
                    str1 += str.charAt(j);
                else
                    str2 += str.charAt(j);
            }
            System.out.println(str1+" "+str2);
        }
        sc.close();
    }
}

