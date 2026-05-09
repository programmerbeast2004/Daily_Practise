// Last updated: 5/9/2026, 11:22:54 AM
class Solution {
    public long minCost(String s, int[] cost) {
        long t=0;
        for(int c:cost)t+=c;
        long ans=Long.MAX_VALUE;
        for(char ch='a';ch<='z';ch++){
            long sum=0;
            long m=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==ch){
                    sum+=cost[i];
                    m=Math.max(m,cost[i]);
                }
            }
            if(sum>0){
                ans=Math.min(ans,t-sum);
            }
        }
        return ans;
    }
}