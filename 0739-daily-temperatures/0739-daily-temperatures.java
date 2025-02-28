class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      int length = temperatures.length;
        int[] answer = new int[length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                answer[index] = i - index;
            }
            stack.push(i);
        }

        return answer;
    }
}