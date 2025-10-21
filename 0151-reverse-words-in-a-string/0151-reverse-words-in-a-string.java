import java.util.*;

class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        StringBuilder answer = new StringBuilder();
        for (int i= strArr.length -1 ; i >= 0 ; i--) {
            String str = strArr[i];

            if (str.contains(" ")) continue;

            if (i < strArr.length -1 && strArr[i].matches("[a-zA-Z0-9]+")  ) answer.append(" ");

            answer.append(str);


        }
        return answer.toString();

    }

}