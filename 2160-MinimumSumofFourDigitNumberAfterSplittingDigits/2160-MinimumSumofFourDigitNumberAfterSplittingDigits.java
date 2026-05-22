// Last updated: 5/22/2026, 11:45:36 AM
1class Solution {
2    public int minimumSum(int num) {
3        int[]ans=new int[4];
4        for(int i=0;i<4;i++){
5            ans[i]=num%10;
6            num/=10;
7        }
8        Arrays.sort(ans);
9        int a1=ans[0]*10+ans[2];
10        int a2=ans[1]*10+ans[3];
11        return a1+a2;
12    }
13}