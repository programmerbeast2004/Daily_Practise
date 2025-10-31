// Last updated: 10/31/2025, 6:52:15 PM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]<0){
                res.add(idx+1);
            }
            nums[idx]=-nums[idx];
        }
        return res;

    }
}