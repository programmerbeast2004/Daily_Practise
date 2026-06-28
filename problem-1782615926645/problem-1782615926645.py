# Last updated: 6/28/2026, 8:35:26 AM
1class Solution(object):
2    def maxSum(self, nums, k, mul):
3        """
4        :type nums: List[int]
5        :type k: int
6        :type mul: int
7        :rtype: int
8        """
9        nums.sort(reverse=True)
10
11        ans=0
12        for i in range(k):
13            m=mul-i
14            x=nums[i]
15            ans+=max(x,x*m)
16
17        return ans
18        