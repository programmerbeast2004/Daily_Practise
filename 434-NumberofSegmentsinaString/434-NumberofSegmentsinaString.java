// Last updated: 4/2/2026, 6:06:58 AM
1class Solution {
2    public int countSegments(String s) {
3        int c=0;
4        for(int i=0;i<s.length();i++){
5            if(s.charAt(i)!=' '&&(i==0 || s.charAt(i-1)==' ')){
6                c++;
7            }
8        }
9        return c;
10    }
11}