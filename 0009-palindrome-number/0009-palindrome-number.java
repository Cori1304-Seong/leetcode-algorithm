class Solution {
    public boolean isPalindrome(int x) {
 
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10; 
            x /= 10; // x에서 마지막 자리 제거
        }

    
        return x == revertedNumber || x == revertedNumber / 10;
    }
}