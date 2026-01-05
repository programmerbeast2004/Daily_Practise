// Last updated: 1/5/2026, 4:15:22 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5        int l=0;
6        int r=m*n-1;
7        while(l<=r){
8            int mid=l+(r-l)/2;
9            int row=mid/n;
10            int col=mid%n;
11            int val=matrix[row][col];
12            if(val==target) return true;
13            else if(val<target) l=mid+1;
14            else r=mid-1;
15        }
16        return false;
17    }
18}