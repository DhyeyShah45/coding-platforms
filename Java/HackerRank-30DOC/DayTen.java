/**
 * @author - Dhyey Shah
 * @problem - https://www.hackerrank.com/challenges/30-binary-numbers/problem
 */
import java.io.*;
public class DayTen {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String binary = Integer.toBinaryString(n)+"0";
        int temp = 0,sum = 0;
        for (char c : binary.toCharArray()){
            if(c=='1'){
                sum+=1;
            }
            else{   
                if (sum>temp){
                    temp = sum;
                    sum = 0;
                }
                else{
                    sum = 0;
                }
            }
        }
        System.out.println(temp);

        bufferedReader.close();
    }
}

