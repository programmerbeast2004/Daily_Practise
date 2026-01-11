// Last updated: 1/11/2026, 8:17:18 AM
1class Solution {
2    public int residuePrefixes(String s) {
3        boolean[] seen=new boolean[26];
4        int dist=0;
5        int ans=0;
6        for(int i=0;i<s.length();i++){
7            char ch=s.charAt(i);
8            if(!seen[ch-'a']){
9                seen[ch-'a']=true;
10                dist++;
11            }
12            int len=i+1;
13            if(dist==len%3){
14                ans++;
15            }
16        }
17        return ans;
18    }
19}