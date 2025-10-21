import java.util.*;

class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] strArr = s.split("\\s+");
        StringBuilder answer = new StringBuilder();

        for (int i= strArr.length -1 ; i >= 0 ; i--) {
            String str = strArr[i];

            answer.append(str);
              if (i > 0) answer.append(" ");


        }
        return answer.toString();

    }

}