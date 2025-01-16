import java.util.Arrays;

public class MaxKPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        while (leftPointer < rightPointer) {
            int sum = nums[leftPointer] + nums[rightPointer];
            if (sum == k) {
                count++;
                leftPointer++;
                rightPointer--;
            } else if (sum > k) {
                rightPointer--;
            } else {
                leftPointer++;
            }
        }
        return count;
    }
}
