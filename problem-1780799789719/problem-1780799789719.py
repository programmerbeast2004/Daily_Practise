# Last updated: 6/7/2026, 8:06:29 AM
1class Solution:
2    def sumOfGoodIntegers(self, n: int, k: int) -> int:
3        ans=0
4        for x in range(max(1,n-k),n+k+1):
5            if(n & x)==0:
6                ans+=x
7        return ans