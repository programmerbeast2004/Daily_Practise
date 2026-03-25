// Last updated: 3/26/2026, 3:06:53 AM
1class Solution {
2    public int maxPower(String s) {
3        int max=1;
4        int cur=1;
5        for(int i=1;i<s.length();i++){
6            if(s.charAt(i)==s.charAt(i-1)){
7                cur++;
8                max=Math.max(max,cur);
9            }
10            else{
11                cur=1;
12            }
13        }
14        return max;
15    }
16}