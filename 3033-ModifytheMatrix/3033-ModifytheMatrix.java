// Last updated: 9/29/2025, 9:09:15 PM
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        for(int j=0;j<c;j++){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<r;i++){
                if(matrix[i][j]!=-1){
                    max=Math.max(max,matrix[i][j]);
                }
            }
            for(int i=0;i<r;i++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=max;
                }
            }

        }
        return matrix;
    }
}