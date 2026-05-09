// Last updated: 5/9/2026, 11:22:21 AM
class Solution {
    public int scoreDifference(int[] nums) {
        int p1=0;
        int p2=0;
        boolean f=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                f=!f;
            }
            if(i%6==5){
                f=!f;
            }
            if(f){
                p1+=nums[i];
            }
            else{
                p2+=nums[i];
            }
        }
        return p1-p2;
    }
}