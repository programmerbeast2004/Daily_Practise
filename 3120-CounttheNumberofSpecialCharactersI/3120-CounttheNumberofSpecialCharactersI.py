# Last updated: 5/26/2026, 5:17:49 PM
1class Solution(object):
2    def numberOfSpecialChars(self, word):
3        """
4        :type word: str
5        :rtype: int
6        """
7        s=set(word)
8        c=0
9        for ch in "abcdefghijklmnopqrstuvwxyz":
10            if ch in s and ch.upper() in s:
11                c+=1
12        return c
13        