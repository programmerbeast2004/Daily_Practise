// Last updated: 1/23/2026, 1:23:49 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        HashMap<Character,Character> m1 =new HashMap<>();
4        HashMap<Character,Character> m2=new HashMap<>();
5        for(int i=0;i<s.length();i++){
6            char c1=s.charAt(i);
7            char c2=t.charAt(i);
8            if(m1.containsKey(c1)&& m1.get(c1)!=c2){
9                return false;
10            }
11            else{
12                m1.put(c1,c2);
13            }
14            if(m2.containsKey(c2) && m2.get(c2)!=c1){
15                return false;
16            }
17            else{
18                m2.put(c2,c1);
19            }
20        }
21
22        return true;
23    }
24}