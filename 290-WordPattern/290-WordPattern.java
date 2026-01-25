// Last updated: 1/25/2026, 7:14:51 PM
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        String[] word=s.split(" ");
4        if(word.length!=pattern.length()) return false;
5        HashMap<Character,String> m1=new HashMap<>();
6        HashMap<String,Character> m2=new HashMap<>();
7        for(int i=0;i<pattern.length();i++){
8            char c=pattern.charAt(i);
9            String w=word[i];
10            if(m1.containsKey(c) && !m1.get(c).equals(w)){
11                return false;
12            }
13            else{
14                m1.put(c,w);
15            }
16            if(m2.containsKey(w) && m2.get(w)!=c){
17                return false;
18            }
19            else{
20                m2.put(w,c);
21            }
22        }
23        return true;
24    }
25}