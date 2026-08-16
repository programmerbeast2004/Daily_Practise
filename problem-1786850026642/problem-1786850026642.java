// Last updated: 8/16/2026, 8:43:46 AM
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3        int maxl=0;
4        for(int l:lights){
5           maxl=Math.max(maxl,l); 
6        }
7        int ans=0;
8        for(int a:arrivalTime){
9            int r=a%period;
10            int wait;
11            if(r<maxl){
12                wait=0;
13            }
14            else{
15                wait=period-r;
16            }
17            ans=Math.max(ans,wait);
18        }
19        return ans;
20    }
21}