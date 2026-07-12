# Last updated: 7/12/2026, 9:21:50 AM
1class Solution:
2    def minimumCost(self, nums: list[int], k: int) -> int:
3        MOD=10**9+7
4
5        cur=k
6        ops=0
7        ans=0
8
9        for x in nums:
10            if cur<x:
11                need=(x-cur+k-1)//k
12
13                ans=(ans+need*(2*ops+need+1)//2)%MOD
14                ops+=need
15                cur+=need*k
16
17            cur-=x
18
19        return ans%MOD