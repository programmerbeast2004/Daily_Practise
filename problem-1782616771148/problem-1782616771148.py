# Last updated: 6/28/2026, 8:49:31 AM
1class Solution(object):
2    def filterOccupiedIntervals(self, occupiedIntervals, freeStart, freeEnd):
3        """
4        :type occupiedIntervals: List[List[int]]
5        :type freeStart: int
6        :type freeEnd: int
7        :rtype: List[List[int]]
8        """
9        occupiedIntervals.sort()
10
11        merged=[]
12        for s,e in occupiedIntervals:
13            if merged and s<=merged[-1][-1]+1:
14                merged[-1][1]=max(merged[-1][1],e)
15            else:
16                merged.append([s,e])
17
18        ans=[]
19        for s,e in merged:
20            if s<freeStart:
21                ans.append([s,min(e,freeStart-1)])
22            if e>freeEnd:
23                ans.append([max(s,freeEnd+1),e])
24        return ans        