public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; sum += nums[i++]) {
            if(sum*2 == total - nums[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,-1};
        System.out.println(new PivotIndex().pivotIndex(arr));
    }
}
