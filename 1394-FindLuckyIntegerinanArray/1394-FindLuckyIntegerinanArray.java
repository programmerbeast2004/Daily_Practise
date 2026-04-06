// Last updated: 4/6/2026, 8:22:03 AM
1class Solution {
2    public int findLucky(int[] arr) {
3        int[]f=new int[501];
4        for(int num:arr){
5            f[num]++;
6        }
7        for(int i=500;i>0;i--){
8            if(f[i]==i){
9                return i;
10            }
11        }
12        return -1;
13
14    }
15}