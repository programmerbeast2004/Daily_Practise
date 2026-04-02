// Last updated: 4/2/2026, 6:57:38 AM
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        String c=s+s;
4        return c.substring(1,c.length()-1).contains(s);
5    }
6}