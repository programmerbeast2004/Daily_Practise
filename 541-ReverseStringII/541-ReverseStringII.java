// Last updated: 5/25/2026, 2:24:12 PM
1class Solution {
2    public String reverseStr(String s, int k) {
3        char[] arr=s.toCharArray();
4        int n=arr.length;
5        for(int i=0;i<n;i+=2*k){
6            int l=i;
7            int r=Math.min(i+k-1,n-1);
8            while(l<=r){
9                char temp=arr[l];
10                arr[l]=arr[r];
11                arr[r]=temp;
12                l++;
13                r--;
14            }
15
16        }
17        return new String(arr);
18    }
19}