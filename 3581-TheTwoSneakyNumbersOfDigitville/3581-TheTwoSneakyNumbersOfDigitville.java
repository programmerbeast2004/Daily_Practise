// Last updated: 5/9/2026, 11:24:07 AM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int p=0;
        int[] s=new int[2];
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                s[p]=nums[i];
                p++;
            }
        }
        return s;
    }
}