import java.util.PriorityQueue;

class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for(long num : nums)
            minHeap.add(num);
        int num = 0;
        while(minHeap.size() > 1 && minHeap.peek() < k){
            long x = minHeap.poll();
            long y = minHeap.poll();
            minHeap.add(Math.min(x, y) * 2 + Math.max(x, y));
            num++;
        }
        return num;
    }
}