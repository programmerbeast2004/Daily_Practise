// Last updated: 12/2/2025, 10:12:32 PM
1class Solution {
2    public long maxRunTime(int n, int[] batteries) {
3        long te=0;
4        for(int bt:batteries){
5            te+=bt;
6        }
7        Arrays.sort(batteries);
8        for(int i=batteries.length-1;i>=0;i--){
9            if(batteries[i]>te/n){
10                te-=batteries[i];
11                n--;
12            }
13            else{
14                break;
15            }
16        }
17        return te/n;
18    }
19}