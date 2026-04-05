// Last updated: 4/5/2026, 8:11:38 AM
1class Solution {
2    public int mirrorFrequency(String s) {
3        int res=0;
4        int[]freq=new int[128];
5        for(char c:s.toCharArray()){
6            freq[c]++;
7        }
8        for(char c='a';c<='z';c++){
9            char m=(char)('a'+('z'-c));
10            if(c<=m){
11                res+=Math.abs(freq[c]-freq[m]);
12            }
13        }
14        for(char c='0';c<='9';c++){
15            char m=(char)('0'+('9'-c));
16            if(c<=m){
17                res+=Math.abs(freq[c]-freq[m]);
18            }
19        }
20        return res;
21    }
22}