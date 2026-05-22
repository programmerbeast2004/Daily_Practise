// Last updated: 5/22/2026, 8:23:04 AM
1class Solution {
2    public double trimMean(int[] arr) {
3        int n=arr.length;
4        int off=5*n/100;
5        int st=off;
6        int ed=n-off;
7        double t=ed-st;
8        double sum=0;
9        Arrays.sort(arr);
10        for(int i=st;i<ed;i++){
11            sum+=arr[i];
12        }
13        return sum/t;
14    }
15}