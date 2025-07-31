// Last updated: 7/31/2025, 12:21:02 PM
class Solution {
    public int majorityElement(int[] nums) {
        int curr=nums[0];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(curr==nums[i]){
                c++;
            }
            else{
                c--;
            }
            if(c==-1){
                curr=nums[i];
                c=0;
            }
        }
       return curr;
    }
}