import java.util.PriorityQueue;
import java.util.Queue;

public class SmallestNumberInInfiniteSet {
    private int min;
    private Queue<Integer> infiniteSet;
    public SmallestNumberInInfiniteSet() {
        infiniteSet = new PriorityQueue<Integer>();
        min = 1;
    }

    public int popSmallest() {
        if(!infiniteSet.isEmpty()) return infiniteSet.poll();
        return min++;
    }

    public void addBack(int num) {
        if(!infiniteSet.contains(num) && min>num){
            infiniteSet.add(num);
        }
    }
}
