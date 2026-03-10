// Last updated: 3/10/2026, 3:22:57 PM
1class Solution {
2    public int minOperations(String s) {
3        StringBuilder s1=new StringBuilder();
4        StringBuilder s2=new StringBuilder();
5        for(int i=0;i<s.length();i++){
6            if(i%2==0){
7                s1.append("0");
8                s2.append("1");
9            }
10            else{
11                s1.append("1");
12                s2.append("0");
13            }
14        }
15            int c1=0,c2=0;
16            for(int i=0;i<s.length();i++){
17                if(s.charAt(i)!=s1.charAt(i))c1++;
18                if(s.charAt(i)!=s2.charAt(i))c2++;
19            }
20            return Math.min(c1,c2);
21        }
22
23    }
24