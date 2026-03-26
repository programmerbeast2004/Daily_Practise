// Last updated: 3/26/2026, 1:29:53 PM
1class Solution {
2    public String[] findWords(String[] words) {
3        String r1="qwertyuiop";
4        String r2="asdfghjkl";
5        String r3="zxcvbnm";
6        List<String>res=new ArrayList<>();
7        for(String word:words){
8            String w=word.toLowerCase();
9            if(check(w,r1)||check(w,r2)||check(w,r3)){
10                res.add(word);
11            }
12        }
13        return res.toArray(new String[0]);
14    }
15    public boolean check(String w,String r){
16        for(char c:w.toCharArray()){
17            if(r.indexOf(c)==-1){
18                return false;
19            }
20        }
21        return true;
22    }
23}