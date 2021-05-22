package test;

import java.util.*;
import java.util.stream.Collectors;

public class TestComparator {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());

        Map<String, Integer> map = new HashMap<>();
        map.put("asd", 1);

        List<String> result = map.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue())).limit(5).map(Map.Entry::getKey).collect(Collectors.toList());
    }



}

class SampleComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer integer, Integer t1) {
        return 0;
    }
}