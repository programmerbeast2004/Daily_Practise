// Last updated: 5/9/2026, 11:23:08 AM
class Solution {
    public int[] minOperations(int[] nums) {
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=minFD(nums[i]);
        }
        return res;
    }
    private int minFD(int n){
        if(minF(n)) return 0;
        int d=1;
        while(true){
            if(n-d >=0 && minF(n-d)) return d;
            if(minF(n+d)) return d;
            d++;
        }
    }
    private boolean minF(int n){
        String bin=Integer.toBinaryString(n);
        int l=0,r=bin.length()-1;
        while(l<r){
            if(bin.charAt(l++)!=bin.charAt(r--))return false;
        }
        return true;
    }
}