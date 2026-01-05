// Last updated: 1/5/2026, 11:12:14 AM
1class Solution {
2    public List<String> getLongestSubsequence(String[] words, int[] groups) {
3        ArrayList<String> res=new ArrayList<>();
4        res.add(words[0]);
5        for(int i=1;i<words.length;i++){
6            if(i>0){
7                if(groups[i]!=groups[i-1]){
8                    res.add(words[i]);
9                }
10            }
11        }
12        return res;
13        
14    }
15}