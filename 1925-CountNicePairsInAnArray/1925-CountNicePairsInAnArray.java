// Last updated: 5/9/2026, 11:27:23 AM
class Solution {
    public int countNicePairs(int[] nums) {
        int res=0,mod=(int)Math.pow(10,9)+7;
        Map<Integer,Integer> count=new HashMap<>();
        for(int n:nums){
            int rev=rev(n);
            int cur=count.getOrDefault(n-rev,0);
            count.put(n-rev,cur+1);
            res=(res+cur)%mod;
        }
        return res;
    }
    private int rev(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
}