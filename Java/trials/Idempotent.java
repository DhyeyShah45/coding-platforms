/**
 * Given a matrix, find whether it is Idempotent matrix or not. A matrix is said to be Idempotent if multiplied by itself returns the same matrix. The matrix M is said to be idempotent matrix if and only if M * M = M. In idempotent matrix M is a square matrix.
Input:
    2
    3 -6
    1 -2
where:
    First line represents the order of the square matrix. If order is k, then the matrix contains k * k elements.
    Second and third lines represent the matrix elements.
Output:
    Yes
Explanation: If we multiply the matrix by itself we get the same matrix again, hence the output "Yes".
Assumptions:
    Row size and column size of a matrix can be in the range 1 to 1000.
    Matrix element can be in the range -1000 to 1000
 */

import java.util.*;

public class Idempotent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        sc.close();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
                // System.out.println(arr[i][j]+" i: "+i+" j: "+j);
            }
        }
        for(int j=0;j<n;j++){
            ans += arr[0][j]*arr[j][0];
            // System.out.println(ans);
        }
        if(ans==arr[0][0])
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}