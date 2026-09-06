class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length, cols = matrix[0].length;
        int l=0, h= rows*cols-1;
        while(l<=h) {
            int mid = l+(h-l)/2;
            int row=mid/cols, col=mid%cols;
            if(matrix[row][col]==target) {
                return true;
            } else if(matrix[row][col]<target) {
                l=mid+1;
            } else {
                h=mid-1;
            }
        }
        return false;
    }
}
