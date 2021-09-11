/**
 * @author - Dhyey Shah
 * @problem - https://www.hackerrank.com/challenges/30-data-types/problem
 */
import java.util.*;

public class DayOne {

    public static void main(String[] args) {
        int i  = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner sc = new Scanner(System.in);
        int iv = sc.nextInt();
        double dn = sc.nextDouble();
        sc.nextLine();
        String sn = sc.nextLine();
        System.out.println(i+iv);
        System.out.println(d+dn);
        s = s.concat(sn);
        System.out.println(s);
        sc.close();
    }
}
