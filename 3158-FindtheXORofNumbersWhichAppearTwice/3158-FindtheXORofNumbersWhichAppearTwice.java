// Last updated: 3/27/2026, 8:22:31 AM
1class Solution {
2    public int duplicateNumbersXOR(int[] nums) {
3        int[]f=new int[51];
4        for(int num:nums){
5            f[num]++;
6        }
7        int res=0;
8        for(int i=1;i<=50;i++){
9            if(f[i]==2){
10                res^=i;
11            }
12        }
13        return res;
14    }
15}