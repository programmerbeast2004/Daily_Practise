// Last updated: 11/9/2025, 8:40:57 AM
class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer,List<Integer>> pos=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            pos.computeIfAbsent(nums[i],k -> new ArrayList<>()).add(i);
        }
        int ans=Integer.MAX_VALUE;
        for(List<Integer> p:pos.values()){
            for(int i=2;i<p.size();i++){
                ans=Math.min(ans,2*(p.get(i)-p.get(i-2)));
            }
        }
        return ans==Integer.MAX_VALUE ? -1:ans;
    }
}