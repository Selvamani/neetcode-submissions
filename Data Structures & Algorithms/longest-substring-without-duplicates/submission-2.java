class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, ans = 0;
        int[] lastVisited = new int[128];
        Arrays.fill(lastVisited, -1);
        for(int r = 0; r < s.length(); r++) {
            char current = s.charAt(r);
            if(lastVisited[current] >= l) {
                l = lastVisited[current] + 1;
            }
            lastVisited[current] = r;
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
}
