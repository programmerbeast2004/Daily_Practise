# Last updated: 7/5/2026, 8:44:43 AM
1class Solution(object):
2    def maxDigitRange(self, nums):
3        """
4        :type nums: List[int]
5        :rtype: int
6        """
7        mx=-1
8        ans=0
9
10        for x in nums:
11            t=x
12            if t==0:
13                d=0
14            else:
15                mn,mxd=9,0
16                while t:
17                    r=t%10
18                    mn=min(mn,r)
19                    mxd=max(mxd,r)
20                    t//=10
21                d=mxd-mn
22
23            if d>mx:
24                mx=d
25                ans=x
26            elif d==mx:
27                ans+=x
28
29        return ans