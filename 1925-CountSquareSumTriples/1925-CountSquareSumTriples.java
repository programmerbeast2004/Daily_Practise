// Last updated: 10/11/2026, 2:10:34 PM
1class Solution {
2    public int countTriples(int n) {
3        int count=0;
4
5        for(int a=1;a<=n;a++){
6            for(int b=1;b<=n;b++){
7                int c_sq=a*a+b*b;
8
9                int c=(int)Math.sqrt(c_sq);
10
11                if(c*c==c_sq && c<=n){
12                    count++;
13                }
14            }
15        }
16        return count;
17
18    }
19}