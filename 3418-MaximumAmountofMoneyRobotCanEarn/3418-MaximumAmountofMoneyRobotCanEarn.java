// Last updated: 4/3/2026, 9:06:46 AM
1class Solution {
2    public int maximumAmount(int[][] grid) {
3        int n=grid.length,m=grid[0].length;
4
5        int[][][]dp=new int[n][m][3];
6
7        for(int [][]row:dp){
8            for(int[]col:row){
9                Arrays.fill(col,Integer.MIN_VALUE);
10            }
11        }
12
13        // start cell(0,0)
14
15        // ---- START CELL (0,0) ----
16
17// Case 1: no skips used (k = 0)
18// → we must take the value
19dp[0][0][0] = grid[0][0];
20
21// Case 2: 1 skip allowed (k = 1)
22// Case 3: 2 skips allowed (k = 2)
23// → even if we haven’t used skip yet,
24//   we still initialize with same value
25//   (means: we reached here WITHOUT using skip yet)
26dp[0][0][1] = grid[0][0];
27dp[0][0][2] = grid[0][0];
28
29
30// ---- Special case: starting cell is negative ----
31if (grid[0][0] < 0) {
32
33    // If we use a skip at start:
34    // → we ignore the negative value
35    // → total becomes 0 instead of negative
36
37    dp[0][0][1] = 0; // used 1 skip
38    dp[0][0][2] = 0; // used 1 skip (still have 1 left)
39}
40
41        //fill dp
42        for(int i=0;i<n;i++){
43            for(int j=0;j<m;j++){
44                for(int k=0;k<=2;k++){
45                    //Top
46                    if(i>0 && dp[i-1][j][k] !=Integer.MIN_VALUE){
47                        //option 1:take
48                        dp[i][j][k]=Math.max(dp[i][j][k],dp[i-1][j][k]+grid[i][j]);
49                        //option 2:skip
50                        if(grid[i][j]<0 && k>0){
51                            dp[i][j][k]=Math.max(dp[i][j][k],dp[i-1][j][k-1]);
52                        }
53                    }
54
55                    //left
56                    if(j>0 && dp[i][j-1][k] !=Integer.MIN_VALUE){
57                        //option 1:take
58                        dp[i][j][k]=Math.max(dp[i][j][k],dp[i][j-1][k]+grid[i][j]);
59                        //option 2:skip
60                        if(grid[i][j]<0 && k>0){
61                            dp[i][j][k]=Math.max(dp[i][j][k],dp[i][j-1][k-1]);
62                        }
63                    }
64
65                }
66            }
67        }
68        return Math.max(
69    dp[n-1][m-1][0],
70    Math.max(dp[n-1][m-1][1], dp[n-1][m-1][2])
71);
72    }
73}