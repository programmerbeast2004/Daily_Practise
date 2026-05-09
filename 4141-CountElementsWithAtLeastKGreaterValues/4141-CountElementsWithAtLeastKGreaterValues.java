// Last updated: 5/9/2026, 11:22:51 AM
class Solution {
    public int countElements(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<n;i++){
            int l=i+1, r=n-1,pos=n;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(nums[mid]>nums[i]){
                    pos=mid;
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            int cg=n-pos;
            if(cg>=k) ans++;
        }
        return ans;
    }
}