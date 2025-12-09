import java.util.Stack;

class Solution {
    /**
     * 주어진 일일 온도 목록에서 다음으로 더 따뜻한 날을 기다려야 하는 일수를 계산합니다.
     * * @param temperatures 일일 온도를 나타내는 정수 배열
     * @return 각 날짜에 대해 다음 더 따뜻한 날까지 기다려야 하는 일수를 나타내는 배열
     */
    public int[] dailyTemperatures(int[] temperatures) {
        // 결과 배열을 초기화합니다. 자바의 기본값인 0으로 채워져 있습니다.
        // 0은 다음 더 따뜻한 날이 없음을 의미합니다.
        int n = temperatures.length;
        int[] answer = new int[n];
        
        // 인덱스를 저장할 스택을 생성합니다. 이 스택은 단조 감소하는 온도만을 유지합니다.
        // (즉, 스택에 저장된 인덱스가 가리키는 온도는 아래로 갈수록 커집니다.)
        Stack<Integer> stack = new Stack<>();
        
        // 배열을 순회하면서 각 날짜의 더 따뜻한 날을 찾습니다.
        for (int i = 0; i < n; i++) {
            int currentTemp = temperatures[i];
            
            // 1. 스택이 비어있지 않고, 현재 온도가 스택의 맨 위 인덱스(j)가 가리키는 온도보다 높다면,
            //    j 날짜의 다음 더 따뜻한 날을 찾은 것입니다.
            while (!stack.isEmpty() && currentTemp > temperatures[stack.peek()]) {
                // 2. 스택에서 이전 인덱스 j를 꺼냅니다.
                int prevIndex = stack.pop();
                
                // 3. answer[prevIndex]에 기다려야 할 일수(현재 인덱스 i - 이전 인덱스 prevIndex)를 저장합니다.
                answer[prevIndex] = i - prevIndex;
            }
            
            // 4. 현재 인덱스 i를 스택에 넣습니다. (새로운 단조 감소열의 시작 또는 유지)
            stack.push(i);
        }
        
        // 순회가 끝난 후 스택에 남아있는 인덱스들은 미래에 더 따뜻한 날이 없으므로
        // answer 배열에는 기본값 0이 그대로 유지됩니다.
        return answer;
    }
}