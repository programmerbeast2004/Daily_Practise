// Last updated: 12/5/2025, 7:12:26 PM
1class Solution {
2    public int countPartitions(int[] nums) {
3        int ts=0;
4        for(int i=0;i<nums.length;i++){
5            ts+=nums[i];
6        }
7        int l=0;
8        int c=0;
9        for(int i=0;i<nums.length-1;i++){
10            l+=nums[i];
11            int r=ts-l;
12            if((l%2)==(r%2)){
13                c++;
14            }
15        }
16        return c;
17    }
18}