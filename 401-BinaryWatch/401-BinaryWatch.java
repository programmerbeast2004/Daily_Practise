// Last updated: 2/18/2026, 11:34:15 AM
1class Solution {
2    public List<String> readBinaryWatch(int turnedOn) {
3        List<String> res=new ArrayList<>();
4        for(int h=0;h<12;h++){
5            for(int m=0;m<60;m++){
6                int sum=Integer.bitCount(h)+Integer.bitCount(m);
7                if(sum==turnedOn){
8                    String time=h+":"+(m<10 ?"0"+m:m);
9                    res.add(time); 
10                }
11            }
12        }
13        return res;
14    }
15}