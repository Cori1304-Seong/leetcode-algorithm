class Solution {
    public int[] countBits(int n) {
        int[] answer = new int[n+1];

        for (int i=0; i<= n;i++){
            answer[i] = getBinaryCount(i);
        }
        return answer;
    }

    private int getBinaryCount(int n){
        int oneCount = 0;
        
       
        while(n > 0){
            int rather = n %2;    
            n = n/2;
            if (rather ==1) oneCount++;
            // System.out.print(rather);
        }
        // System.out.println();
        // if (n % 2 ==1) oneCount++;
        return oneCount;

    }
}