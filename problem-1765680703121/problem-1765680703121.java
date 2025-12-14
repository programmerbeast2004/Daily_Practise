// Last updated: 12/14/2025, 8:21:43 AM
1class Solution {
2    public String reverseWords(String s) {
3        String[] words=s.split(" ");
4        String v="aeiou";
5        int r=0;
6        for(char c:words[0].toCharArray()){
7            if(v.indexOf(c)!=-1){
8                r++;
9            }
10        }
11        for(int i=1;i<words.length;i++){
12            int ct=0;
13            for(char c:words[i].toCharArray()){
14                if(v.indexOf(c)!=-1){
15                    ct++;
16                }
17            }
18        
19            if(ct==r){
20                words[i]=new StringBuilder(words[i]).reverse().toString();
21            }
22        }
23    return String.join(" ", words);
24}
25}