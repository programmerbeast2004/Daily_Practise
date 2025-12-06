// Last updated: 12/6/2025, 8:57:53 PM
1class Solution {
2    public long maxPoints(int[] technique1, int[] technique2, int k) {
3        int n=technique1.length;
4        long bs=0;
5        int[] diff=new int[n];
6        for(int i=0;i<n;i++){
7            bs+=technique2[i];
8            diff[i]=technique1[i]-technique2[i];
9        }
10        Arrays.sort(diff);
11        long ans=bs;
12        for(int i=n-1;i>=n-k;i--){
13            ans+=diff[i];
14        }
15        for(int i=n-k-1;i>=0;i--){
16            if(diff[i]>0){
17                ans+=diff[i];
18            }
19            else{
20                break;
21            }
22        }
23        return ans;
24    }
25}