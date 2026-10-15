// Last updated: 10/15/2026, 7:27:41 AM
1class Solution {
2    public int sumCounts(List<Integer> nums) {
3        int sum=0;
4        int len=nums.size();
5
6        for(int i=0;i<len;i++){
7            boolean[] seen=new boolean[101];
8            int dis=0;
9
10            for(int j=i;j<len;j++){
11                int num=nums.get(j);
12                if(!seen[num]){
13                    seen[num]=true;
14                    dis++;
15                }
16                sum+=dis*dis;
17            }
18        }
19        return sum;
20    }
21}