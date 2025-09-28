// Last updated: 9/28/2025, 6:45:56 PM
class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        Arrays.sort(nums);
        int l=1,h=nums[nums.length-1];
        int res=h;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(canDistribute(nums,maxOperations,mid)){
                res=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
            
        }
        return res;
    }
    public boolean canDistribute(int[] nums,int maxOperations,int mid){
        int opr=0;
        for(int i=nums.length-1;i>=0;i--){
        if(nums[i]<=mid){
            break;
        }
        opr += (nums[i] - 1) / mid;
            if (opr > maxOperations)
            {
                return false;
            } 
        }

        return true;
    }
}