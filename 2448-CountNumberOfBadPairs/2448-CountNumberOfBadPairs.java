// Last updated: 5/9/2026, 11:26:01 AM
class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;
        long t=(long)n*(n-1)/2;
        long g=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int v=nums[i]-i;
            if(map.containsKey(v)){
                g+=map.get(v);
            }
            map.put(v,map.getOrDefault(v,0)+1);
        }
        return t-g;

    }
}