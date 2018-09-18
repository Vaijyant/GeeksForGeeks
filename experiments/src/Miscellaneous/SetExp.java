package Miscellaneous;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExp {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(5, "Hello");
        map.put(2, "I");
        map.put(7, "There");
        map.put(1, "am");
        map.put(3, "Vaijyant");
        map.put(-1, "Vaijyant");

        Set<Integer> set = map.keySet();

        map.put(99, "Kim");

        System.out.println(set);
    }
}
