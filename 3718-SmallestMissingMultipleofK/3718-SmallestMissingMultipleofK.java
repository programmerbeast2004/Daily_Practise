// Last updated: 11/4/2025, 12:34:57 AM
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