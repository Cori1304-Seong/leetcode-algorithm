/**
1. 탐색해서 0 개수 구하기 
2. 0이 아닌 모든 수 앞으로 밀기
3. 뒤에 0 개수 만큼 0 더하기 
4. return
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        int len = nums.length;
        int insertIdx = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[insertIdx++] = num;
            }
        }

        while(insertIdx < len) nums[insertIdx++] = 0;

        

        
    }
}