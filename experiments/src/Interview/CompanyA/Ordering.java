package Interview.CompanyA;

import java.util.HashMap;
import java.util.Map;

public class Ordering {

    public static void main(String[] args) {
        String p = "abc";
        String s = "baabbbcccc";

        System.out.println(ordering(p, s));
    }

    public static boolean ordering(String p, String s) {

        Map<Character, Integer> orderMap = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            orderMap.put(p.charAt(i), i);
        }

        int max = -1;

        for (int i = 0; i < s.length(); i++) {

            char key = s.charAt(i);
            int orderIdx = orderMap.getOrDefault(key, max);

            if (orderIdx < max) {
                return false;
            }
            max = orderIdx;
        }
        return true;
    }
}