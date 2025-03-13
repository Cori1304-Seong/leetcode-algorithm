
/**
answer[i] = all num - num[i]
1. 나누기 사용 금지
2. O(n) 알고리즘 구현하기 
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] answer = new int[nums.length];

        for (int i=0; i< nums.length;i++) answer[i] = 1;

        for (int i = 1 ;i < answer.length; i++){
            answer[i] = answer[i-1] * nums[i-1]; 
        }
        // System.out.println(Arrays.toString(answer));
        int rightNum = 1;
        for (int i= answer.length -1 ; i >= 0; i--){
            answer[i] *= rightNum;
            rightNum *= nums[i];
        }
        // System.out.println(Arrays.toString(answer));

        

        return answer;
    }
}