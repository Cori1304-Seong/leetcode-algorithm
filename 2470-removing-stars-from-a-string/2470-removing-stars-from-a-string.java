import java.util.*;

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack();
        StringBuilder strBu = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                stack.pop();
                continue;
            }
            stack.add(c);
        }

        for (char c:stack){
            strBu.append(c);
        }

        return strBu.toString();
    }
}