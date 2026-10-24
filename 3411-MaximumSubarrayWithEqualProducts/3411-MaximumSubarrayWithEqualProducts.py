# Last updated: 10/24/2026, 11:03:33 AM
1from math import gcd,lcm
2class Solution:
3    def maxLength(self, nums: List[int]) -> int:
4        ans=0
5        for i in range(len(nums)):
6            p,g,l=1,0,1
7            for j in range(i,len(nums)):
8                p*=nums[j]
9                g=gcd(g,nums[j])
10                l=lcm(l,nums[j])
11
12                if p==l*g:
13                    ans=max(ans,j-i+1)
14                
15        return ans