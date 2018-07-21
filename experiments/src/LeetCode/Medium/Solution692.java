package LeetCode.Medium;

import java.util.*;


class Solution692 {
    /**
     * Return top k frequent words
     * Company: A
     */
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        List<String> candidates = new ArrayList(map.keySet());
        candidates.sort((first, second) -> map.get(first).equals(map.get(second)) ?
                first.compareTo(second) : map.get(second) - map.get(first));

        return candidates.subList(0, k);
    }

}