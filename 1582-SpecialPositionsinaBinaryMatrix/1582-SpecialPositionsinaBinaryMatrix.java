// Last updated: 3/10/2026, 10:30:41 AM
1class Solution {
2    public int numSpecial(int[][] mat) {
3        int m=mat.length;
4        int n=mat[0].length;
5        int[]nr=new int[m];
6        int[]nc=new int[n];
7        for(int i=0;i<m;i++){
8            for(int j=0;j<n;j++){
9                if(mat[i][j]==1){
10                    nr[i]++;
11                    nc[j]++;
12                }
13            }
14        }
15        int ans=0;
16        for(int i=0;i<m;i++){
17            for(int j=0;j<n;j++){
18                if(mat[i][j]==1 && nr[i]==1 && nc[j]==1){
19                    ans++;
20                }
21            }
22        }
23        return ans;
24    }
25}