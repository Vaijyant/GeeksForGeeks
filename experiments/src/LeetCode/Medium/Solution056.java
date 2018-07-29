package LeetCode.Medium;


import java.util.*;

/**
 * Merge intervals
 */

public class Solution056 {

    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {

        Collections.sort(intervals, (o1, o2) ->
                o1.start < o2.start ? -1 : o1.start == o2.start ? 0 : 1
        );

        List<Interval> merged = new LinkedList<Interval>();


        for (Interval interval : intervals) {
            if (merged.isEmpty() || ((LinkedList<Interval>) merged).getLast().end < interval.start) {
                merged.add(interval);
            } else {
                Interval endV = ((LinkedList<Interval>) merged).getLast();
                endV.end = Math.max(endV.end, interval.end);
            }
        }
        return merged;
    }
}
