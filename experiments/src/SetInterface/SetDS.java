package SetInterface;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDS {
    public static void main(String[] args) {

        // Set demonstration using HashSet
        Set<String> set = new HashSet<String>();
        set.add("Zebra");
        set.add("Yankee");
        set.add("Alpha");
        set.add("Bravo");
        set.add("Alpha");
        System.out.print("Set output without the duplicates");

        System.out.println(set);

        // Set demonstration using TreeSet
        System.out.print("Sorted Set after passing into TreeSet");
        Set<String> sortedSet = new TreeSet<String>(set);
        System.out.println(sortedSet);

    }
}
