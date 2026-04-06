// Last updated: 4/6/2026, 6:35:16 AM
1class Solution {
2    public int furthestDistanceFromOrigin(String m) {
3        int l=0,r=0,b=0;
4        for(char c:m.toCharArray()){
5            if(c=='L')l++;
6            else if(c=='R')r++;
7            else b++;
8        }
9        return (Math.abs(r-l)+b);
10    }
11}