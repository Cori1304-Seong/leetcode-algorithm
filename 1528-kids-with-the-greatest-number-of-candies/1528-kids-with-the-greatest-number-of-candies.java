import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = 0;
        List<Boolean> answer = new ArrayList();


        for (int candy: candies) {
            if (greatest < candy) greatest = candy;
        }

        for (int i=0 ; i < candies.length; i++) {
            boolean x = candies[i] + extraCandies >= greatest ? true : false;
            answer.add(x);
        }


    
        return answer;
        
    }
}