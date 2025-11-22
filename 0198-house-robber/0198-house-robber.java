
//  DP[i] = max(DP[i-1], DP[i-2] + nums[i])

class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int[] answer = new int[nums.length];
        if (len < 2){
            return nums[0];
        }

        answer[0] = nums[0];
        answer[1] = Math.max(nums[0], nums[1]);

        for (int i=2 ; i< len ; i++) {
            answer[i] = Math.max(answer[i-1], answer[i-2] + nums[i]);

        }

        return answer[len-1];
    }
}