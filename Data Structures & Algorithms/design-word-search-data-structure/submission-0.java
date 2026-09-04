class TrieNode {
    TrieNode[] children;
    boolean word;

    public TrieNode() {
        children = new TrieNode[26];
        word = false;
    }

}


public class WordDictionary {

    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode current = root;
        for(char c : word.toCharArray()) {
            int i = c - 'a';
            if(current.children[i] == null) {
                current.children[i] = new TrieNode();
            }
            current = current.children[i];
        }
        current.word = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int j, TrieNode root) {
        TrieNode current = root;
        for (int i = j; i < word.length(); i++) {
            char c = word.charAt(i);
            if(c=='.') {
                for(TrieNode child : current.children) {
                    if(child != null && dfs(word, i+1, child)) {
                        return true;
                    }
                }
                return false;
            } else {
                int cVal = c - 'a';
                if(current.children[cVal] == null) {
                    return false;
                }
                current = current.children[cVal];
            }            
        }
        return current.word;
    }
}
/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */