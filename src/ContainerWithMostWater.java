public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right  = height.length -1;
        while(left<right){
            int volume = right-left;
            int area = Math.min(height[right],height[left])*volume;
            max = Math.max(max,area);
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
