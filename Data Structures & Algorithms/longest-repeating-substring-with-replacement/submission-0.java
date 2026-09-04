class Solution {
    public int characterReplacement(String s, int k) {
        int result = 0;
        HashMap<Character,Integer> freqHashMap = new HashMap<>();
        int l = 0;
        int maxf = 0;
        for (int r = 0; r < s.length(); r++) {
            freqHashMap.put(s.charAt(r), (freqHashMap.getOrDefault(s.charAt(r), 0) + 1));
            maxf = Math.max(maxf, freqHashMap.get(s.charAt(r)));
            while ((r - l + 1) - maxf > k) { 
                freqHashMap.put(s.charAt(l), freqHashMap.get(s.charAt(l)) - 1);
                l++;
            }
            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}
