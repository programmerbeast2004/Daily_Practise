// Last updated: 7/31/2025, 12:20:32 PM
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int rep=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                rep=nums[i];
            }
        }
        return rep;
    }
}