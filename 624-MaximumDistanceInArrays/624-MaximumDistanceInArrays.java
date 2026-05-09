// Last updated: 5/9/2026, 11:31:07 AM
class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int ans=0;
        int gmi=arrays.get(0).get(0);
        int gma=arrays.get(0).get(arrays.get(0).size()-1);
        for(int i=1;i<arrays.size();i++){
            List<Integer> arr=arrays.get(i);
            int cmi=arr.get(0);
            int cma=arr.get(arr.size()-1);
            ans=Math.max(ans,Math.abs(cma-gmi));
            ans=Math.max(ans,Math.abs(gma-cmi));

            gmi=Math.min(gmi,cmi);
            gma=Math.max(gma,cma);
        }
        return ans;

    }
}