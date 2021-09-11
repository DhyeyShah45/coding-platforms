/**
 * @author - Dhyey Shah
 * @problem - https://www.hackerrank.com/challenges/30-2d-arrays/problem
 */
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
public class DayEleven {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        List<Integer> sum = new ArrayList<>();
        for(int row = 0; row<4; row++){
            for(int column = 0; column<4; column++){
                int temp = arr.get(row).get(column)+arr.get(row).get(column+1)+arr.get(row).get(column+2)+arr.get(row+1).get(column+1)+arr.get(row+2).get(column)+arr.get(row+2).get(column+1)+arr.get(row+2).get(column+2);
                sum.add(temp);
            }
        }
        Integer max = Collections.max(sum);
        System.out.println(max);
    }
}

