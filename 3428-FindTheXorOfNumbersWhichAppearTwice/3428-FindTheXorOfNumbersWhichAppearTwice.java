// Last updated: 5/9/2026, 11:24:22 AM
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[]f=new int[51];
        for(int num:nums){
            f[num]++;
        }
        int res=0;
        for(int i=1;i<=50;i++){
            if(f[i]==2){
                res^=i;
            }
        }
        return res;
    }
}