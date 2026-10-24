// Last updated: 10/24/2026, 6:02:13 PM
1class Solution {
2    public char findKthBit(int n, int k) {
3        if(n==1){
4            return '0';
5        }
6
7        int len=(1<<n)-1;
8        int mid=(len/2)+1;
9
10        if(k==mid){
11            return '1';
12        }
13        else if(k<mid){
14            return findKthBit(n-1,k);
15        }
16        else{
17            int mk=len-k+1;
18            char bit=findKthBit(n-1,mk);
19            return bit=='0'?'1':'0';
20        }
21
22    }
23}