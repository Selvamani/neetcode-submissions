class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Count the frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }
        
        // 2. Create a Min-Heap (PriorityQueue)
        // We compare two integers (a, b) by their values in the map
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> freqMap.get(a) - freqMap.get(b)
        );

        // 3. Iterate through the map keys
        for (int n : freqMap.keySet()) {
            minHeap.add(n);
            // If heap size grows past k, remove the element with the LOWEST frequency
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // 4. Convert heap to the final result array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        return result;
    }
}
