// Last updated: 5/27/2026, 12:30:38 AM
1class Solution {
2    public String capitalizeTitle(String title) {
3        String[] word=title.split(" ");
4        for(int i=0;i<word.length;i++){
5            String w=word[i].toLowerCase();
6            if(w.length()<=2){
7                word[i]=w;
8            }
9            else{
10                word[i]=Character.toUpperCase(w.charAt(0))+w.substring(1);
11            }
12            
13        }
14        return String.join(" ",word);
15    }
16}