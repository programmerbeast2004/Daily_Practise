// Last updated: 7/31/2025, 12:19:44 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=0) return 0;
        int p=1;;
		int ans=0;
        int c=0;
		for(int i=0;i<nums.length;i++) {
			p*=nums[i];
		    while(p>=k&&c<=i){
                p/=nums[c];
                c++;
            }
        ans+=(i-c+1);
        }
		return ans;
    }
}
