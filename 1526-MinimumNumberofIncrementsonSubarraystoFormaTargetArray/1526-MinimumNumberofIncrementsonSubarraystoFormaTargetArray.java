// Last updated: 1/30/2026, 12:54:32 PM
1class Solution {
2    public int minNumberOperations(int[] target) {
3        int n=target.length;
4        int sum=target[0];
5        for(int i=1;i<n;i++){
6            if(target[i]>target[i-1]){
7                sum+=target[i]-target[i-1];
8            }
9        }
10        return sum;
11    }
12}