/**
 * @author - Dhyey Shah
 * @problem - https://www.hackerrank.com/challenges/30-recursion/problem
 */
import java.io.*;
class Outcome {
    public static int factorial(int n) {
    if (n>1){
        return factorial(n-1)*n;
    }
    else
        return 1;
    }

}

public class DayNine {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Outcome.factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

