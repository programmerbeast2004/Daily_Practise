// Last updated: 2/14/2026, 8:44:51 PM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder res=new StringBuilder();
4        for(String w:words){
5            int s=0;
6            for(char ch: w.toCharArray()){
7                s+=weights[ch-'a'];
8            }
9            int mod=s%26;
10            char mp=(char)('z'-mod);
11            res.append(mp);
12        }
13        return res.toString();
14    }
15}