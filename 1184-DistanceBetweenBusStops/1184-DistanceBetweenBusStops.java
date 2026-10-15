// Last updated: 10/15/2026, 4:34:06 PM
1class Solution {
2    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
3
4        int ck=0;
5        int t=0;
6        for(int d:distance){
7            t+=d;
8        }
9
10        int i=start;
11
12        while(i!=destination){
13            ck+=distance[i];
14            i=(i+1)%distance.length;
15        }
16
17        int ak=t-ck;
18
19        return Math.min(ck,ak);
20    }
21}