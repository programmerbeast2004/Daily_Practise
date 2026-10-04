// Last updated: 10/4/2026, 8:53:20 AM
1class Solution {
2    public int minRotations(int n, String s) {
3        int ans=0;
4
5        int prev=0;
6        for(int i=0;i<n;i++){
7            int cur=s.charAt(i)-'0';
8            ans+=dist(prev,cur);
9            prev=cur;
10        }
11
12        int best=ans;
13        int last=s.charAt(n-1)-'0';
14
15        for(int i=0;i<n;i++){
16            int cur=s.charAt(i)-'0';
17            int before=(i==0)?0:s.charAt(i-1)-'0';
18
19            int oe=dist(before,cur);
20            int ne=dist(before,last);
21
22            best=Math.min(best,ans-oe+ne);
23        }
24        return best;
25    }
26    private int dist(int a,int b){
27        int d=Math.abs(b-a);
28        return Math.min(d,10-d);
29    }
30}