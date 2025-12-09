import java.util.Stack;

class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
       int n = temperatures.length;
        int[] answer = new int[n];
        
        // 배열을 뒤에서부터 순회합니다.
        for (int i = n - 2; i >= 0; i--) {
            int j = i + 1; // 비교를 시작할 다음 날짜 인덱스
            
            // 현재 온도(temperatures[i])보다 더 따뜻한 날을 찾거나,
            // 배열의 끝에 도달할 때까지 반복합니다.
            while (true) {
                if (temperatures[i] < temperatures[j]) {
                    // 1. 더 따뜻한 날을 찾았을 때
                    answer[i] = j - i;
                    break;
                } else if (answer[j] == 0) {
                    // 2. j 날짜에서 더 따뜻한 날이 없다는 것은 
                    //    i 날짜에서도 더 이상 미래에 더 따뜻한 날이 없다는 뜻입니다.
                    answer[i] = 0;
                    break;
                } else {
                    // 3. j 날짜가 충분히 따뜻하지 않다면,
                    //    j 날짜의 다음 더 따뜻한 날 (answer[j] 일 후)로 바로 점프합니다.
                    //    j의 답이 이미 계산되었기 때문에 (i보다 미래에 있기 때문에) 가능합니다.
                    j = j + answer[j];
                }
            }
        }
        
        return answer;
    }
}