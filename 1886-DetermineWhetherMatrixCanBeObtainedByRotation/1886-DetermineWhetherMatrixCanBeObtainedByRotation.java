// Last updated: 3/22/2026, 1:40:49 PM
1class Solution {
2    public boolean findRotation(int[][] mat, int[][] target) {
3        if(compare(mat,target)) return true;
4        int c=2;
5        while(c>=0){
6            mat=rotate(mat);
7            if(compare(mat,target))return true;
8            c--;
9        }
10        return false;
11    }
12    public int[][] rotate(int[][]m){
13        int n=m.length;
14        int[][]r=new int[n][n];
15        for(int i=0;i<n;i++){
16            for(int j=0;j<n;j++){
17                r[n-1-j][i]=m[i][j];
18            }
19        }
20        return r;
21    }
22    public boolean compare(int[][]m,int[][]n){
23        for(int i=0;i<m.length;i++){
24            for(int j=0;j<m.length;j++){
25                if(m[i][j]!=n[i][j]) return false;
26            }
27        }
28        return true;
29    }
30}