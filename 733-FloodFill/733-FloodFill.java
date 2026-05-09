// Last updated: 5/9/2026, 11:30:46 AM
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original=image[sr][sc];
        if(original==color) return image;
        dfs(image,sr,sc,original,color);
        return image;

    }
    public void dfs(int[][] image, int i, int j, int original, int color){
        if(i<0 || j<0 || j>=image[0].length ||i>=image.length) return ;
        if(image[i][j]!=original) return;
        image[i][j]=color;
        dfs(image,i+1,j,original,color);
        dfs(image,i,j+1,original,color);
        dfs(image,i-1,j,original,color);
        dfs(image,i,j-1,original,color);

    }
}