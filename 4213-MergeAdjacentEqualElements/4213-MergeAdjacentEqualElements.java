// Last updated: 5/9/2026, 11:22:27 AM
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> list=new ArrayList<>();
        for(int num:nums){
            long curr=num;
            while(!list.isEmpty() && list.get(list.size()-1)==curr){
                curr+=list.remove(list.size()-1);
            }
            list.add(curr);
        }
        return list;
    }
}