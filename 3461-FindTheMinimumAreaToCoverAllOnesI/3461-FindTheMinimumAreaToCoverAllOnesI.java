// Last updated: 5/9/2026, 11:24:19 AM
class Solution {
    public int minimumArea(int[][] grid) {
        int maxR=-1;
        int minR=grid.length;
        int maxC=-1;
        int minC=grid[0].length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    if(i>=maxR) maxR=i;
                    if(i<=minR) minR=i;
                    if(j>=maxC) maxC=j;
                    if(j<=minC) minC=j;
                }
            }
        }
        System.out.println(minR+" "+maxR+" "+minC+" "+maxC);
        return (maxR-minR+1) *(maxC-minC+1);

    }
}