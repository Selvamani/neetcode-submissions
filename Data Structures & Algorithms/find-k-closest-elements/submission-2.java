class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, h = arr.length - k;
        while(l<h) {
            int mid = l + (h-l)/2;
            if(x-arr[mid]<=arr[mid+k]-x) {
                h = mid;
            } else {
                l = mid+1;
            }
        }
        List<Integer> result =  new ArrayList<>();
        for(int i=l; i<l+k; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}