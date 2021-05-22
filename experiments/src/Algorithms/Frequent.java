package Algorithms;// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED

import java.util.*;
import java.lang.Character;

// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Frequent {

    public static void main(String[] args) {
        Frequent frequent = new Frequent();

        List<String> list = new ArrayList<>();
        list.add("is");
        list.add("are");
        list.add("a");

        List<String> ans = frequent.retrieveMostFrequentlyUsedWords("Rose is a flower red rose are flower            ", list);

        for (String word : ans) {
            System.out.println(word);

        }
    }

    List<String> retrieveMostFrequentlyUsedWords(String helpText,
                                                 List<String> wordsToExclude) {
        List<String> frequentWords = new ArrayList<>();
        Map<String, Integer> wordCounterMap = new HashMap<>();
        Set<String> excludedWordSet = new HashSet<>();
        for (String word : wordsToExclude) excludedWordSet.add(word.toLowerCase());

        int maxCount = 0;

        StringBuilder bufferWord = new StringBuilder();
        for(int i=0; i<helpText.length(); i++){
            char ch = helpText.charAt(i);
            if (Character.isLetter(ch)) {
                bufferWord.append(Character.toLowerCase(ch));
            } else if (bufferWord.length() > 0 ||  i==helpText.length()-1) {

                String word = bufferWord.toString();

                if (!excludedWordSet.contains(word)) {
                    wordCounterMap.put(word, wordCounterMap.getOrDefault(word, 0) + 1);

                    if (wordCounterMap.get(word) >= maxCount) {
                        maxCount = wordCounterMap.get(word);
                    }
                }
                bufferWord = new StringBuilder();
            }
        }

        String word = bufferWord.toString();
        if (!excludedWordSet.contains(word)) {
            wordCounterMap.put(word, wordCounterMap.getOrDefault(word, 0) + 1);
            if (wordCounterMap.get(word) >= maxCount) {
                maxCount = wordCounterMap.get(word);

            }
        }


        for (Map.Entry<String, Integer> entrySet : wordCounterMap.entrySet()) {
            if (entrySet.getValue().equals(maxCount)) {
                frequentWords.add(entrySet.getKey());
            }
        }


        return frequentWords;
    }
    // METHOD SIGNATURE ENDS
}