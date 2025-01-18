public class MaxConsecutiveOnes {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int zeroCount = 0;
        int maxSize = 0;
        for(int end = 0; end<nums.length; end++){
            if(nums[end]==0){
                zeroCount++;
            }
            while(zeroCount>k){
                if(nums[start]==0){
                    zeroCount--;
                }
                start++;
            }
            maxSize = Math.max(maxSize,end-start+1);
        }
        return maxSize;
    }
}
