// Last updated: 10/24/2026, 2:40:58 PM
1class Solution {
2    public int minLength(String s) {
3        while(s.contains("AB") || s.contains("CD")){
4            s=s.replace("AB","");
5            s=s.replace("CD","");
6        }
7        return s.length();
8    }
9}