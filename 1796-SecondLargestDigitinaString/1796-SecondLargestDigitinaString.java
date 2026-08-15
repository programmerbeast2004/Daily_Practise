// Last updated: 8/15/2026, 5:04:17 PM
1class Solution {
2    public int secondHighest(String st) {
3        int l=-1;
4        int s=-1;
5        for(char ch:st.toCharArray()){
6            if(Character.isDigit(ch)){
7                int dt=ch-'0';
8                if(dt>l){
9                    s=l;
10                    l=dt;
11                }
12                else if(dt<l && dt>s){
13                    s=dt;
14                }
15            }
16        }
17        return s;
18    }
19}