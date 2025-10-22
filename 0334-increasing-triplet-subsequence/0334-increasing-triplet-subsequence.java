class Solution {
    public boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        long a1 = Long.MAX_VALUE; 
        long a2 = Long.MAX_VALUE; 
        long a3 = 0; 

        for (int num: nums){
            if (a1 >= num) {
                a1 = num;
            }

            else if (a2 >= num) {
                a2 = num;
            }

            else {
                a3 = num;
                return true;
            }
           

        }
        return false;
    }
}