// Last updated: 8/16/2026, 9:12:27 AM
1class Solution {
2    public int maximumGap(String skill, String station) {
3        int n=skill.length();
4
5        int[]left=new int[n];
6        int[]right=new int[n];
7
8        int j=0;
9
10        for(int i=0;i<n;i++){
11            while(station.charAt(j)!=skill.charAt(i)){
12                j++;
13            }
14            left[i]=j;
15            j++;
16        }
17
18        j=station.length()-1;
19
20        for(int i=n-1;i>=0;i--){
21            while(station.charAt(j)!=skill.charAt(i)){
22                j--;
23            }
24            right[i]=j;
25            j--;
26        }
27
28        int ans=0;
29        for(int i=1;i<n;i++){
30            ans=Math.max(ans,right[i]-left[i-1]);
31        }
32
33        return ans;
34    }
35}