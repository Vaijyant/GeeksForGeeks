package MapInterface;

import java.util.Map;
import java.util.HashMap;

public class HashMapDS {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        printMap(map);

        map.put(1, "Vaijyant");
        map.put(2, "Vishal");
        map.put(3, "James");

        System.out.println("Size of map is: " + map.size());

        printMap(map);

        if (map.containsKey(2)) {
            String name = map.get(2);
            System.out.println("Value for key 2 is: " + name);
        }

        map.clear();
        printMap(map);

    }

    public static void printMap(Map<Integer, String> map) {


        if (map.isEmpty()) {
            System.out.println("map is empty.");
        } else {
            System.out.println(map);
        }
    }
}
