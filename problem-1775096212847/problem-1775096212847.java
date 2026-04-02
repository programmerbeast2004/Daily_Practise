// Last updated: 4/2/2026, 7:46:52 AM
1class Solution {
2    public int smallestNumber(int n) {
3        int x=n;
4        while((x&(x+1))!=0){
5            x++;
6        }
7        return x;
8    }
9}