// Last updated: 1/5/2026, 8:32:43 AM
1class Solution {
2    public long maxMatrixSum(int[][] matrix) {
3        long sum=0;
4        int c=0;
5        int min=Integer.MAX_VALUE;
6        int n=matrix.length;
7        int m=matrix[0].length;
8        for(int i=0;i<n;i++){
9            for(int j=0;j<m;j++){
10                sum+=Math.abs(matrix[i][j]);
11                if(matrix[i][j]<0) c++;
12                min=Math.min(min,Math.abs(matrix[i][j]));
13            }
14        }
15        if(c%2==1) sum-=2*min;
16        return sum;
17    }
18}