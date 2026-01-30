// Last updated: 1/30/2026, 1:32:23 PM
1class Solution {
2    public int findTheWinner(int n, int k) {
3        return solve(n,k)+1;
4    }
5    public int solve(int n,int k){
6        if(n==1) return 0;
7        return (solve(n-1,k)+k)%n;
8    }
9}