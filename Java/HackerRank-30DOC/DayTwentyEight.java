/**
* @Author - Dhyey Shah
* @problem - https://www.hackerrank.com/challenges/30-regex-patterns/problem?isFullScreen=true
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
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            // System.out.println(str);
            String[] str1 = str.split(" ");
            // System.out.println(str1[1]);
            if(Pattern.matches("[a-z]+@[a-z]*gmail\\.com",str1[1])) {
                // System.out.println("matches");
                list.add(str1[0]);
            }
        }
            Collections.sort(list);
            for (String out : list)
                System.out.println(out);   
    }
}
