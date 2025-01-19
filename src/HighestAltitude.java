public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < gain.length; i++) {
            max = Math.max(max,sum);
            sum+=gain[i];
        }
        return Math.max(max,sum);
    }

    public static void main(String[] args) {
        int[] arr = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        System.out.println(new HighestAltitude().largestAltitude(arr));
    }
}
