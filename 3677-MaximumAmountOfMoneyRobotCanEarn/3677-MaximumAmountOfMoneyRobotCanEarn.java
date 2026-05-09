// Last updated: 5/9/2026, 11:23:56 AM
class Solution {
    public int maximumAmount(int[][] grid) {
        int n=grid.length,m=grid[0].length;

        int[][][]dp=new int[n][m][3];

        for(int [][]row:dp){
            for(int[]col:row){
                Arrays.fill(col,Integer.MIN_VALUE);
            }
        }

        // start cell(0,0)

        // ---- START CELL (0,0) ----

// Case 1: no skips used (k = 0)
// → we must take the value
dp[0][0][0] = grid[0][0];

// Case 2: 1 skip allowed (k = 1)
// Case 3: 2 skips allowed (k = 2)
// → even if we haven’t used skip yet,
//   we still initialize with same value
//   (means: we reached here WITHOUT using skip yet)
dp[0][0][1] = grid[0][0];
dp[0][0][2] = grid[0][0];


// ---- Special case: starting cell is negative ----
if (grid[0][0] < 0) {

    // If we use a skip at start:
    // → we ignore the negative value
    // → total becomes 0 instead of negative

    dp[0][0][1] = 0; // used 1 skip
    dp[0][0][2] = 0; // used 1 skip (still have 1 left)
}

        //fill dp
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<=2;k++){
                    //Top
                    if(i>0 && dp[i-1][j][k] !=Integer.MIN_VALUE){
                        //option 1:take
                        dp[i][j][k]=Math.max(dp[i][j][k],dp[i-1][j][k]+grid[i][j]);
                        //option 2:skip
                        if(grid[i][j]<0 && k>0){
                            dp[i][j][k]=Math.max(dp[i][j][k],dp[i-1][j][k-1]);
                        }
                    }

                    //left
                    if(j>0 && dp[i][j-1][k] !=Integer.MIN_VALUE){
                        //option 1:take
                        dp[i][j][k]=Math.max(dp[i][j][k],dp[i][j-1][k]+grid[i][j]);
                        //option 2:skip
                        if(grid[i][j]<0 && k>0){
                            dp[i][j][k]=Math.max(dp[i][j][k],dp[i][j-1][k-1]);
                        }
                    }

                }
            }
        }
        return Math.max(
    dp[n-1][m-1][0],
    Math.max(dp[n-1][m-1][1], dp[n-1][m-1][2])
);
    }
}