# Last updated: 5/9/2026, 11:23:27 AM
class Solution:
    def removeSubstring(self, s: str, k: int) -> str:
        pat = "(" * k + ")" * k
        while(pat in s):
            s=s.replace(pat,"")
        return s

        