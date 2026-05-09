// Last updated: 5/9/2026, 11:27:07 AM
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(compare(mat,target)) return true;
        int c=2;
        while(c>=0){
            mat=rotate(mat);
            if(compare(mat,target))return true;
            c--;
        }
        return false;
    }
    public int[][] rotate(int[][]m){
        int n=m.length;
        int[][]r=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                r[n-1-j][i]=m[i][j];
            }
        }
        return r;
    }
    public boolean compare(int[][]m,int[][]n){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length;j++){
                if(m[i][j]!=n[i][j]) return false;
            }
        }
        return true;
    }
}