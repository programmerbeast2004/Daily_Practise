# Last updated: 5/9/2026, 11:21:50 AM
class Solution(object):
    def compareBitonicSums(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=len(nums)
        peak=0
        for i in range(1,n):
            if nums[i]>nums[i-1]:
                peak=i
            else:
                break

        asc=sum(nums[:peak+1])
        dsc=sum(nums[peak:])

        if asc >dsc:
            return 0
        elif dsc>asc:
            return 1
        else:
            return -1
        