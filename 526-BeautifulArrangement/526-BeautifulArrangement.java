// Last updated: 10/6/2025, 6:51:49 PM
class Solution {
    int ct=0;
    public int countArrangement(int n) {
        boolean[]visited=new boolean[n+1];
        helper(n,1,visited);
        return ct;
    }
    public void helper(int n, int pos, boolean[]visited){
        if(pos>n){
            ct++;
            return;
        }
        for(int i=1;i<=n;i++){
            if (!visited[i] && (i % pos == 0 || pos % i == 0)) {
                visited[i] = true;        // choose
                helper(n, pos + 1, visited);
                visited[i] = false;       // backtrack
            }
        }
    }
}