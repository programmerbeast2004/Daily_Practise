// Last updated: 5/9/2026, 8:11:02 PM
1class Solution {
2    public int[] scoreValidator(String[] events) {
3        int score=0,count=0;
4        for(String event:events){
5            if(count==10){
6                break;
7            }
8            if(event.equals("W")){
9                count++;
10            }
11            else if(event.equals("WD") || event.equals("NB")){
12                score+=1;
13            }
14            else{
15                score+=Integer.parseInt(event);
16            }
17        }
18        return new int[]{score,count};
19    }
20}