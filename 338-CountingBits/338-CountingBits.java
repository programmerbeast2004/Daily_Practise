// Last updated: 2/25/2026, 12:31:19 AM
1class Solution {
2    public int[] countBits(int n) {
3        int[] ans=new int[n+1];
4        for(int i=0;i<=n;i++){
5            String b=Integer.toBinaryString(i);
6            int count=0;
7            for(char c:b.toCharArray()){
8                if(c=='1') count++;
9            }
10            ans[i]=count;
11        }
12        return ans;
13    }
14}