// Last updated: 7/31/2025, 12:18:32 PM
class Solution {
    public int sumOfUnique(int[] nums) {
        int[] freq=new int[101];int sum=0;
        for(int num:nums){
            freq[num]++;
        }
        for(int i=1;i<=100;i++){
            if(freq[i]==1){
                sum+=i;
            }
        }
        return sum;
    }
}