// Last updated: 10/12/2025, 8:14:00 AM
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int s=0;
        int n=nums.length;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]) continue;

            int ct=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    ct++;
                    visited[j]=true;
                }
            }
            if(ct%k==0){
                s+=nums[i]*ct;
            }
        }
        return s;
    }
}