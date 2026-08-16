// Last updated: 8/16/2026, 8:33:04 AM
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int bi=-1;
4        int mi=Integer.MAX_VALUE;
5
6        for(int i=0;i<drones.length;i++){
7            int x=drones[i][0];
8            int y=drones[i][1];
9            int range=drones[i][2];
10
11            int d=Math.abs(x-target[0])+Math.abs(y-target[1]);
12
13            if(d<=range){
14                if(d<mi){
15                    mi=d;
16                    bi=i;
17                }
18            }
19        }
20        return bi;
21    }
22}