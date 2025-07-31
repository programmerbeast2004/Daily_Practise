// Last updated: 7/31/2025, 12:17:01 PM
class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] != mat[i][(j+k) % n])
                    return false;
            }
        }
        return true;
    }
}