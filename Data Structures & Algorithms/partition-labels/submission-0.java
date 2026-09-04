class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> lastIndex = new HashMap<>();
        for(int  i = 0 ; i < s.length(); i++) {
            lastIndex.put(s.charAt(i), i);
        }
        List<Integer> result = new ArrayList<>();
        int end = 0, size = 0;
        for (int i = 0; i < s.length(); i++) {
            size++;
            end = Math.max(lastIndex.get(s.charAt(i)), end);
            if(end == i) {
                result.add(size);
                size = 0;
            }
        
        }
        return result;
    }
}
