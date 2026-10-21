// Last updated: 10/21/2026, 5:23:49 PM
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        int c=0;
4        int n=stones.length();
5        int m=jewels.length();
6        for(int i=0;i<n;i++){
7            for(int j=0;j<m;j++){
8                if(jewels.charAt(j)==stones.charAt(i)){
9                    c++;
10                    break;
11                }
12            }
13        }
14        return c;
15    }
16}