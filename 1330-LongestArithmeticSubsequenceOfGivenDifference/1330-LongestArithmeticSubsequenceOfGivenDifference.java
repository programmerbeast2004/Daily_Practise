// Last updated: 5/9/2026, 11:28:50 AM
class Solution {
    public int longestSubsequence(int[] arr, int diff) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int x:arr){
            int prev=x-diff;
            int currl=map.getOrDefault(prev,0)+1;
            map.put(x,currl);
            ans=Math.max(ans,currl);
        }
        return ans;

    }
}