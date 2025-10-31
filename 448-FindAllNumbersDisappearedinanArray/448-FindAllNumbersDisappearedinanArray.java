// Last updated: 10/31/2025, 9:43:24 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]>0){
                nums[idx]=-nums[idx];
            }
            
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res.add(i+1);
            }
        }
        return res;

        
    }
}