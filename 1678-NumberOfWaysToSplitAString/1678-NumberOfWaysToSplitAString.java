// Last updated: 5/9/2026, 11:27:58 AM
class Solution {
    public int numWays(String s) {
        int MOD = 1000000007;
        int n=s.length();
        int ones=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1')ones++;
        }
        if(ones%3!=0)return 0;
        if(ones==0){
            long ways=(long)(n-1)*(n-2)/2;
            return (int)(ways%MOD);
        }
        int k=ones/3;
        int count=0;
        long first=0;
        long second=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1') count++;
            if(count==k) first++;
            else if(count==2*k) second++;
        }
        return (int)((first*second)%MOD);
    }
}