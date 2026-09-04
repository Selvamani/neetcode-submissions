class Solution {
    public boolean isPalindrome(String str) {
        int l=0, r=str.length()-1;
        while(l<=r) {
            char leftChar = str.charAt(l);
            char rightChar = str.charAt(r);
            if(!isAlphanumeric(leftChar)) {
                l++;
            } else if(!isAlphanumeric(rightChar)) {
                r--;
            } else {
                if(toLowerCase(leftChar)!=toLowerCase(rightChar)) {
                    return false;
                }
                l++;
                r--;
            }       
        }
        return true;
    }

    private boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || 
            (c >= 'A' && c <= 'Z') || 
            (c >= '0' && c <= '9');
    }

    private char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + 32); // Convert uppercase to lowercase via ASCII offset
        }
        return c;
    }
}
