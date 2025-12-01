// Last updated: 12/1/2025, 9:54:53 AM
1class Solution {
2    public int maxDistance(List<List<Integer>> arrays) {
3        int ans=0;
4        int gmi=arrays.get(0).get(0);
5        int gma=arrays.get(0).get(arrays.get(0).size()-1);
6        for(int i=1;i<arrays.size();i++){
7            List<Integer> arr=arrays.get(i);
8            int cmi=arr.get(0);
9            int cma=arr.get(arr.size()-1);
10            ans=Math.max(ans,Math.abs(cma-gmi));
11            ans=Math.max(ans,Math.abs(gma-cmi));
12
13            gmi=Math.min(gmi,cmi);
14            gma=Math.max(gma,cma);
15        }
16        return ans;
17
18    }
19}