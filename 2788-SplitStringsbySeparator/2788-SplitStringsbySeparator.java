// Last updated: 3/26/2026, 6:21:10 PM
1class Solution {
2    public List<String> splitWordsBySeparator(List<String> words, char separator) {
3        List<String>res=new ArrayList<>();
4        for(String word:words){
5            String[] parts=word.split("\\"+separator);
6            for(String p:parts){
7                if(!p.isEmpty()){
8                    res.add(p);
9                }
10            }
11
12        }
13        return res;
14    }
15}