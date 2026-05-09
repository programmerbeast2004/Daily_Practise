// Last updated: 5/9/2026, 11:29:43 AM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0, j=1, n=nums.length;
        int[] temp=new int[n];
        for(int x:nums){
        if(x%2==0){
            temp[i]=x;
            i+=2;
        }
        else{
            temp[j]=x;
            j+=2;
        }
        }
        return temp;
    }
}