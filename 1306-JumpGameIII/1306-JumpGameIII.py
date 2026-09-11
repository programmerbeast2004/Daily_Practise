# Last updated: 9/12/2026, 1:39:54 AM
1class Solution:
2    def canReach(self, arr: List[int], start: int) -> bool:
3        n=len(arr)
4        vis=set()
5
6        def dfs(i:int)->bool:
7            if i<0 or i>=n or i in vis:
8                return False
9            if arr[i]==0:
10                return True
11            vis.add(i)
12            return dfs(arr[i]+i) or dfs(i-arr[i])
13        
14        return dfs(start)