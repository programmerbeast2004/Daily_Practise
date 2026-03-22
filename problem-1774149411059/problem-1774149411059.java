// Last updated: 3/22/2026, 8:46:51 AM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int o=0,e=0;
4        int minEven=Integer.MAX_VALUE,minOdd=Integer.MAX_VALUE;
5        for(int x:nums1){
6            if(x%2==0){
7                e++;
8                minEven=Math.min(minEven,x);
9            }
10            else{
11                o++;
12                minOdd=Math.min(minOdd,x);
13            }
14        }
15        if(o==0 || e==0)return true;
16        return (minEven-minOdd)>=1;
17    }
18}