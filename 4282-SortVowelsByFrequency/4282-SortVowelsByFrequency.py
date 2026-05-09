# Last updated: 5/9/2026, 11:22:00 AM
class Solution(object):
    def sortVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        vowels=set("aeiouAEIOU")

        v=[c for c in s if c in vowels]

        freq=Counter(v)

        first_pos={}
        for i,c in enumerate(s):
            if c in vowels and c not in first_pos:
                first_pos[c]=i
        v.sort(key=lambda x:(-freq[x],first_pos[x]))

        res=list(s)
        j=0

        for i in range(len(res)):
            if res[i] in vowels:
                res[i]=v[j]
                j+=1

        return "".join(res)