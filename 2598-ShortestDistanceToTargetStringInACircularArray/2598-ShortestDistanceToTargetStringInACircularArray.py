# Last updated: 5/9/2026, 11:25:42 AM
class Solution(object):
    def closestTarget(self, words, target, startIndex):
        """
        :type words: List[str]
        :type target: str
        :type startIndex: int
        :rtype: int
        """
        n=len(words)
        ans=float('inf')
        for i in range(n):
            if words[i]==target:
                clockwise=(i-startIndex+n)%n
                anticlockwise=(startIndex-i+n)%n
                ans=min(ans,min(clockwise,anticlockwise))
        return ans if ans!=float('inf')else -1

        