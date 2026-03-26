// Last updated: 3/26/2026, 6:32:45 PM
1class Solution {
2    public int balancedStringSplit(String s) {
3        int c=0;
4        int b=0;
5        for(char ch:s.toCharArray()){
6            if(ch=='L')b++;
7            else b--;
8            if(b==0)c++;
9        }
10        return c;
11    }
12}