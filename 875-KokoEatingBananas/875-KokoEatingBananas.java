// Last updated: 9/26/2025, 3:01:36 PM
class Solution {
    public int minEatingSpeed(int[] piles, long h) {
        int lo=1;
        int hi=Integer.MIN_VALUE;
        int n=piles.length;
        for(int i=0;i<n;i++){
            hi=Math.max(hi,piles[i]);
        }
        int ans=hi;
        while(lo<=hi){
        int mid=lo+(hi-lo)/2;
        if(CanEat(piles,h,mid)){
            ans=mid;
            hi=mid-1;
        }
        else{
            lo=mid+1;
        }
        }
        return ans;
    }
    public boolean CanEat(int[] piles,long h,int mid){
        long hours=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            hours+=(piles[i]+mid-1)/mid;
        }
        if(hours>h){
            return false;
        }
        return true;
    }
}