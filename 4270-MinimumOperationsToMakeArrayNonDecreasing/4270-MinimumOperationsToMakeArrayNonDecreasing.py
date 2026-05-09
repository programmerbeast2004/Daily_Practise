# Last updated: 5/9/2026, 11:22:09 AM
class Solution(object):
    def minOperations(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        cost=0
        for i in range(len(nums)-1):
            if nums[i]>nums[i+1]:
                cost+=nums[i]-nums[i+1]
        return cost
        