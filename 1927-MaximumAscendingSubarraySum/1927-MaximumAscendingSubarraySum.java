// Last updated: 5/9/2026, 11:27:22 AM
class Solution {
    public int maxAscendingSum(int[] arr) {
        int curr=arr[0];
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            curr=arr[i]>arr[i-1] ? curr+arr[i]:arr[i];
            ans=Math.max(curr,ans);
        }
        return ans;
    }
}