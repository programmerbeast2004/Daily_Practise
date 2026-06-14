# Last updated: 6/14/2026, 8:26:12 AM
1class Solution(object):
2    def maxRatings(self, units):
3        """
4        :type units: List[List[int]]
5        :rtype: int
6        """
7        if len(units[0])==1:
8           return sum(r[0] for r in units)
9        mn=[]
10        sec=[]
11        for r in units:
12            r.sort()
13            mn.append(r[0])
14            sec.append(r[1])
15        return sum(sec)-min(sec)+min(mn)
16        