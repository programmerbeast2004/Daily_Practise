// Last updated: 3/26/2026, 11:58:49 AM
1class Solution {
2    public int countBattleships(char[][] b) {
3        int m=b.length;
4        int n=b[0].length;
5        int c=0;
6        for(int i=0;i<m;i++){
7            for(int j=0;j<n;j++){
8                if(b[i][j]=='X'){
9                    if(i>0 && b[i-1][j]=='X')continue;
10                    if(j>0 && b[i][j-1]=='X')continue;
11                    c++;
12                }
13            }
14        }
15        return c;
16    }
17}