package Interview;

import java.util.*;

public class RedBlueBlueRed {


    public static void str2FollowsStr2(String str1, String str2) {
        List<String> words = new LinkedList<>();
        getRepeatingWords(words, str2);

    }

    public static void getRepeatingWords(List<String> words, String str) {

        String set = "";
        for (int i = 0; i < str.length(); i++) {

            if (set.indexOf(str.charAt(i)) < 0) {
                set += str.charAt(i);
            }else{
                if(set.indexOf(str.charAt(i)) == 0){

                }
            }


        }


    }

    public static void main(String[] args) {

        String str1 = "abab";
        String str2 = "redblueredblue";

        str2FollowsStr2(str1, str2);
    }

}
