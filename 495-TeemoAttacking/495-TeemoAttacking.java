// Last updated: 3/26/2026, 1:01:05 PM
1class Solution {
2    public int findPoisonedDuration(int[] ts, int d) {
3        int total = 0;
4
5        for(int i = 0; i < ts.length - 1; i++) {
6            
7            if(ts[i+1] < ts[i] + d) {
8                total += ts[i+1] - ts[i]; // overlap
9            } else {
10                total += d; // no overlap
11            }
12        }
13
14        return total + d; // last attack
15    }
16}