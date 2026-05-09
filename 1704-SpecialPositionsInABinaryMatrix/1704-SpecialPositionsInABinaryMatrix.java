// Last updated: 5/9/2026, 11:27:52 AM
class Solution {
    public int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[]nr=new int[m];
        int[]nc=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    nr[i]++;
                    nc[j]++;
                }
            }
        }
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1 && nr[i]==1 && nc[j]==1){
                    ans++;
                }
            }
        }
        return ans;
    }
}