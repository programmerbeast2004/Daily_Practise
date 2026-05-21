// Last updated: 5/21/2026, 10:11:25 PM
1class Solution {
2    public int heightChecker(int[] heights) {
3        int n=heights.length;
4        int[]e=new int[n];
5        int c=0;
6
7        for(int i=0;i<n;i++){
8            e[i]=heights[i];
9        }
10        Arrays.sort(e);
11        for(int i=0;i<n;i++){
12            if(heights[i]!=e[i]){
13                c++;
14            }
15        }
16        return c;
17        
18    }
19}