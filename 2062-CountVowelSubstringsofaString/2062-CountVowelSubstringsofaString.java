// Last updated: 10/24/2026, 2:28:37 PM
1class Solution {
2    public int countVowelSubstrings(String word) {
3        int c=0;
4        for(int i=0;i<word.length();i++){
5            Set<Character>set=new HashSet<>();
6            for(int j=i;j<word.length();j++){
7                char ch=word.charAt(j);
8
9                if("aeiou".indexOf(ch)==-1){
10                    break;
11                }
12                set.add(ch);
13
14                if(set.size()==5){
15                    c++;
16                }
17            }
18        }
19        return c;
20    }
21}