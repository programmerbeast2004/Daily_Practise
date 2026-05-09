// Last updated: 5/9/2026, 11:23:31 AM
class Solution {
    public int earliestTime(int[][] tasks) {
        int minTime=Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++){
            int start=tasks[i][0];
            int end=tasks[i][1];
            int total=start+end;
            minTime=Math.min(minTime,total);
        }
        return(minTime);
    }
}