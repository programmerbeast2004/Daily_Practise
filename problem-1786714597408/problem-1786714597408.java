// Last updated: 8/14/2026, 7:06:37 PM
1class Solution {
2    public int maximumLengthSubstring(String s) {
3        int[] freq=new int[26];
4        int l=0;
5        int res=0;
6        for(int r=0;r<s.length();r++){
7            freq[s.charAt(r)-'a']++;
8            while(freq[s.charAt(r)-'a']>2){
9                freq[s.charAt(l)-'a']--;
10                l++;
11            }
12        
13        res=Math.max(res,r-l+1);
14        }
15        return res;
16    }
17}