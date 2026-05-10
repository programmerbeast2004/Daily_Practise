// Last updated: 5/10/2026, 8:41:36 AM
1class Solution {
2    public long minArraySum(int[] nums) {
3        HashSet<Integer> set=new HashSet<>();
4        for(int x:nums)
5            set.add(x);
6
7        long sum=0;
8        for(int x:nums){
9            int best=x;
10            for(int d=1;d*d<=x;d++){
11                if(x%d==0){
12                    if(set.contains(d))
13                        best=Math.min(best,d);
14
15                    if(set.contains(x/d))
16                        best=Math.min(best,x/d);
17                }
18            }
19            sum+=best;
20        }
21        return sum;
22    }
23}