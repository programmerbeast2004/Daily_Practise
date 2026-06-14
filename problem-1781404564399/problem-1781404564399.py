# Last updated: 6/14/2026, 8:06:04 AM
1class Solution:
2    def checkGoodInteger(self, n: int) -> bool:
3        sum=0
4        dsum=0
5        while(n>0):
6            d=n%10
7            sum+=d
8            dsum+=d*d
9            n//=10
10        return (dsum-sum>=50)