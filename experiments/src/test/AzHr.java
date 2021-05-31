package test;

import java.util.*;

public class AzHr {

    public static void main(String[] args) {

        List<List<String>> inputs = new ArrayList<>();
        List<String> input = new ArrayList<>();
        input.add("11100");
        input.add("11000");
        input.add("10100");
        input.add("00010");
        input.add("10000");
        inputs.add(input);

        input = new ArrayList<>();
        input.add("1000");
        input.add("0100");
        input.add("0010");
        input.add("0001");
        inputs.add(input);

        input = new ArrayList<>();
        input.add("1110");
        input.add("1100");
        input.add("1010");
        input.add("0001");
        inputs.add(input);

        for (List<String> in : inputs) System.out.println(count(in));

    }

    public static int count(List<String> relation) {
        int size = relation.size();

        char[][] relationM = new char[size][size];

        int i = 0;

        Map<Integer, Set<Integer>> group = new HashMap<>();

        for (String r : relation) {
            relationM[i++] = r.toCharArray();
        }


        for (int row = 0; row < size; row++) {
            for (int col = row; col < size; col++) {
                if (relationM[row][col] == '1') {
                    updateGroup(group, row, col);
                }
            }
        }

        return group.keySet().size();
    }

    private static void updateGroup(Map<Integer, Set<Integer>> map, int a, int b) {

        int key = 0;

        for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {

            key++;
            int setKey = entry.getKey();
            Set<Integer> setValue = entry.getValue();

            if (setValue.contains(a) || setValue.contains(b)) {
                key = setKey;
                break;
            }
        }
        map.put(key, map.getOrDefault(key, new HashSet<>()));
        map.get(key).add(a);
        map.get(key).add(b);
    }
}
