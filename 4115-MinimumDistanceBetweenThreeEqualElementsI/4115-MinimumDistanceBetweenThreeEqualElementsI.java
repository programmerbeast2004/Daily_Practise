// Last updated: 5/9/2026, 11:23:02 AM
class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        int mind=Integer.MAX_VALUE;
        boolean found=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        int dist=Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                        mind=Math.min(dist,mind);
                        found=true;
                    }
                }
            }
        }
        return found ? mind:-1;
    }
}