class Solution {
    public int mySqrt(int x) {
        int l = 0, h = x, result = 0;
        while(l<=h) {
            int mid = l + (h-l)/2;
            long square = (long) mid * mid;
            if(square == x) return mid;
            if(square > x) {
                h = mid - 1;
            } else {
                result = mid;
                l = mid + 1;
            }
        }
        return result;
    }
}