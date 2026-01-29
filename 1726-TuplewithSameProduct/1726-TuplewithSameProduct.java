// Last updated: 1/29/2026, 3:12:33 PM
1class Solution {
2    public int tupleSameProduct(int[] nums) {
3        int n=nums.length;
4        HashMap<Integer,Integer> map=new HashMap<>();
5        for(int i=0;i<n;i++){
6            for(int j=i+1;j<n;j++){
7                int p=nums[i]*nums[j];
8                map.put(p,map.getOrDefault(p,0)+1);
9            }
10        }
11        int ans=0;
12        for(int c:map.values()){
13            if(c>1){
14                ans+=4*c*(c-1);
15            }
16
17        }
18        return ans;
19    }
20}