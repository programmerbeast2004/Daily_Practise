# Last updated: 12/29/2025, 3:14:29 PM
1class Solution:
2    def removeSubstring(self, s: str, k: int) -> str:
3        pat = "(" * k + ")" * k
4        while(pat in s):
5            s=s.replace(pat,"")
6        return s
7
8        