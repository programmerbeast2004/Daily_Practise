// Last updated: 1/20/2026, 12:58:16 PM
1class Solution {
2    public int numTeams(int[] rating) {
3        int n=rating.length;
4        int ans=0;
5        for(int j=1;j<n-1;j++){
6            int ls=0,rs=0,rg=0,lg=0;
7
8            for(int i=0;i<j;i++){
9                if(rating[i]<rating[j]) ls++;
10                else if(rating[i]>rating[j]) lg++;
11            }
12
13            for(int k=j+1;k<n;k++){
14                if(rating[k]<rating[j]) rs++;
15                else if(rating[k]>rating[j]) rg++;
16            }
17            ans+=ls*rg;
18            ans+=lg*rs;
19        }
20        return ans;
21    }
22}