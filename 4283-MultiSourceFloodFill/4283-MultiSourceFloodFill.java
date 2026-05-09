// Last updated: 5/9/2026, 11:21:58 AM
class Solution {
    public int[][] colorGrid(int n, int m, int[][] sources) {
        int[][]grid=new int[n][m];
        Queue<int[]>q=new LinkedList<>();

        for(int[]s:sources){
            int r=s[0],c=s[1],color=s[2];
            grid[r][c]=color;
            q.offer(new int[]{r,c,color});
        }
        int[][]dirs={{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
            int size=q.size();
            List<int[]>level=new ArrayList<>();

            for(int i=0;i<size;i++){
                level.add(q.poll());
            }
            level.sort((a,b)->b[2]-a[2]);
            for(int[]curr:level){
                int r=curr[0],c=curr[1],color=curr[2];
                for(int[]d:dirs){
                    int nr=r+d[0];
                    int nc=c+d[1];
                    if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]==0){
                        grid[nr][nc]=color;
                        q.offer(new int[]{nr,nc,color});
                    }
                }
            }
        }
        return grid;
    }
}