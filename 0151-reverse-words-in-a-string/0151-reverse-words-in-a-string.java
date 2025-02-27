import java.util.*;


class Solution {
    public String reverseWords(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr =s.split(" ");

        System.out.println(Arrays.toString(arr));

        for (int idx = arr.length -1; idx >= 0; idx--){
            if (arr[idx] != ""){
                if (answer.length() != 0)
                    answer.append(" ");
                answer.append(arr[idx]);
               
            }
        }
        return answer.toString();
    }
}