// Last updated: 5/9/2026, 11:30:04 AM
class Solution {
    public int[][] transpose(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int[][] res=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[j][i]=arr[i][j];
            }
        }
        return res;
    }
}