// Last updated: 5/22/2026, 7:50:18 AM
1class Solution {
2    public boolean canBeEqual(int[] target, int[] arr) {
3        Arrays.sort(target);
4        Arrays.sort(arr);
5        return Arrays.equals(target,arr);
6    }
7}