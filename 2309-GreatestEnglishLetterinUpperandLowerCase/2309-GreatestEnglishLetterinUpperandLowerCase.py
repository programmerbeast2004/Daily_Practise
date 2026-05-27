# Last updated: 5/27/2026, 11:37:07 PM
1class Solution:
2    def greatestLetter(self, s: str) -> str:
3        ans=""
4        for ch in set(s):
5            if ch.islower() and ch.upper() in s:
6                ans=max(ans,ch.upper())
7        return ans
8        