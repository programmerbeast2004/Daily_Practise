// Last updated: 3/26/2026, 7:37:49 PM
1class Solution {
2    public int distributeCandies(int[] candyType) {
3        HashSet<Integer>set=new HashSet<>();
4        for(int c:candyType){
5            set.add(c);
6        }
7        return Math.min(set.size(),candyType.length/2);
8    }
9}