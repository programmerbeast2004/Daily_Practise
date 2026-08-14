// Last updated: 8/14/2026, 11:38:35 PM
1class Solution {
2    public int minimumOperations(int[] nums) {
3        Set<Integer> set=new HashSet<>();
4        for(int a:nums){
5            if(a>0){
6                set.add(a);
7            }
8        }
9        return set.size();
10    }
11}