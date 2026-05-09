// Last updated: 5/9/2026, 11:26:55 AM
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n !=original.length){
            int[][] Nans=new int[0][0];
            return Nans;
        }
        int[][] ans=new int[m][n];
        int idx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=original[idx++];
            }
        }
        return ans;
    }
}