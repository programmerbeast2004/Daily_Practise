// Last updated: 4/2/2026, 7:29:09 AM
1class Solution {
2    public int hammingDistance(int x, int y) {
3        int c=0;
4        int xor=x^y;
5        while(xor!=0){
6            xor=xor&(xor-1);
7            c++;
8        }
9    
10        return c;
11    }
12}