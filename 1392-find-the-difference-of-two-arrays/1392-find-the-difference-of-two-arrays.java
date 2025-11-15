/**
1. nums1, nums2 원소를 HashSet에 집어 넣기
2. set1, set2가 서로 중복되는 원소가 있는지 체크
    - 중복 되는 원소가 있다면 set1, set2 모두 원소 삭제
3. 
 */
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    List<List<Integer>> answer = new ArrayList();
    Set<Integer> set1 = new HashSet();
    Set<Integer> set2 = new HashSet();   
    List<Integer> temp = new ArrayList(); // 중복되는 원소 저장

    answer.add(new ArrayList());
    answer.add(new ArrayList());


    for (int n: nums1) {
        set1.add(n);
    }

    for (int n: nums2) {
        set2.add(n);
    }


    for (int n: set1){
        if (set2.contains(n)){
            temp.add(n);
        }
    }

    for (int n:temp) {
        set1.remove(n);
        set2.remove(n);
    }

    for(int n: set1){
        answer.get(0).add(n);
    }

    for(int n: set2){
        answer.get(1).add(n);
    }

    answer.get(0).sort((a,b) -> a.compareTo(b));
    answer.get(1).sort((a,b) -> a.compareTo(b));


    return answer;
    }
}