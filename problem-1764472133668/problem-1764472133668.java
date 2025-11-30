// Last updated: 11/30/2025, 8:38:53 AM
1class Solution {
2    public int maxDistinct(String s) {
3        boolean[] used=new boolean[256];
4        int count=0;
5        for(char c:s.toCharArray()){
6            if(!used[c]){
7                count++;
8                used[c]=true;
9            }
10        }
11        return count;
12    }
13}