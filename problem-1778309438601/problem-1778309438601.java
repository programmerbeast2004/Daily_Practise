// Last updated: 5/9/2026, 12:20:38 PM
1class Solution {
2    public boolean checkValid(int[][] matrix) {
3        int n=matrix.length;
4        for(int i=0;i<n;i++){
5            HashSet<Integer>r=new HashSet<>();
6            HashSet<Integer>c=new HashSet<>();
7            for(int j=0;j<n;j++){
8                r.add(matrix[i][j]);
9                c.add(matrix[j][i]);
10            }
11            if(r.size()!=n || c.size()!=n){
12                return false;
13            }
14        }
15        return true;
16    }
17}