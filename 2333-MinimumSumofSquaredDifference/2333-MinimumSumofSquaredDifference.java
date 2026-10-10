// Last updated: 10/11/2026, 4:06:58 AM
1class Solution {
2    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
3        int[] countDiff=new int[100001];
4        int n=nums1.length;
5
6        for(int i=0;i<n;i++){
7            int d=Math.abs(nums1[i]-nums2[i]);
8            countDiff[d]++;
9        }
10
11        long k=(long)(k1+k2);
12
13        for(int curr=100000;curr>0 && k>0;curr--){
14            int countOps=(int)Math.min(countDiff[curr],k);
15            countDiff[curr]-=countOps;
16            countDiff[curr-1]+=countOps;
17            k-=countOps;
18        }
19
20        long res=0;
21
22        for(int d=1;d<=100000;d++){
23            res+=(long)countDiff[d]*d*d;
24        }
25
26        return res;
27
28    }
29}