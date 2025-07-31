// Last updated: 7/31/2025, 12:16:53 PM
class Solution {
    public static boolean isPrime(int num){
        if (num<2)
            return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        int start=0,end=nums.length-1;
        while(start<end){
            if(isPrime(nums[start]))
                break;
            start++;
        }
        while(end>=start){
            if(isPrime(nums[end]))
                break;
            end--;
        }
        return end-start;
    }
}