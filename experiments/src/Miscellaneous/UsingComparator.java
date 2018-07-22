package Miscellaneous;

import java.util.ArrayList;
import java.util.Comparator;

public class UsingComparator {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        list.add("James");
        list.add("Garry");
        list.add("Henry");
        list.add("Audrey");


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(4);
        list2.add(9);
        list2.add(3);


        System.out.println(list);
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                int j = second.compareTo(first);
                System.out.print(first + ", " + second + ": " + j + "\n");

                return j;
            }
        });
        System.out.println(list);


        System.out.println(list2);
        list2.sort((first, second) -> second - first);
        System.out.println(list2);


    }
}
