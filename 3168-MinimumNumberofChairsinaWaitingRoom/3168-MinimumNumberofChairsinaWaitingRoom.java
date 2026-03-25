// Last updated: 3/26/2026, 3:19:38 AM
1class Solution {
2    public int minimumChairs(String s) {
3        int c=0;
4        int min=0;
5        for(char ch:s.toCharArray()){
6            if(ch=='E'){
7                c++;
8                min=Math.max(min,c);
9            }
10            else{
11                c--;
12            }
13        }
14        return min;
15    }
16}