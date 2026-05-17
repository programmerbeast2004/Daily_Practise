// Last updated: 5/17/2026, 8:40:24 AM
1class Solution {
2    public boolean isAdjacentDiffAtMostTwo(String s) {
3        for(int i=0;i<s.length()-1;i++){
4            int a=s.charAt(i)-'0';
5            int b=s.charAt(i+1)-'0';
6            if(Math.abs(a-b)>2){
7                return false;
8            }
9        }
10        return true;
11    }
12}