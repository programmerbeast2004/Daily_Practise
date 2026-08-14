// Last updated: 8/14/2026, 11:43:39 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int p=0;
4        int n=word.length();
5        for(int i=0;i<n;i++){
6            p+=(i/8)+1;
7        }
8        return p;
9    }
10}