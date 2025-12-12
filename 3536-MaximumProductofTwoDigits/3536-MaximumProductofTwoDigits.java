// Last updated: 12/12/2025, 10:03:32 PM
1class Solution {
2    public int maxProduct(int n) {
3        List<Integer> res=new ArrayList<>();
4        while(n>0){
5            res.add(n%10);
6            n/=10;
7        }
8        Collections.sort(res);
9        int size=res.size();
10        return res.get(size-1)*res.get(size-2);
11    }
12}