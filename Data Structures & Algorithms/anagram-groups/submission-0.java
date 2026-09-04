class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagrams = new HashMap<>();
        for(String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);                
            anagrams.putIfAbsent(sortedString, new ArrayList<>());
            anagrams.get(sortedString).add(s);
        }
        return new ArrayList<>(anagrams.values());
    }
}
