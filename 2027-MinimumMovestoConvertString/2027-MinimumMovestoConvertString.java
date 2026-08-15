// Last updated: 8/15/2026, 4:43:25 PM
1class Solution {
2    public int minimumMoves(String s) {
3        int m=0;
4        for(int i=0;i<s.length();i++){
5            if(s.charAt(i)=='X'){
6                m++;
7                i+=2;
8            }
9        }
10        return m;
11    }
12}