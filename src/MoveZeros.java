public class MoveZeros {
    public void moveZeroes(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[i] = arr[i] + arr[s] - (arr[s] = arr[i]);
                s++;
            }
        }
    }
}
