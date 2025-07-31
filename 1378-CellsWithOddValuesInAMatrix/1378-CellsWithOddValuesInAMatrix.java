// Last updated: 7/31/2025, 12:18:58 PM
class Solution {
    public int oddCells(final int n, final int m, final int[][] indices) {
        int c=0;
        final int[] col=new int[m],row=new int[n];
        for(int[] x:indices){
            row[x[0]]++;
            col[x[1]]++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            if((row[i] + col[j]) % 2 != 0){
                    c++;
            }
            }
        }
        return c;
    }
}