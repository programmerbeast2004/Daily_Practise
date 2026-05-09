// Last updated: 5/9/2026, 11:27:24 AM
class Solution {
    public int findCenter(int[][] edges) {
        int f0=edges[0][0];
        int f1=edges[0][1];
        int s0=edges[1][0];
        int s1=edges[1][1];

        if(f0==s0 || f0==s1){
            return f0;
        }
        else{
            return f1;
        }
    }
}