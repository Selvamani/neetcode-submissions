class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones) {
            maxHeap.offer(stone);
        }
        while(maxHeap.size()>1) {
            int val1 = maxHeap.poll();
            int val2 = maxHeap.poll();
            if(val1>val2) {
                maxHeap.offer(val1 - val2);
            }            
        }
        maxHeap.offer(0);
        return maxHeap.peek();
    }
}
