// Last updated: 10/11/2026, 12:01:22 PM
1class Solution {
2    public int countAsterisks(String s) {
3        boolean bar=false;
4        int c=0;
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)=='|'){
7                bar=!bar;
8            }
9            if(!bar && s.charAt(i)=='*'){
10                c++;
11            }
12        }
13        return c;
14    }
15}