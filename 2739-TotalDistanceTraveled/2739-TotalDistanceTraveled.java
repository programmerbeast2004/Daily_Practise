// Last updated: 10/15/2026, 12:16:36 PM
1class Solution {
2    public int distanceTraveled(int mainTank, int additionalTank) {
3        int dis=0;
4
5        while(mainTank>=5){
6            dis+=50;
7            mainTank-=5;
8
9            if(additionalTank>0){
10                mainTank++;
11                additionalTank--;
12            }
13        }
14        dis+=mainTank*10;
15
16        return dis;
17    }
18}