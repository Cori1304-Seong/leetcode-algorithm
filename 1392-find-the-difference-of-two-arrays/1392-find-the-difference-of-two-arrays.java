import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // 배열 → Set (중복 제거)
        for (int n : nums1) set1.add(n);
        for (int n : nums2) set2.add(n);

        // nums1에만 있는 값
        List<Integer> only1 = new ArrayList<>();
        for (int n : set1) {
            if (!set2.contains(n)) {
                only1.add(n);
            }
        }

        // nums2에만 있는 값
        List<Integer> only2 = new ArrayList<>();
        for (int n : set2) {
            if (!set1.contains(n)) {
                only2.add(n);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(only1);
        answer.add(only2);

        return answer;
    }
}
