// Last updated: 3/29/2026, 1:11:25 AM
1class Solution {
2    public int numberOfSteps(int num) {
3        int c=0;
4        while(num!=0){
5            if(num%2==0){
6                num=num/2;
7                c++;
8            }
9            else{
10                num=num-1;
11                c++;
12            }
13        }
14        return c;
15    }
16}