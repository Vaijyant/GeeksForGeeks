package Interview.CompanyA;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InfiniteList {

    public static final int ERR_CODE = -123;

    public static int commonDigit(List<Integer> list1, List<Integer> list2){

        Set<Integer> setA = new HashSet<Integer>();
        Set<Integer> setB = new HashSet<Integer>();

        int i = 0;

        while(list1.get(i) != ERR_CODE && list2.get(i) != ERR_CODE){

            if(setA.contains(list2.get(i)))
                return list2.get(i);

            if(setB.contains(list1.get(i)))
                return list1.get(i);


            setA.add(list1.get(i));
            setB.add(list2.get(i));

            i++;
        }

        return -1;

    }

}
