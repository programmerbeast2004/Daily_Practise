// Last updated: 3/27/2026, 8:33:03 AM
1class Solution {
2    public int[] findArray(int[] pre) {
3        int n=pre.length;
4        int[]arr=new int[n];
5        arr[0]=pre[0];
6        for(int i=1;i<n;i++){
7            arr[i]=pre[i]^pre[i-1];
8        }
9        return arr;
10    }
11}