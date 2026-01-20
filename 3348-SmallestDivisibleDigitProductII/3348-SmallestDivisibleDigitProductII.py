# Last updated: 1/20/2026, 11:05:54 AM
1def fill(req, length):
2    # smallest zf atleast this length divisible by req
3    ans = []
4    for d in range(9, 1, -1):
5        while req % d == 0:
6            ans.append(d)
7            req //= d
8    
9    ans.extend([1] * max(0, length - len(ans)))
10    return "".join(map(str, reversed(ans)))
11
12class Solution:
13    def smallestNumber(self, S: str, T: int) -> str:
14        N = len(S)
15        t = T
16        for p in [2, 3, 5, 7]:
17            while t % p == 0:
18                t //= p
19        if t != 1:
20            return "-1"
21
22        P = [T] * (N + 1)
23        for i, x in enumerate(map(int, S)):
24            if x == 0: break
25            P[i + 1] = P[i] // gcd(P[i], x)
26        if P[-1] == 1:
27            return S
28
29        zero = S.find("0") % N
30        for i in range(zero, -1, -1):
31            req = P[i]
32            digits = N - 1 - i
33            for d in range(int(S[i]) + 1, 10):
34                ending = fill(req // gcd(req, d), digits)
35                if len(ending) <= digits:
36                    return S[:i] + str(d) + ending
37
38        return fill(T, len(S) + 1)