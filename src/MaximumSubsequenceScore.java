import java.util.PriorityQueue;

public class MaximumSubsequenceScore {
    class Pair{
        int key;
        int value;
        Pair(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    public long maxScore(int[] nums1, int[] nums2, int k) {
        long total = 0;
        long result = 0;

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> b.key - a.key);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < nums1.length; i++) {
            maxHeap.offer(new Pair(nums2[i], nums1[i]));
        }

        while (!maxHeap.isEmpty()) {
            Pair pair = maxHeap.poll();
            total += pair.value;
            minHeap.offer(pair.value);

            if (minHeap.size() > k) {
                total -= minHeap.poll();
            }

            if (minHeap.size() == k) {
                result = Math.max(result, total * pair.key);
            }
        }
        return result;
    }

}
