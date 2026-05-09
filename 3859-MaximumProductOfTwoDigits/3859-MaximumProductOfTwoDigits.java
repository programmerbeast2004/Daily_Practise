// Last updated: 5/9/2026, 11:23:42 AM
class Solution {
    public int maxProduct(int n) {
        List<Integer> res=new ArrayList<>();
        while(n>0){
            res.add(n%10);
            n/=10;
        }
        Collections.sort(res);
        int size=res.size();
        return res.get(size-1)*res.get(size-2);
    }
}