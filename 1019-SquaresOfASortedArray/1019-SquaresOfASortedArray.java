// Last updated: 5/9/2026, 11:29:25 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] sq=new int[n];
        for(int i=0;i<n;i++){
            sq[i]=(int)Math.pow(nums[i],2);
        }
        Arrays.sort(sq);
        return sq;
    }
}