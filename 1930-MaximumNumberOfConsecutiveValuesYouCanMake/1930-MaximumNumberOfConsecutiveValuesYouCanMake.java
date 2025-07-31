// Last updated: 7/31/2025, 12:18:26 PM
class Solution {
    public int getMaximumConsecutive(int[] coins) {
        int n=coins.length;
        Arrays.sort(coins);
        int ans=1;
        for(int i=0;i<n;i++){
            if(coins[i]>ans) break;
            ans+=coins[i];
        }
        return ans;
    }
}