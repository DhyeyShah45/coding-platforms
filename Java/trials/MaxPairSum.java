/**
 * Given an array of distinct integers A, find the largest sum of any pair of elements. 
Input 
    6 
    1 2 3 89 4 10 
    Where, 
    First line contains the size of array N. 
    Second line contains array elements.      
Output 
    99 
Here for the given array, sum of various pairs are 
    1 + 89 = 90 
    2 + 89 = 91 
    3 + 89 = 92 
    4 + 89 = 93
    10 + 89 = 99
and so on. The largest sum out of these pairs is 99. 
 */

import java.util.*;

public class MaxPairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0;i<size;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        System.out.println(a[size-1]+a[size-2]);
        sc.close();
    }
}
