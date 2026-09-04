class Solution {
    public int lastStoneWeight(int[] stones) {
         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones) {
            maxHeap.offer(stone);
        }
        while(maxHeap.size()>1) {
            maxHeap.offer(maxHeap.poll() - maxHeap.poll());
        }
        maxHeap.offer(0);
        return maxHeap.peek();
    }
}
