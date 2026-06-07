# Last updated: 6/7/2026, 8:26:00 AM
1class Solution:
2    def generateValidStrings(self, n: int, k: int) -> list[str]:
3        ans=[]
4
5        for mask in range(1<<n):
6            s=bin(mask)[2:].zfill(n)
7
8            if "11" in s:
9                continue
10
11            cost=0
12            for i in range(n):
13                if s[i]=='1':
14                    cost+=i
15
16            if cost<=k:
17                ans.append(s)
18
19        return ans