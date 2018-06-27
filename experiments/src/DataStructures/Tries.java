package DataStructures;


class TrieNode {
    TrieNode[] arr;
    boolean isEnd;

    // Initialize your data structure here.
    public TrieNode() {
        this.arr = new TrieNode[26];
    }

}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode p = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (p.arr[index] == null) {
                TrieNode temp = new TrieNode();
                p.arr[index] = temp;
                p = temp;
            } else {
                p = p.arr[index];
            }
        }
        p.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode p = searchNode(word);
        if(p==null){
            return false;
        }else{
            if(p.isEnd)
                return true;
        }

        return false;
    }

    public boolean startsWith(String prefix) {
        TrieNode p = searchNode(prefix);
        if(p==null){
            return false;
        }else{
            return true;
        }
    }


    public TrieNode searchNode(String s){
        TrieNode p = root;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            int index = c-'a';
            if(p.arr[index]!=null){
                p = p.arr[index];
            }else{
                return null;
            }
        }

        if(p==root)
            return null;

        return p;
    }

}

public class Tries {
    public static void main(String[] args) {

        Trie contact = new Trie();
        contact.insert("james");
        contact.insert("jamie");
        contact.insert("jasmine");
        contact.insert("victor");
        contact.insert("venelope");

        System.out.println("Search james: "+contact.search("james"));
        System.out.println("startsWith jam: "+contact.startsWith("jam"));
        System.out.println("Search victoria: "+contact.search("victoria"));
        System.out.println("startsWith victoria: "+contact.startsWith("victoria"));


    }
}
