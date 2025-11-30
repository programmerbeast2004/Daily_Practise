// Last updated: 11/30/2025, 8:30:16 AM
1class Solution {
2    public int countElements(int[] nums, int k) {
3        int n=nums.length;
4        Arrays.sort(nums);
5        int ans=0;
6        for(int i=0;i<n;i++){
7            int l=i+1, r=n-1,pos=n;
8            while(l<=r){
9                int mid=l+(r-l)/2;
10                if(nums[mid]>nums[i]){
11                    pos=mid;
12                    r=mid-1;
13                }
14                else{
15                    l=mid+1;
16                }
17            }
18            int cg=n-pos;
19            if(cg>=k) ans++;
20        }
21        return ans;
22    }
23}