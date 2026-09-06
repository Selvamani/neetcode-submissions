class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, maxf = 0, result = 0;
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for(int r =0; r < s.length(); r++) {
            freqMap.put(s.charAt(r), freqMap.getOrDefault(s.charAt(r),0)+1);
            maxf = Math.max(maxf, freqMap.get(s.charAt(r)));
            while((r-l+1)-maxf > k) {
                freqMap.put(s.charAt(l),freqMap.get(s.charAt(l))-1);
                l++;
            }
            result = Math.max(result, r-l+1);
        } 
        return result;
    }
}
