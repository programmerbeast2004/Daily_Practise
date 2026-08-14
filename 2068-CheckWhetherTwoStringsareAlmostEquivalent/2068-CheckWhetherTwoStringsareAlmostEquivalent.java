// Last updated: 8/14/2026, 8:19:02 PM
1class Solution {
2    public boolean checkAlmostEquivalent(String w1, String w2) {
3        int freq[]=new int[26];
4        for(char c:w1.toCharArray()){
5            freq[c-'a']++;
6        }
7        for(char c:w2.toCharArray()){
8            freq[c-'a']--;
9        }
10        for(int x:freq){
11            if(Math.abs(x)>3){
12                return false;
13            }
14        }
15        return true;
16    }
17}