// Last updated: 10/13/2025, 7:39:29 PM
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