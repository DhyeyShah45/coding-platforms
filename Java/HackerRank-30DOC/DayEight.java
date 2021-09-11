/**
 * @author - Dhyey Shah
 * @problem - https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
 */
import java.util.*;

public class DayEight {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(map.get(s)!=null){
                System.out.println(s+"="+map.get(s));
            }
            else
                System.out.println("Not found");
        }
        in.close();
    }
}

