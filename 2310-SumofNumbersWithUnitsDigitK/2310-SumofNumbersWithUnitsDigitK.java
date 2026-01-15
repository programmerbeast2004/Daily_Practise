// Last updated: 1/15/2026, 10:28:01 PM
1class Solution {
2    public int minimumNumbers(int num, int k) {
3        if(num==0) return 0;
4        for(int x=1;x<=10;x++){
5            if((x*k)%10==num%10 && x*k<=num){
6                return x;
7            }
8        }
9        return -1;
10    }
11}