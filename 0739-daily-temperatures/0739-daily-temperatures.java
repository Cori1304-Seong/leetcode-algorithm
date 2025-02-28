/* 1차 회고
 stack 개념이 약하다. 푸는데 시간을 1시간 걸림,
 stack 사용 미숙으로 코드 배치에 시간 걸림
*/


import java.util.Stack;

/* 
- for문 사용, temperatures 전체를 탐색
- 탐색하면서 stack에 집어 넣고 어떻게 뺄지 구현
- while에 stack empty이면 동작 안 하는 로직 꼭!! 기입

1. last in value가 temperatures[i] 보다 큰지 확인 
    - true: while문 동작 last in value pop() 후 int[] answer에 대입
    - false: while문 동작 멈춤
2. 1번 확인 후 Stack에 i 사입

*/
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int [temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i=0 ;i < temperatures.length; i++){
            while(!stack.isEmpty() &&  
                    temperatures[stack.peek()] < temperatures[i]){

                int idx = stack.pop();
                answer[idx] = i - idx;
            }

           stack.push(i);
        }

        return answer;
    }
}