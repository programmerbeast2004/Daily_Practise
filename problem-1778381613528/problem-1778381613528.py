# Last updated: 5/10/2026, 8:23:33 AM
1class Solution(object):
2    def countWordOccurrences(self, chunks, queries):
3        """
4        :type chunks: List[str]
5        :type queries: List[str]
6        :rtype: List[int]
7        """
8        s="".join(chunks)
9        mp={}
10        n=len(s)
11        i=0
12
13        while i<n:
14            if not s[i].islower():
15                i+=1
16                continue
17            st=i
18            while i<n and (
19                s[i].islower() or (s[i]=='-' and i>st and i<n-1 and s[i-1].islower() and s[i+1].islower())
20            ):
21                i+=1
22            w=s[st:i]
23            mp[w]=mp.get(w,0)+1
24        ans=[]
25        for q in queries:
26            ans.append(mp.get(q,0))
27        return ans