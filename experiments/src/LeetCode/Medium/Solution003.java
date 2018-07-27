package LeetCode.Medium;

import java.util.HashSet;

public class Solution003 {

    /**
     * Longest substring with unique characters
     * Note: uncomment commented lines to return the longest substring
     */

    public static int lengthOfLongestSubstring(String str) {



        StringBuilder set = new StringBuilder();
        //String ansStr = "";

        int i = 0, size = 0;
        while (i < str.length()) {

            char ch = str.charAt(i);

            if (set.indexOf(ch + "") < 0) {
                set.append(ch);
                i++;
                if (set.length() > size) {
                    size = set.length();
                    //ansStr = set.toString();
                }

            } else {
                set.deleteCharAt(0);
            }
        }
        //System.out.println(ansStr);
        return size;
    }


    public int lengthOfLongestSubstring02(String s) {
        int i = 0, j = 0, max = 0;
        HashSet<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
