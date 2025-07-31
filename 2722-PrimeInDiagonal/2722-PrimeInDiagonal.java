// Last updated: 7/31/2025, 12:17:24 PM
class Solution {
    public int diagonalPrime(int[][] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(checkP(nums[i][i])){
                max=Math.max(max,nums[i][i]);
            }
            if (checkP(nums[i][nums.length - 1 - i])) {
                max = Math.max(max, nums[i][nums.length - 1 - i]);
            }
        }
        return max;
    }
    public boolean checkP(int num){
        if(num<2) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }
}