// Last updated: 2/22/2026, 8:42:34 AM
1class Solution {
2    public String maximumXor(String s, String t) {
3        int ones=0,zeros=0;
4        for(char c:t.toCharArray()){
5            if(c=='1')ones++;
6            else zeros++;
7        }
8        StringBuilder ans=new StringBuilder();
9        for(char c:s.toCharArray()){
10            if(c=='0'){
11                if(ones>0){
12                    ans.append('1');
13                    ones--;
14                }
15                else{
16                    ans.append('0');
17                    zeros--;
18                }
19            }
20            else{
21                if(zeros>0){
22                    ans.append('1');
23                    zeros--;
24                }
25                else{
26                    ans.append('0');
27                    ones--;
28                }
29            }
30        }
31        return ans.toString();
32    }
33}