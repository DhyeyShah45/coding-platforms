/**
* @Author - Dhyey Shah
* @problem - https://www.hackerrank.com/challenges/30-sorting/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    static int swaps=0;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Write your code here
        Integer[] array = new Integer[a.size()];
        array = a.toArray(array);
        for (int j=0;j<a.size()-1;j++)
        {
            for(int i=0;i<a.size()-1;i++){
            if(array[i]>array[i+1])
                swap(i,i+1,array);
            }
        }

        bufferedReader.close();
        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: "+array[0]+" ");
        System.out.println("Last Element: "+array[a.size()-1]+" ");
    
    }
    static void swap(int i, int j, Integer[] array){
        swaps++;
        int temp=0;
        temp = array[i+1];
        array[i+1]=array[i];
        array[i]=temp;
    }
}

