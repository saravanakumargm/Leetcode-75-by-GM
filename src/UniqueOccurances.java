import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueOccurances {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for(int i : map.values()){
            set.add(i);
        }
        return set.size() == map.size();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(new UniqueOccurances().uniqueOccurrences(arr));
    }
}
