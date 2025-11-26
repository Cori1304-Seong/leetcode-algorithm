import java.lang.*;


// DP[m][n] = DP[m-1][m] + DP[m][n-1] 
class Solution {
    public int uniquePaths(int m, int n) {

        if (m == 1 || n ==1) return 1;

        int[][] map = new int[m][n];
        map[0][1] = 1;
        map[1][0] = 1;

        for (int i=0; i < m; i++)  map[i][0] = 1;
        

        for (int j=0; j < n; j++) map[0][j] = 1;
        



        for (int i=1 ; i < m ; i++) {
            for (int j= 1; j < n ; j++) {
                map[i][j] = map[i-1][j] + map[i][j-1];
            }
        }

        //         for (int i=0 ; i < m ; i++) {
        //     for (int j= 0; j < n ; j++) {
        //         System.out.printf("%d " ,map[i][j] );
        //     }
        //         System.out.printf("\n" );

        // }

        return map[m-1][n-1];
    }
}