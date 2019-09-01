package Miscellaneous;

import java.util.*;

public class SetExp {
    public static void main(String[] args){
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(5, "Tomar");
        map.put(2, "I");
        map.put(1, "Hello");
        map.put(3, "am");
        map.put(4, "Vaijyant");

        Set<Integer> set = map.keySet();

        map.put(99, "Java");



        System.out.println(set);
    }
}
