// Last updated: 10/4/2026, 9:17:14 AM
1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3        long add=Long.MIN_VALUE/2;
4        long sub=Long.MIN_VALUE/2;
5        long delAdd=Long.MIN_VALUE/2;
6        long delSub=Long.MIN_VALUE/2;
7
8        long ans=Long.MIN_VALUE;
9
10        for(int x:nums){
11            long na=Math.max(x,sub+x);
12            long ns=add-x;
13
14            long nda=Math.max(delSub+x,add);
15            long nds=Math.max(delAdd-x,sub);
16
17            add=na;
18            sub=ns;
19            delAdd=nda;
20            delSub=nds;
21
22            ans=Math.max(ans,Math.max(add,Math.max(sub,Math.max(delAdd,delSub))));
23        }
24        return ans;
25    }
26}