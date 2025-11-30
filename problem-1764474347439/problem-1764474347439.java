// Last updated: 11/30/2025, 9:15:47 AM
1class Solution {
2    public int minMirrorPairDistance(int[] nums) {
3        Map<Integer,Integer> idx=new HashMap<>();
4        int ans=Integer.MAX_VALUE;
5        for(int j=0;j<nums.length;j++){
6            int x=nums[j];
7            if(idx.containsKey(x)){
8                int i=idx.get(x);
9                ans=Math.min(ans,j-i);
10            }
11            int r=reverse(x);
12            idx.put(r,j);
13        }
14        return ans==Integer.MAX_VALUE ? -1:ans;
15    }
16    private int reverse(int x){
17        int r=0;
18        while(x>0){
19            r=r*10+x%10;
20            x/=10;
21        }
22        return r;
23    }
24}