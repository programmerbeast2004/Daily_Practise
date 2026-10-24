// Last updated: 10/24/2026, 2:45:15 PM
1class Solution {
2    public int countGoodSubstrings(String s) {
3        char[] str=s.toCharArray();
4        int c=0;
5        for(int i=0;i<str.length-2;i++){
6            if(str[i]!=str[i+1] && str[i]!=str[i+2] && str[i+1]!=str[i+2] ){
7                c++;
8            }
9        }
10        return c;
11    }
12}