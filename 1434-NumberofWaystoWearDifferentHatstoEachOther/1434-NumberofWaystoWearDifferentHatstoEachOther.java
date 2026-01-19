// Last updated: 1/19/2026, 11:57:55 PM
1class Solution {
2    public int numberWays(List<List<Integer>> hats) {
3        int n = hats.size(), M = (int)1e9+7;
4        int[] mask = new int[41];
5        for (int i = 0; i < n; i++){
6            for (int h : hats.get(i)){
7                mask[h]|=1<<i;
8            }
9        }
10        int[] dp = new int[1<<n];
11        dp[0]=1;
12        for (int i = 0; i <= 40; i++){
13            for (int j = (1<<n)-1; j >= 0 && mask[i]>0; j--){
14                for (int k = 0; k < n; k++){
15                    if ((1<<k&j)==0 && (1<<k&mask[i])>0){
16                        dp[j|1<<k]+=dp[j];
17                        dp[j|1<<k]%=M;
18                    }
19                }
20            }
21        }
22
23        return dp[(1<<n)-1];
24    }
25}