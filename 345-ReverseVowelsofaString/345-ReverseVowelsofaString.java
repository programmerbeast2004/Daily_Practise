// Last updated: 12/12/2025, 9:47:12 PM
1class Solution {
2    public String reverseVowels(String s) {
3        char[] w=s.toCharArray();
4        int st=0;
5        int e=s.length()-1;
6        String v="aeiouAEIOU";
7        while(st<e){
8            while(st<e && v.indexOf(w[st])==-1){
9                st++;
10            }
11            while(st<e && v.indexOf(w[e])==-1){
12                e--;
13            }
14            char t=w[st];
15            w[st]=w[e];
16            w[e]=t;
17
18            st++;
19            e--;
20
21        }
22        return new String(w);
23    }
24}