# Last updated: 6/7/2026, 8:45:18 AM
1from collections import deque
2class Solution(object):
3    def maximumSum(self, nums, m, l, r):
4        """
5        :type nums: List[int]
6        :type m: int
7        :type l: int
8        :type r: int
9        :rtype: int
10        """
11        n=len(nums)
12        pre=[0]*(n+1)
13
14        for i in range(n):
15            pre[i+1]=pre[i]+nums[i]
16
17        NEG=-10**18
18
19        dp=[[NEG]*(m+1) for _ in range(n+1)]
20
21        for i in range(n+1):
22            dp[i][0]=0
23        for k in range(1,m+1):
24            dq=deque()
25            for i in range(n+1):
26                j=i-l
27                if j>=0:
28                    val=dp[j][k-1]-pre[j]
29
30                    while dq and dq[-1][1]<=val:
31                        dq.pop()
32                    dq.append((j,val))
33
34                while dq and dq[0][0]<i-r:
35                    dq.popleft()
36
37                dp[i][k]=dp[i-1][k]
38
39                if dq:
40                    dp[i][k]=max(dp[i][k],pre[i]+dq[0][1])
41                
42        return max(dp[n][1:])
43        