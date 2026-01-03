// Last updated: 1/3/2026, 8:21:24 PM
1class Solution {
2    public String reversePrefix(String s, int k) {
3        char[] arr=s.toCharArray();
4        int i=0 , j=k-1;
5        while(i<j){
6            char temp=arr[i];
7            arr[i]=arr[j];
8            arr[j]=temp;
9            i++;
10            j--;
11        }
12        return new String(arr);
13    }
14}