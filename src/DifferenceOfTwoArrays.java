import  java.util.*;
public class DifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int j : nums1) {s1.add(j);}
        for (int j : nums2) {s2.add(j);}
        List<Integer> l1 = new ArrayList<>(s1);
        List<Integer> l2 = new ArrayList<>(s2);
        l1.removeAll(s2);
        l2.removeAll(s1);
        result.add(l1);
        result.add(l2);
        return result;
     }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3};
        int[] arr2 = {1,1,2,2};
        List<List<Integer>> result = new DifferenceOfTwoArrays().findDifference(arr1,arr2);
        for(List<Integer> list : result){
            System.out.println(list);
        }
    }
}
