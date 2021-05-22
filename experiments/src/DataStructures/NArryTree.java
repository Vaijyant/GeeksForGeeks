package DataStructures;


import java.util.HashMap;
import java.util.Map;


class NarryNode {
    Character value;
    Map<Character, NarryNode> nodesMap = new HashMap<>();

    NarryNode(Character value) {
        this.value = value;
    }
}


public class NArryTree {

    NarryNode root = new NarryNode(null);
    public void insertWord(String word) {

        for(char ch : word.toCharArray()) {

            NarryNode current = root;
            while(current.nodesMap.containsKey(ch)) {
                current = current.nodesMap.get(ch);
            }
            NarryNode newNode = new NarryNode(ch);
            current.nodesMap.put(ch, newNode);

        }



    }

}
