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
    // List<Integer> temp = new ArrayList(); // 중복되는 원소 저장 
    // answer.add(new ArrayList());
    // answer.add(new ArrayList());
    List<Integer> list1 = new ArrayList();
    List<Integer> list2 = new ArrayList();





    for (int n: nums1) {
        set1.add(n);
    }

    for (int n: nums2) {
        set2.add(n);
    }


    // for (int n: set1){
    //     if (set2.contains(n)){
    //         temp.add(n);
    //     }
    // }

    // for (int n:temp) {
    //     set1.remove(n);
    //     set2.remove(n);
    // }

    // 앞에 for문 2개를 없에 후 결과
    //     answer.get(0).add(n);
    // }

    // for(int n: set2){
    //     answer.get(1).add(n);
    // }


    // num1 답 추가 
    for(int n: set1){
        if (!set2.contains(n)) list1.add(n);
    }

    // num2 답 추가 
    for(int n: set2){
        if (!set1.contains(n)) list2.add(n);
    }


    list1.sort((a,b) -> a.compareTo(b));
    list2.sort((a,b) -> a.compareTo(b));

    answer.add(list1);
    answer.add(list2);


    return answer;
    }
}