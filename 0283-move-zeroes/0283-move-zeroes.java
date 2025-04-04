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

        for (int i =0 ;i < len; i++){
            if (nums[i] == 0) zeroCount++;
        }

        int fitIdx = 0;
        for (int i = 0 ; i < len; i++) {
            if (fitIdx > len-1 - zeroCount)
                break;
            
            if (nums[i] == 0) continue;

            nums[fitIdx] = nums[i] ; 
            fitIdx++; 
        }

        while(zeroCount > 0){
            nums[len- zeroCount] = 0;
            zeroCount--;
        }
        // return nums;
        
    }
}