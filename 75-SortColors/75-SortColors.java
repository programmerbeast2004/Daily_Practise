// Last updated: 7/31/2025, 12:21:48 PM
class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int i=0;
        while(i<=right){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[left];
                nums[left]=temp;
                left++;
                i++;
            }
            else if(nums[i]==2){
                int temp=nums[i];
                nums[i]=nums[right];
                nums[right]=temp;
                right--;
            }
            else{
                i++;
            }
        }
    }
}