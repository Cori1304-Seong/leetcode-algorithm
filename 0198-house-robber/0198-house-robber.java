import java.lang.*;

// final DP(n) = Max(nums[n] + DP(n-2), DP(n-1))
// 이유 작은 문제로 나누고 합치면 큰 문제를 해결할 수 있기 때문에

class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];

        if (len <= 1) {
            return nums[0];
        }

        answer[0] = nums[0];
        answer[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < len ; i++ ) {
            answer[i] = Math.max(answer[i-1], answer[i-2] + nums[i]);
        }

            // System.out.println(Arrays.toString(answer));

            return Math.max(answer[len-1], answer[len-2]) ;
    }
}