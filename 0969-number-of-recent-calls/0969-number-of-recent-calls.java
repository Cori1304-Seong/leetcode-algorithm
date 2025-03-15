/**  queue 선언
    1. ping(t) 호출되면 queue.add(t) 실행
    2. range=  [t-3000, t] 생성
    3. queue left부터 탐색해서 range안에 들어가지 못하는 값은 제거
      (range 안에 들어가는 node 발견할 때가지 반복)
    4. queue 갯수를 return;
 */

class RecentCounter {

    public int count =0;
    public Queue<Integer> queue = new LinkedList();
    public RecentCounter() {
        count = 0;
        
    }
    
    public int ping(int t) {
        int[] range = new int[2];

        range[0] = t-3000;
        range[1] = t;
        queue.offer(t);
        count ++; 
        
        while(true){
            int num = queue.peek();
            if ( num >= range[0] && num <= range[1]) break;

            queue.remove();
            count--;
        }
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */