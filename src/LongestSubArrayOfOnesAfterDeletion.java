public class LongestSubArrayOfOnesAfterDeletion {
    public int longestSubarray(int[] nums) {
        int start = 0;
        int maxSize = 0;
        int zeroCount = 0;
        for(int end = 0; end<nums.length;end++){
            if(nums[end]==0){
                zeroCount++;
            }
            while(zeroCount>1){
                if(nums[start]==0){
                    zeroCount--;
                }
                start++;
            }
            maxSize = Math.max(maxSize,end-start+1 - zeroCount);
        }
        return maxSize==nums.length ? nums.length-1 : maxSize;
    }
}
