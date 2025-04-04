class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int [nums.length];

        int preNum = 1;
        for (int i =0 ; i< answer.length ; i++){
            answer[i] = preNum;
            preNum *= nums[i];
        }

        preNum = nums[nums.length -1];
        for (int i = answer.length-1 -1 ; i >= 0 ;i--){
            answer[i] *= preNum;
            preNum *= nums[i];
        }


        return answer;
        
        
    }
}