public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int large  = Integer.MAX_VALUE;
        for(int num : nums){
            if(num<=small){
                small = num;
            } else if (num<=large) {
                large = num;
            }else{
                return true;
            }
        }
        return false;
    }
}
