// Last updated: 1/19/2026, 11:49:19 PM
1class Solution {
2    public int longestBalanced(int[] nums) {
3        int n=nums.length;
4        int ans=0;
5        for(int i=0;i<n;i++){
6            Set<Integer> e=new HashSet<>();
7            Set<Integer> o=new HashSet<>();
8
9            for(int j=i;j<n;j++){
10                if(nums[j]%2==0){
11                    e.add(nums[j]);
12                }
13                else{
14                    o.add(nums[j]);
15                }
16                if(e.size()==o.size()){
17                    ans=Math.max(ans,j-i+1);
18                }
19            }
20            
21        }
22        return ans;
23    }
24}