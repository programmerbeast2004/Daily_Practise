// Last updated: 4/5/2026, 9:45:50 PM
1class Solution {
2    public boolean judgeCircle(String m) {
3        int x=0; int y=0;
4        for(char c:m.toCharArray()){
5            if(c=='U') y++;
6            else if(c=='D')y--;
7            else if(c=='R')x++;
8            else{
9                x--;
10            }
11        }
12        return x==0 && y==0;
13    }
14}