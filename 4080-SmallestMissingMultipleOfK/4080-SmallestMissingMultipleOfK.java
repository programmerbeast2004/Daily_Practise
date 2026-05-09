// Last updated: 5/9/2026, 11:23:16 AM
class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i*k)){
                return k*i;
            }
        }
        return nums[nums.length-1]+k;
    }
}