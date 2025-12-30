// Last updated: 12/30/2025, 10:31:25 AM
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        if(trust.length==0 && n==1){
4            return 1;
5        }
6        int count[]=new int[n+1];
7        for(int[] i:trust){
8            count[i[0]]--;
9            count[i[1]]++;
10        }
11        for(int j=0;j<count.length;j++){
12            if(count[j]==n-1){
13                return j;
14            }
15        }
16        return -1;
17    }
18}