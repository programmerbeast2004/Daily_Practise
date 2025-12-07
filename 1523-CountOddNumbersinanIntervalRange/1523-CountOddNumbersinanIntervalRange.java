// Last updated: 12/7/2025, 6:32:13 AM
1class Solution {
2    public int countOdds(int low, int high) {
3        if(low%2==0)low++;
4        int c=0;
5        for(int i=low;i<=high;i+=2){
6            if(i%2!=0){
7                c++;
8            }
9        }
10        return c;
11    }
12}