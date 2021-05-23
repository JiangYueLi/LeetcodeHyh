package LeetCode;

public class Tire {

    private class TireNode{
        private boolean isEnd;
        private TireNode[] next;
        public TireNode(){
            isEnd = false;
            next = new TireNode[26];
        }
    }
    private TireNode root;
    /** Initialize your data structure here. */
    public Tire() {
        root = new TireNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TireNode cur = root;
        for(int i = 0,len=word.length(),ch;i<len;i++)
        {
            ch = word.charAt(i) - 'a';
            if(cur.next[ch] == null)
            {
                cur.next[ch] = new TireNode();
            }
            cur = cur.next[ch];
        }
        cur.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TireNode cur = root;
        for(int i =0,len =word.length(),ch;i<word.length();i++)
        {
            ch = word.charAt(i)-'a';
            if(cur.next[ch] == null)
            {
                return false;
            }
            cur = cur.next[ch];
        }
        return cur.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TireNode cur = root;
        for(int i =0,len =prefix.length(),ch;i<prefix.length();i++)
        {
            ch = prefix.charAt(i)-'a';
            if(cur.next[ch] == null)
            {
                return false;
            }
            cur = cur.next[ch];
        }
        return true;
    }
}
