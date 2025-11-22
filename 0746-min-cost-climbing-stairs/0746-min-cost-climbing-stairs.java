import java.util.*;
import java.lang.*;

// 가작 작은 cost를 움직일 수 있어야 한다 .
// final answer(N) = min(cost[n-1], cost[n-2])
/**
- i 번째마다 최소값을 더한다. 
1. idx >= cost.length될 때까지 비교 
    - idx +1일 때
    - idx +2일 때
    - idx에 1 or 2 더하면 len 이상일 때  

 */
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int answer[] = new int[cost.length];
        int len = cost.length;
        answer[0] = cost[0];
        answer[1] = cost[1];


        for (int i=2; i < len; i++) {
            answer[i] = cost[i] + Math.min(answer[i-1], answer[i-2]);
        }

        return Math.min(answer[len-1], answer[len-2]);
    }
}