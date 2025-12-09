import java.util.*;

/* 1차 회고
 stack 개념이 약하다. 푸는데 시간을 1시간 걸림,
 stack 사용 미숙으로 코드 배치에 시간 걸림
*/


class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack();
        int len = temperatures.length;
        int[] answer = new int[len];

        for (int i=0 ; i < len; i++) {
           while(!stack.isEmpty() && 
                    temperatures[stack.peek()] < temperatures[i]) {
                int idx = stack.pop();
                answer[idx] = i - idx; 
           }
           stack.push(i);
        }

        return answer;
    }
}